#!/bin/bash

#Enter a file name ny user
read -p "Enter the file name: "filename

#Check if the file exists
if [ -f "$ilename" ]; then

	tr '[:upper]''[:lower]' < "$filename" | sed 's/[[:punct:]]//g' | tr -s '''\n' | sort | uniq -c | sort -nr
else
	echo "File not found"
fi 
