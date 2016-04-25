# java Sleep For Batch
# Utility 

Utility to sleep for a user defined (parameterised) number of milli and nano seconds. Suggest to keep the jar from this project (slp.jar can download it above) in your windows or in a folder in your path.

* Usage : call from a batch file with params in any order :

``` shell
java sel2in.Sleep q <sleep-milli-seconds> <sleep-nano-seconds : 0-999999>
```

* Examples: 

``` shell
java sel2in.Sleep q 2000
``` 
Will sleep for 2 seconds and not print this message.

``` shell
java sel2in.Sleep 3500 500
``` 
Will sleep for 3.5 seconds and 500 nano seconds (accuracy up to your OS).

*[sel2in](http://sel2in.com "sel2in's Homepage")*

![sel2in logo](http://sel2in.com/imgs/ThemeProg.jpg)