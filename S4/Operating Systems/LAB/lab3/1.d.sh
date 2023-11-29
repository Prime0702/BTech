#!/bin/sh
read -p "Enter number 1: " n1
read -p "Enter number 2: " n2
echo "Before Swaping: n1 = $n1, n2 = $n2"
n1=$((n1+n2))
n2=$((n1-n2))
n1=$((n1-n2))
echo "After Swaping: n1 = $n1, n2 = $n2"
