@echo off
set JAVA_HOME=c:\Program Files\Java\jdk-17
set "BASE_DIR=%~dp0"
echo Compiling project.
javac -d . Main.java
echo Running class Main with args: a c abcdefg word abc zx wordzx abcdefgZX wordZXSD zx
java -cp %BASE_DIR% Task_1.Main a c abcdefg word abc zx wordzx abcdefgZX wordZXSD zx
pause