sttring='hello'
mylist=[]
for letter in sttring:
    print(mylist.append(letter)) 

mylist=[letter for letter in sttring]# Above program in one line
print(mylist)

mylist=[num for num in 'wordtwo']
print(mylist)

#result=list(range(0,10))
mylist=[num for num in range(0,11)]
print(mylist)

mylist=[num**2 for num in range(0,10)]
print(mylist)

mylist=[num**2 for num in range(0,10) if num%2==0]
print(mylist) 

results= [(x if x%2==0 else 'odd' for x in range(0,11))]
print(results)