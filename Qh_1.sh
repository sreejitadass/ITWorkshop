#!/bin/bash

#Prompt user to enter the directory name
read -p "Enter the required directory name: " directory

#Create the required "bin" directory
mkdir -p bin

#Find the C files in the input directory and its subdirectories
find "$directory" -type f-name "*.c"|while read -r file
do
	#Extract the file name without its extension
	filename=$(basename "$file".c)

	#Compile the C file and generate the executable in the bin directory created above
	gcc "$file" -o "bin/$filename"
done

echo "Compilation completed, executables are stored in the bin directory"
