#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UNIX
##
##############################################################################

DIR="$(cd "$(dirname "$0")" && pwd)"
GRADLE_WRAPPER_DIR="$DIR/gradle/wrapper"

JAVA_EXEC="java"

exec "$JAVA_EXEC" -classpath "$GRADLE_WRAPPER_DIR/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
