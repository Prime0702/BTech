#!/bin/bash
if [ $# -eq 0 ]; then
    echo "Usage: $0 <number>"
    exit 1
fi
for i in $(seq 1 10); do
    echo "$1 * $i = $(($1 * i))"
done
