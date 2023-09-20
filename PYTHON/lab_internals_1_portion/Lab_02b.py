def binary_to_decimal(binary_str):
    try:
        decimal_num = int(binary_str, 2)
        return decimal_num
    except ValueError:
        return "Invalid binary input"


def octal_to_hexadecimal(octal_str):
    try:
        decimal_num = int(octal_str, 8)
        hexadecimal_str = hex(decimal_num)
        return hexadecimal_str
    except ValueError:
        return "Invalid octal input"


bin_str = input("Enter the Binary Number")
print(f"Binary to Decimal is {binary_to_decimal(bin_str)}")

oct_str = input("Enter the octal Number")
print(f"Octal to Decimal is {octal_to_hexadecimal(oct_str)}")
