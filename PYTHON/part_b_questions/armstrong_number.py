def is_armstrong_number(num):
    str_num = str(num)

    num_len = len(str_num)

    armstrong_sum = 0
    for digit in str_num:
        armstrong_sum += int(digit) ** num_len

    return armstrong_sum == num


num = int(input("Enter number"))
print(f"The give number is an Armstrong number: {is_armstrong_number(num)}")
