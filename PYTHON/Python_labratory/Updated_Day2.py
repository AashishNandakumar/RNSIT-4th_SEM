# check for palindrome

ptr = input("Enter number: ")
revPtr = ptr[::-1]

if ptr == revPtr:
    print("They are palindrome")
else:
    print("They are not palindrome")
# occurences of numbers
for i in range(len(ptr)):
    count=ptr.count(ptr[i])
    if( ptr[i] not in ptr[i+1::]):
        print("count of {} is {}".format(ptr[i],count))