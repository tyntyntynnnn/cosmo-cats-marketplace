@echo off
set DIR=%~dp0
set GRADLE_WRAPPER_DIR=%DIR%gradle\wrapper
java -classpath "%GRADLE_WRAPPER_DIR%\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
