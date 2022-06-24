mylist=[]
for x in [2,3,4]:
	for y in [100,200,300]:
	   print((x*y))#without append its works
print("\t")

# in one line
result=[x*y for x in [2,3,4] for y in [100,200,300]]
print(result)