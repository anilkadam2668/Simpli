def even_check(num):
	return num%2==0
print(even_check(20))

def check_even_list(num_list):
	for num in num_list:
		if num%2==0:
			return True
	else:
			pass#if you writ false here it will check first index and then returns false ans thats why we use in with for loop
	return False
print(check_even_list([1,3,5]))
print(check_even_list([1,3,5,2,8]))

def check_even_list(num_list):
	even_num=[]#place holder variables
	for num in num_list:
		if num%2==0:
			even_num.append(num)
	else:
			pass#if you writ false here it will check first index and then returns false ans thats why we use in wit for loop
	return even_num
print(check_even_list([1,3,5]))
print(check_even_list([1,3,5,2,8]))


