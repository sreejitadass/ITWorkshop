#!/bin/bash

# Read the filename from the user input
read -p "Enter the file name: " filename

# Check if the file exists
if [ -e "$filename" ]; then
   echo "File '$filename' exists. Displaying its content: "
   cat "$filename"
else
   echo "File '$filename' does not exist.Creating a new file."
   touch "$filename"
fi
