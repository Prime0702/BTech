#!/bin/sh
while [ 1 -eq 1 ]
do
    echo "1: +"
    echo "2: -"
    echo "3: *"
    echo "4: /"
    echo "5: %"
    echo "6: ++"
    echo "7: --"
    echo "8: Exit"
    read -p "Enter your choice: " choice
    case $choice in
        1)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Sum: $(($num1+$num2))"
            ;;
        2)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Difference: $(($num1-$num2))"
            ;;
        3)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Product: $(($num1*$num2))"
            ;;
        4)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Quotient: $(($num1/$num2))"
            ;;
        5)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Remainder: $(($num1%$num2))"
            ;;
        6)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Sum: $(($num1++$num2))"
            ;;
        7)
            read -p "Enter first number: " num1
            read -p "Enter second number: " num2
            echo "Difference: $(($num1--$num2))"
            ;;
        8)
            exit 0
            ;;
        *)
            echo "Invalid choice"
            ;;
    esac
done