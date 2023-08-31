#!/bin/bash
# cal.sh: A calendar generator.
if [ $# -eq 0 ];then
    echo "Usage: month1 [[month2] [month3] ...]"
    exit 1
fi
for month in $*;do
    bash cal.sh $month `date +%Y`
done
