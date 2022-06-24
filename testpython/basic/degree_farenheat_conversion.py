celcius=[0,10,20,45,50]
fahrenheit=[]
for temp in celcius:
	fahrenheit.append(((9/5)*temp+32))
print(fahrenheit)
print("\t")

#in one line
fahrenheit=[((9/5)*temp+32) for temp in celcius]
print(fahrenheit)

