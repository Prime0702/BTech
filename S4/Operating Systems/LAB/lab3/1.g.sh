#!/bin/sh
if [ -f $1 ] && [ -f $2 ]
then
    cat $1 $2 > $3
else
    echo "File not found"
fi