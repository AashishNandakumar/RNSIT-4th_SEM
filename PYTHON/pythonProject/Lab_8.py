
class PalindromeChecker:
    def __init__(self, value):
        self.value = value

    def is_palindrome(self):
        pass


class StringPalindromeChecker(PalindromeChecker):
    def is_palindrome(self):
        cleaned_str = ''.join(self.value.lower().split())
        return cleaned_str == cleaned_str[::-1]


class IntegerPalindromeChecker(PalindromeChecker):
    def is_palindrome(self):
        num_str = str(self.value)
        return num_str == num_str[::-1]


def check_palindrome(obj):
    if isinstance(obj, PalindromeChecker):
        return obj.is_palindrome()
    else:
        return False


string_palindrome = StringPalindromeChecker("A man a plan a canal Panama")
print(f"Is the string a palindrome? {check_palindrome(string_palindrome)}")

integer_palindrome = IntegerPalindromeChecker(12321)
print(f"Is the integer a palindrome? {check_palindrome(integer_palindrome)}")


