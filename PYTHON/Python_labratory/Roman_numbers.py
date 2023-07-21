user_dict={'I':1,'V':5,'X':10,'C':100,'L':50}
def roman_to_decimal(user_input):  # LIV
    res=0
    for i in range(len(user_input)-1):
        if(user_dict[user_input[i]]<user_dict[user_input[i+1]]):
            res-=user_dict[user_input[i]]
        else:
            res+=user_dict[user_input[i]]
    res+=user_dict[user_input[-1]]
    return res
user_input=input("Ehter a number: ")
res=roman_to_decimal(user_input)
print(res)


