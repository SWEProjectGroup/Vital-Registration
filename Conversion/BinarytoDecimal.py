while True:
    n = input("Enter the binary number")
    decimal = 0
    i = 7
    for num in n:
        if num == "1":
            decimal += 2**i
        i -= 1
        
    print(decimal)
