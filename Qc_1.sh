filename=Qa_1.sh

# Check if the file exists
if [ ! -f "$filename" ]; then
    echo "File '$filename' not found."
    exit 1
fi

# Count lines, words, and characters
line_count=$(wc -l < "$filename")
word_count=$(wc -w < "$filename")
char_count=$(wc -m < "$filename")

# Display the results
echo "File: $filename"
echo "Number of lines: $line_count"
echo "Number of words: $word_count"
echo "Number of characters: $char_count"
