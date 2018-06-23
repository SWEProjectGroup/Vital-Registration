while True:
    n = eval(input("Enter a decial number:"))
    list = []
    while n != 0:
        r = n % 2
        n = n // 2
        list.append(r)
    while len(list) % 8 != 0:
        list.append(0)
    binary = list[::-1]
    print(''.join(str(j) for j in binary))
