#!/bin/bash

file="Hello.sh"

while read -r line; do
    echo -e "$line\n"
done <$file 
