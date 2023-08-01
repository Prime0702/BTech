#!/bin/sh
if [ $# -ne 1 ]
then
    echo "Usage: $0 <file>"
    exit 1
fi
if [ ! -f $1 ]
then
    echo "$1 is not a file"
    exit 1
fi
if [ ! -r $1 ]
then
    echo "$1 is not readable"
    exit 1
fi
min=$(head -n 1 $1)
max=$(head -n 1 $1)
while read line
do
    if [ $line -lt $min ]
    then
        min=$line
    fi
    if [ $line -gt $max ]
    then
        max=$line
    fi
done < $1
echo "Min: $min"
echo "Max: $max"
