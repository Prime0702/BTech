#!/bin/bash
gcd() {
    if [ $1 -eq 0 ]; then
        echo $2
    else
        gcd $(( $2 % $1 )) $1
    fi
}
if [ $# -ne 2 ]; then
    echo "Usage: $0 <number1> <number2>"
    exit 1
fi
gcd $1 $2
