#!/bin/sh
mkdir -p ./Test1/Test2/Test3
ls -l > ./Test1/Test2/Test3/file1
cd ./Test1/Test2/Test3
cat file1 | tr -s " "| cut -d " " -f 10 
cat file1 | tr -s " "| cut -d " " -f 10 | grep -i ^d
cat file1 | tr -s " "| tr " " "\n"
cd ~/os/lab2/
