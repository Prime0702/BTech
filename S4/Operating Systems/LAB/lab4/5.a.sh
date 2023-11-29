#!/bin/bash
read -p "Enter number for multiplication table: " n
for i in $(seq 1 10); do
    echo "$n * $i = $((n * i))"
done