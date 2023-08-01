#!/bin/sh
if [ $# -ne 1 ]; then
    echo "Usage: $0 <number>"
    exit 1
fi
# for loop
fact=1
for i in `seq 1 $1`; do
    fact=$((fact*i))
done
echo "Factorial of $1 is $fact"
# while loop
fact=1
i=1
while [ $i -le $1 ]; do
    fact=$((fact*i))
    i=$((i+1))
done
echo "Factorial of $1 is $fact"
