#!/bin/bash

clear

echo -n "enter the filepath : "
read filepath

if [ -e $filepath ] # if filepath is valid
then
    if [ -f $filepath ] # if filepath is a reg file
    then
        echo "$filepath is a regular file, its contents are : "
        cat $filepath
    elif [ -d $filepath ] # if filepath is a dir file
    then
        echo "$filepath is a dir file, its contents are : "
        ls -l $filepath
    else
        echo "$filepath is neither reg file nor dir file"   
    fi
else    #if filepath is not valid
    echo "$filepath is invalid filepath"
fi

exit