#!/bin/bash

clear

echo "Enter number :"
read num

if [ $num -ge 0 ]
then 
echo "$num is positive"
else
echo "$num is negative"
fi