package sel2in;

public class Sleep{
	public static void main(String []a){
		String errStr = "Start error";
		long slp = 1000l;
		int nanos = 0;
		boolean q = false;
		boolean sts = false;
		boolean stm = false;
		try{
			if(a == null || a.length ==0){
				a = new String[]{"10000"};
			}

			for(int i = 0; i < a.length; i++){
				String s = a[i];
				if(s.equals("q") || s.equals("quiet") || s.equals("/quiet") || s.equals("-quiet")){
					q = true;
				}else if(sts == false || stm == false){
					try{
						long v = Long.parseLong(s);
						if(sts == false){
							slp = v;
							sts = true;
						}else if(stm == false){
							nanos = (int)v;
							stm = true;
						}
					}catch(Throwable e1){
						System.err.println("Cant parse args :" + (i+1 ) + ", value :" + a[i]+  ", will try to parse any other(s)");
					}
				}

			}
			errStr = "before sleep args 0 :" + a[0];
			if(q == false){
				System.out.println("Utility to sleep for a user defined number of milli and nano seconds. \nUsage : call from a batch file with params in any order :java sel2in.Sleep q <sleep-milli-seconds> <sleep-nano-seconds : 0-999999>\n example: \njava sel2in.Sleep q 2000\n\t\tWill sleep for 2 seconds and not print this message.\njava sel2in.Sleep 3500 500\n\t\tWill sleep for 3.5 seconds and 500 nano seconds (accuracy up to your OS)  ");
				System.out.println("Sleeping for " + ((float)slp/1000) + " seconds and " + nanos + " nanoseconds.");
			}
			Thread.sleep(slp, nanos);
			if(q == false){
				System.out.println("Done - http://sel2in.com - java, windows, android software.");
			}
		}catch(Throwable e){
			System.err.println("Err :" + e + ", "  + errStr);
		}
	}
}