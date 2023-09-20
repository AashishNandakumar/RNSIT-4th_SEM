import re


def find_phone_and_email(text):
    phone_pattern = r'\+?\d{10,12}'
    email_pattern = r'\S+\@\S+'

    phones = re.findall(phone_pattern, text)
    emails = re.findall(email_pattern, text)

    return phones, emails


with open("Z_demo_file_for_05b.txt", "r") as file:
    file_contents = file.read()

phone_num, email_add = find_phone_and_email(file_contents)

print("Phone numbers")
for phone in phone_num:
    print(phone)

print("Email address")
for email in email_add:
    print(email)

