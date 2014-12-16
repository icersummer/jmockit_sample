使用mock测试的几点好处：

a、能够帮助我们解耦设计，即以接口设计为中心。

b、在使用其他对象的情况。通过为mock设置期望的行为，可以验证我们的代码是否正确。

c、使你的测试运行的更快。通过mock数据库，通等接口，我们可以避免耗时的连接。

d、可以推迟我们要实现的类。因为我们可以通过mock去模拟接口的实现，所以前期我们可以不用现实现接口。

e、可以测试那些不太容易发生，不太可能和一些异常情况，比如我们可以mock 抛出Exception。

=========

jmockit出现java.lang.NoClassDefFoundError: org.junit.runner.Runner异常的原因
使用jmockit，不要使用jre，要用jdk，否则，可能出现比如java.lang.NoClassDefFoundError: org.junit.runner.Runner