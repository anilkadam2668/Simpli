command = ""
started= False
while True:
    command = input(">").lower()
    if command == "start":
        if started:
            print("car already started")
        else:
            started=True
        print("car started")
    elif command == "stop":
        if not started:
            print("car already stopped")
        else:
            started=False
            print("car stopped")
    elif command == "help":
        print("""start- start the car, stop- stop the car, quit- to quit""")
    elif command == "quit":
        print("Your out of the game")
        break
    else:
        print("sorry, i don't understand")
