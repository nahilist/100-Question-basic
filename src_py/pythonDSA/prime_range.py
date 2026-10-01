       
L = int(input("Enter lower limit: "))
R = int(input("Enter upper limit: "))

def isPrime(n):
    if n < 2:
        return False

    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False

    return True


for i in range(L, R + 1):
    if isPrime(i):
        print(i, end=" ")
