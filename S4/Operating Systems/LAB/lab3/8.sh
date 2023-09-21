#!/bin/bash
read -p "Enter the number of rows:" rows
read -p "Enter the number of columns:" cols
read -p "Enter the elements of first matrix:" -a matrix1
read -p "Enter the elements of second matrix:" -a matrix2
echo "First matrix"
for((i=0; i<rows; i++))
do
  for((j=0; j<cols; j++))
  do
    index=$((i*cols+j))
    echo -n "${matrix1[index]} "
  done
  echo
done
 
echo "Second matrix"
for((i=0; i<rows; i++))
do
  for((j=0; j<cols; j++))
  do
    index=$((i*cols+j))
    echo -n "${matrix2[index]} "
  done
  echo
done
 
k=0
matrix3=()
for((i=0; i<rows; i++))
do
  for((j=0; j<cols; j++))
  do
    index=$((i*cols+j))
    matrix3[k]=$((${matrix1[index]} + ${matrix2[index]}))
    k=$((k+1))
  done
done
echo "Addition of two matrix"
for((i=0; i<rows; i++))
do
  for((j=0; j<cols; j++))
  do
    index=$((i*cols+j))
    echo -n "${matrix3[index]} "
  done
  echo
done