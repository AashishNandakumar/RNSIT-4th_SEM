roman_to_int = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}


def roman_to_integer(roman_str):
    total = 0
    prev_val = 0

    for numeral in reversed(roman_str):
        value = roman_to_int[numeral]

        if value < prev_val:
            total -= value
        else:
            total += value

        prev_val = value

    return total


roman_numeral = input("Enter a roman numeral: ")
print(f" In integer: {roman_to_integer(roman_numeral)}")
