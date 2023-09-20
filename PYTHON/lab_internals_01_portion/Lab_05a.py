import re


def is_phone_number(text):       # without regex
    if len(text) != 12:
        return False
    for i in range(0, 3):
        if not text[i].isdigit():
            return False
    if text[3] != '-':
        return False
    for i in range(4, 7):
        if not text[i].isdigit():
            return False
    if text[7] != '-':
        return False
    for i in range(8, 12):
        if not text[i].isdigit():
            return False

    return True


def is_phone_number_regex(text):
    pattern = r'\d{3}-\d{3}-\d{4}'
    match = re.match(pattern, text)

    return bool(match)


phone_num = input("Enter a phone no: ")

if is_phone_number(phone_num) and is_phone_number_regex(phone_num):
    print(f"{phone_num} is a valid phone no")
else:
    print(f"{phone_num} is not a valid phone no")
