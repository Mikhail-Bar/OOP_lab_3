@echo off
set JAVA_HOME=c:\Program Files\Java\jdk-17
set "BASE_DIR=%~dp0"
echo Compiling project.
javac -d . %BASE_DIR%Main.java %BASE_DIR%QuickSort.java %BASE_DIR%SelectionSort.java %BASE_DIR%SortAlg.java
echo Running class Main with args: a c abcdefg word abc zx wordzx abcdefgZX wordZXSD zx
java -cp %BASE_DIR% Task_4.Main a c abcdefg word abc zx wordzx abcdefgZX wordZXSD zx
pause