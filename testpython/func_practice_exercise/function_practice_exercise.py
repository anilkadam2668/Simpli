def lesser_of_events(a,b):
	if a%2==0 and b%2==0:
		if a<b:
			result=a
		else:
			result=b
	else:
		if a>b:
			result=a
		else:
			result=b
	return result
print(lesser_of_events(4,2))
print(lesser_of_events(7,5))#odd nums

#Above code in short using min,max commands
def lesser_of_events(a,b):
	if a%2==0 and b%2==0:
		result=min(a,b)
	else:
		result=max(a,b)
	return result
print(lesser_of_events(4,6))
print(lesser_of_events(9,3))#odd nums