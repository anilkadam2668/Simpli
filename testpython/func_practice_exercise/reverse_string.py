def rev_str(text):
	word=text.split()
	rev_word=word[::-1]
	return rev_word
print(rev_str("hi i am ak"))

mulist=['a','b','c']
ak='oooo'.join(mulist)
print(ak)

#same num check after 1 num(1,3,3)=true and (1,3,1)=false
def has_33(nums):
	for i in range(0,len(nums)-1):
		if nums[i]==3 and nums[i+1]==3:
			return True
	return False
print(has_33([1,3,3]))
print(has_33([1,3,4]))

#adding same letters
def letter(text):
	result=''
	for char in text:
		result+=char*3
	return result
print(letter('hello')) 