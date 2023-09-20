def fibonacci(n):
    if n <= 0:
        return "N must be greater than 0"
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        fib_sequence = [0, 1]
        for i in range(2, n):
            next_fib = fib_sequence[i-1] + fib_sequence[i-2]
            fib_sequence.append(next_fib)
        return fib_sequence


n = int(input("Enter a value for n: "))
res = fibonacci(n)

if isinstance(res, list):
    print(f"Fibonacci sequence of {n}: {res} ")
else:
    print(res)
