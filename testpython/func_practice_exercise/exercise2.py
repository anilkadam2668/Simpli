def animal_crackers(text):
	worldlist=text.split()
	print(worldlist[1])
	return worldlist[0][0]==worldlist[1][0]
print(animal_crackers("lovely Lie"))

#same code lit change
def animal_crackers(text):
	worldlist=text.lower().split()#upper also used
	print(worldlist[1])
	return worldlist[0][0]==worldlist[1][0]
print(animal_crackers("lovely lie"))