#!/bin/bash
read -p "Enter the number of rows:" rows
read -p "Enter the number of columns:" cols
read -p "Enter the elements of first matrix:" -a matrix1
echo "Matrix"
for((i=0; i<rows; i++))
do
  for((j=0; j<cols; j++))
  do
    index=$((i*cols+j))
    echo -n "${matrix1[index]} "
  done
  echo
done
echo "Transpose of matrix"
for((i=0; i<cols; i++))
do
  for((j=0; j<rows; j++))
  do
    index=$((j*cols+i))
    echo -n "${matrix1[index]} "
  done
  echo
done