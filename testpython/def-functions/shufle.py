mylist=[1,2,3,4,56,7]
from random import shuffle
def shuffle_list(mylist):
	shuffle(mylist)
	return mylist
result=shuffle_list(mylist)
print(result)