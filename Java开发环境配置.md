## win 环境

### 01 JDK & Jre

安装

https://www.runoob.com/java/java-environment-setup.html

Q&A

Q: jdk安装好之后，也配置好了环境变量，打开cmd输入javac可以跳出相关信息，可是输入java却一直提示：系统找不到文件C:\ProgramData\Oracle\Java\javapath\java.exe

A: 把%JAVA_HOME%\bin放在path路径最前面，发现就可以

### 02 Maven

配置

https://blog.csdn.net/huo920/article/details/82082403#Maven_17

### 03 Tomcat

安装

https://www.jianshu.com/p/5020005cf672

### 04 MySQL

[Windows下MySQL下载安装、配置与使用](https://www.cnblogs.com/dtting/p/7691202.html)

问题补充 https://blog.csdn.net/pan15125284/article/details/91410965

解决：1、net stop mysql

​          2、mysqld --console --skip-grant-tables --shared-memory（忽略权限）mysql8.0.16用这个 

​          3、重新打开另一个cmd



update mysql.user set authentication_string="password" where user="root";



ERROR 2003 (HY000): Can't connect to MySQL server on 'localhost' (10061)



navicat

https://blog.csdn.net/a599174211/article/details/82795658



### 05 IDEA

注意这两处的 JDK 配置

![Settings](https://raw.githubusercontent.com/yefcion/PicData/master/img/20190918211658.png)



插件：

Lombok

alibaba java code guidlines

### 06 MMS

#### Spring

#### SpringMVC

#### MyBatis







## Linux 环境

