#!/bin/sh
if [ -f $1 ]; then
    grep -E '1|2|3|4|5|6|7|8|9|0' $1
else
    echo "File does not exist"
    exit 1
fi
