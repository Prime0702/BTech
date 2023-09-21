#!/bin/bash
if [ $# -ne 1 ]
then
    echo "Usage: $0 <number>"
    exit 1
fi
for i in $(seq $1 -1 1); do
    for j in $(seq 1 $i); do
        echo -n "*"
    done
    echo
done
for((i=1; i<=$1; i++))
do
  for((j=1; j<=$1 - i; j++))
  do
    echo -n "  "
  done
  for((j=1; j<=2*i - 1; j++))
  do
    echo -n "* "
  done
  echo
done
