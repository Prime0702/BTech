#!/bin/sh
read -p "Enter number 1: " num1
read -p "Enter number 2: " num2
read -p "Enter number 3: " num3
read -p "Enter number 4: " num4
echo "Sum of all numbers: $((num1+num2+num3+num4))"
echo "Average of all numbers: $(((num1+num2+num3+num4)/4))"
echo "Product of all numbers: $((num1*num2*num3*num4))"