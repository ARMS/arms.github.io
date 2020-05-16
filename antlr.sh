#!/usr/bin/env bash

antlr="/Users/ajc/.vscode/extensions/mike-lischke.vscode-antlr4-2.2.3/antlr/antlr4-4.7.2-SNAPSHOT-complete.jar"

export CLASSPATH=".:$antlr:$CLASSPATH"
antlr4="java -jar $antlr"
grun="java org.antlr.v4.gui.TestRig"

cd /Users/ajc/Documents/projects/arms/arms.github.io/antlr
mkdir -p generated
$antlr4 arms.g4 -o generated
cd generated
javac arms*.java
$grun arms program -gui ../../examples/rover.arms
# $grun --help
