def player_guess():
	guess=''
	while guess not in ['0','2','1']:
		guess=input("pick a num: 0,1,or 2")
	return int(guess)
        
print(player_guess())