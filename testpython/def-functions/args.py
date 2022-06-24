def myfunc(*args):#you can write after * anything to use the function, dont need def og number of varible to be sum
	    print(args)#args=arbitary numbers
	    return sum(args)*0.05

print(myfunc(222,4,5,7))

def myfunc(*spam):
	for items in spam:
		print(items)
print(myfunc(222,4,5,7))