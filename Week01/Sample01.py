temp  = int(input("Enter any number between 0 and 100 : "))

while(True):
    guess = int(input("Guess : "))
    if temp < guess :
        print("DOWN")
    elif temp > guess :
        print("UP")
    else:
        print("BINGO")
        break

print("Game is over")

