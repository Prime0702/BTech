#!/bin/bash
read -p "Enter the array elements:" -a arr

sum=0
n=${#arr[@]}
for i in ${arr[@]}
do
  sum=$((sum + i))
done
avg=$(echo "$sum / $n" | bc)

echo "The average of the $n numbers is: $avg"
