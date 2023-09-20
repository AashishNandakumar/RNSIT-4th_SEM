test1 = float(input("Enter score for test 1: "))
test2 = float(input("Enter score for test 2: "))
test3 = float(input("Enter score for test 3: "))

avg1 = (test1 + test2 + test3) / 3

best_avg = max(avg1, (test1 + test2)/2, (test2 + test3)/2, (test1 + test3)/2)

print(f"The best of 2 avg marks is: {best_avg}")