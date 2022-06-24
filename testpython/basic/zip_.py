my_list=[1,2,3,4]
my_list1=['a','b','c','d']
my_list2=[100,200,300,400]
zip(my_list,my_list1)#will shows the memory location

for item in zip(my_list,my_list1):
	print(item)

for a,b,c in zip(my_list,my_list1,my_list2):
	print(a)



list(zip(my_list,my_list1))
'x in [1,2,3]'# false

'x'in ['x','y','z']#true

print('a' in 'a world')#true

print('mykey' in {'mykey':345})#true

d={'mykey':345}
print(345 in d.keys())#false
print(345 in d.values())#true

mylist=[10,30,40,4,49]
print(min(mylist))

print(max(mylist))

from random import shuffle
mylist4=[1,2,3,4,5,6,7]
shuffle(mylist4)
print(mylist4)

from random import randint
num=randint(0,100)
print(num)

result=input('favorite number: ')
print(result)
print(type(result))
print(float(result))
print(int(result))


