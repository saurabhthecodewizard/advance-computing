#!/bin/bash

clear

echo "Enter number :"
read num

a=0

b=1

i=0

while [ $i -lt $num ]
do
    echo "$a"
    c=`expr $a + $b`
    a=$b
    b=$c
    i=`expr $i + 1`
done