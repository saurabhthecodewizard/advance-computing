#!/bin/bash

clear

echo "Enter number :"
read num

for i in {1..10..1}
do
    res=`expr $num \* $i`
    echo "$res"
done