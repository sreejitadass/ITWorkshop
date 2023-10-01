#!/bin/bash

#Get the filename without extension
read -p "Enter the filename: "filename

#Get the filename without extension
filename="${1%.*}"

#Compile the C file
gcc $1 -o $filename

#Check if compilation was successful
if [ $ ? -eq 0 ]
	echo "Compilation successful and filename generated"
else
	echo "Compilation failed"
fi
