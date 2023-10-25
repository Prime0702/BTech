#!/bin/sh
read -p "Enter length: " l
read -p "Enter breadth: " b
echo "Area of rectangle: $((l*b))"
echo "Perimeter of rectangle: $((2*(l+b)))"
read -p "Enter radius: " r
Area=$(echo "3.14 * $r * $r" | bc)
echo "Area of circle: $Area"
Circumference=$(echo "2 * 3.14 * $r" | bc)
echo "Circumference of circle: $Circumference"
