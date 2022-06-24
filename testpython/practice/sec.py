secret_number = 6 # secret number
guess_count = 0
guess_limit = 3
while guess_count < guess_limit:
    guess = int(input('guess: '))
    guess_count += 1
    if guess == secret_number:
        print("you won")
        break
    elif guess_count == 1:
        print("try 2nd time")
    elif guess_count == 2:
        print("try 3rd time")
    elif guess_count == 3:
        print("your finished your attempts, try ones again from start")
    else:
        print("ok")