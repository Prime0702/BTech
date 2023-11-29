#!/bin/bash
if [ $# -ne 1 ]; then
    echo "Usage: $0 file"
    exit 1
fi
if [ ! -f $1 ]; then
    echo "File $1 does not exist"
    exit 2
fi
if [ ! -r $1 ]; then
    echo "File $1 is not readable"
    exit 3
fi
n=$(head -n 1 $1)
for i in $(seq 1 10); do
    echo "$n * $i = $((n * i))"
done
