def compare(s, p):
    count = 0
    n = min(len(s), len(p))
    for i in range(n):
        if s[i] == p[i]:
            count += 1
    return count


s1 = input("Enter string1: ")
s2 = input("Enter string2: ")

m = max(len(s1), len(s2))
count = compare(s1, s2)

similarity = (count/m)*100
print(f"The total matched characters: {count} The similarity:  {similarity}%")
