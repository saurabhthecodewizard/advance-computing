#!/bin/bash

clear

echo -n "Enter name of the file:"

read filename

if [ -f $filename ] then

echo 'Last modification time is '`ls -lt $filename | tr -s " " "," | cut -d "," -f7` 

else

echo "File not exist"

fi