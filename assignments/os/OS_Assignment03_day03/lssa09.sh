#!/bin/bash

clear

echo "Enter number :"
read num

res=1
while [ $num -gt 0 ]
do
    res=`expr $res \* $num`
    num=`expr $num - 1`
done

echo "Factorial : $res"

exit