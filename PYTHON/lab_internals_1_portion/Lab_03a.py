sequence = input("Enter a string: ")

word_count = 0
digit_count = 0
uppercase_count = 0
lowercase_count = 0

for char in sequence:
    if char.isalpha():
        if char.isupper():
            uppercase_count += 1
        else:
            lowercase_count += 1
    elif char.isdigit():
        digit_count += 1

words = sequence.split()
word_count = len(words)

print(f"no of words: {word_count}")
print(f"no of digits: {digit_count}")
print(f"no of uppercase letters: {uppercase_count}")
print(f"no of lowercase letters: {lowercase_count}")

