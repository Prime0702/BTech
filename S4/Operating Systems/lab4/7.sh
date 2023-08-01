#!/bin/bash
factorial() {
    if [ $1 -eq 1 ]
    then
        echo 1
    else
        local temp=$[ $1 - 1 ]
        local result=$(factorial $temp)
        echo $[ $result * $1 ]
    fi
}
if [ $# -eq 1 ]
then
    factorial $1
else
    echo "Usage: test.sh number"
fi
