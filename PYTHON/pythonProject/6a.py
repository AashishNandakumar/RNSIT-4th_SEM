file_name = input("Enter the filename: ")
number_of_lines = int(input("Enter number of lines to be read: "))

file = open(file_name, "r")

for i in range(number_of_lines):
    line = file.readline()
    print(f"line {i+1}: {line}")

file.seek(0)
count = 0

word_checker = input("Enter word: ")

for line in file:
    words = line.split()
    count += words.count(word_checker)

print(f"{word_checker} appears - {count} times")
