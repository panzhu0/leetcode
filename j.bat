@REM 用来构建自己写的JAVA LEETCODE 自动编译
@echo off

@REM 设置控制台代码页为 UTF-8 [临时]
chcp 65001 > nul  

if "%~1" == "" (
    echo 错误:需要一个参数 [文件夹]
)

@REM 编译
javac -d target %1\*.java -encoding UTF-8

@REM 目前好像只支持单层文件夹
