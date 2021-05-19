See [issue 1889 for chisel3](https://github.com/chipsalliance/chisel3/issues/1889)
```
sbt "testOnly firrtl_backend_confusing_error_reproduction_package.firrtl_backend_confusing_error_reproduction_module_Tester"
```

Example log:
```
sbt:0AME[36m> testOnly firrtl_backend_confusing_error_reproduction_package.firrtl_backend_confusing_error_reproduction_module_Tester
[info] compiling 1 Scala source to /home/armleo/Desktop/firrtl_backend_confusing_error/target/scala-2.12/classes ...
[info] compiling 1 Scala source to /home/armleo/Desktop/firrtl_backend_confusing_error/target/scala-2.12/test-classes ...
Elaborating design...
Done elaborating.
[error] 	at 
Elaborating design...
Done elaborating.
[info] firrtl_backend_confusing_error_reproduction_module_Tester:
[info] firrtl_backend_confusing_error_reproduction_module_Test
[info] - should (with firrtl) *** FAILED ***
[info]   java.lang.Exception: Problem with compilation
[info]   at chisel3.iotesters.setupFirrtlTerpBackend$.apply(FirrtlTerpBackend.scala:148)
[info]   at chisel3.iotesters.Driver$.$anonfun$execute$2(Driver.scala:52)
[info]   at scala.runtime.java8.JFunction0$mcZ$sp.apply(JFunction0$mcZ$sp.java:23)
[info]   at logger.Logger$.$anonfun$makeScope$2(Logger.scala:166)
[info]   at scala.util.DynamicVariable.withValue(DynamicVariable.scala:62)
[info]   at logger.Logger$.makeScope(Logger.scala:164)
[info]   at logger.Logger$.makeScope(Logger.scala:127)
[info]   at chisel3.iotesters.Driver$.$anonfun$execute$1(Driver.scala:39)
[info]   at scala.runtime.java8.JFunction0$mcZ$sp.apply(JFunction0$mcZ$sp.java:23)
[info]   at scala.util.DynamicVariable.withValue(DynamicVariable.scala:62)
[info]   ...
[info] firrtl_backend_confusing_error_reproduction_module_Test
[info] - should (with verilator) *** FAILED ***
[info]   firrtl.passes.CheckInitialization$RefNotInitializedException: : [module firrtl_backend_confusing_error_reproduction_module]  Reference io is not fully initialized.
[info]    : io.some_out <= VOID
[info]   ...
[info] ScalaTest
[info] Run completed in 4 seconds, 298 milliseconds.
[info] Total number of tests run: 2
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 0, failed 2, canceled 0, ignored 0, pending 0
[info] *** 2 TESTS FAILED ***
[error] Failed: Total 2, Failed 2, Errors 0, Passed 0
[error] Failed tests:
[error] 	firrtl_backend_confusing_error_reproduction_package.firrtl_backend_confusing_error_reproduction_module_Tester
[error] (Test / testOnly) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 24 s, completed May 19, 2021 11:15:51 PM
```