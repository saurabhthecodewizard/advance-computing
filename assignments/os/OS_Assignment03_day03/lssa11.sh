#!/bin/bash

clear

echo "Enter salary :"
read salary

da=40
hra=20

gs=$((salary + ((salary/100)*da) - ((salary/100)*hra) ))

echo "Gross salary : $gs"

exit