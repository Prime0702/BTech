#!/bin/bash
if [ $# -ne 1 ]; then
    echo "Usage: $0 <number>"
    exit 1
fi
for i in $(seq 2 $1); do
    for j in $(seq 2 $i); do
        if [ $((i % j)) -eq 0 ]; then
            break
        fi
    done
    if [ $i -eq $j ]; then
        echo $i
    fi
done
