#!/bin/bash

clear

i=1
while [ $i -le 5 ]
do
    j=0
    while [ $j -lt $i ]
    do
        echo -n " * "
        j=`expr $j + 1`
    done
    echo " "
    i=`expr $i + 1`
done

exit