#!/bin/bash
if [ $# -ne 1 ]; then
    echo "Usage: $0 <number>"
    exit 1
fi
a=0
b=1
for i in $(seq 1 $1); do
    echo $a
    c=$((a + b))
    a=$b
    b=$c
done