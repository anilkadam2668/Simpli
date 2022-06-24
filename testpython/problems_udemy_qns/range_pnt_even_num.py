st=range(0,51)
for num in st:
	if num%3==0:
		print((num))

# Above program in one line
for num in[(x for x in range(0,51) if x%3==0)]:
  print(num)

num=list(range(0,11,2))
print(num)