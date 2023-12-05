#!/bin/bash

clear

while [ true ]
do

    clear

    echo "***Menu***"
    echo "1.Date"
    echo "2.Calendar"
    echo "3.ls"
    echo "4.Pwd"
    echo "5.Exit"

    echo -n "Enter choice :"
    read choice

    if [ $choice -eq 5 ]
    then
        exit
    fi

    case $choice in
    1)
        echo -n "Date : "
        date +"%d / %m / %Y"
        ;;

    2)
        echo "Calendar : "
        cal
        ;;

    3)
        pwd
        ;;

    4)
        ls
        ;;

    *)
        echo "Invalid choice..."
        ;;

    esac

    echo "Press enter to continue..."
    read enter


done