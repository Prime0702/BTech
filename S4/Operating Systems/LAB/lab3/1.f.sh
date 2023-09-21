#!/bin/sh
read -p "Enter String 1: " s1
read -p "Enter String 2: " s2
s3="$s1$s2"
echo "Concatenated String: $s3"
echo "Length of String 3: ${#s3}"
