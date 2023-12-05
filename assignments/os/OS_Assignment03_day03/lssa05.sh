#!/bin/bash

clear

echo -n "Enter first number :"
read n1

echo -n "Enter second number :"
read n2

echo -n "Enter third number :"
read n3

if [ $n1 -gt $n2 -a $n1 -gt $n3 ]
then
echo "$n1 is greater"
elif [ $n2 -gt $n1 -a $n1 -gt $n3 ]
then
echo "$n2 is greater"
else
echo "$n3 is greater"
fi