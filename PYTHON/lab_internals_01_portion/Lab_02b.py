num = int(input("Enter a number: "))

num_str = str(num)

is_palindrome = num_str == num_str[::-1]

digit_count = dict()
for digit in num_str:
    if digit.isdigit():
        if digit in digit_count:
            digit_count[digit] += 1
        else:
            digit_count[digit] = 1

if is_palindrome:
    print(f"{num} is a palindrome")
else:
    print(f"{num} is a palindrome")


print("digit count: ")
for digit, count in digit_count.items():
    print(f"Digit {digit}: {count} times")