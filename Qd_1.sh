#!/bin/bash

#Prompt user to enter a filename
read -p "Enter the file name: " filename

#Check if the file exists
if [ -f "$filename" ]; then
	#use tac command to reverse the contents
 	tac "$filename"
else
	echo "File not found"

fi

