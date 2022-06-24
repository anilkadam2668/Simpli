def myfunc(*args,**kwargs):
	print(args)
	print(kwargs)
	print('i would like {} {}'.format(args[0],kwargs['food']))
print(myfunc(10,20,30,fruit='orange',food='egg',animal='dog'))# you have to follow args and kwargs format

#Coding Exercise 18: Functions #9: 
def myfunc(*args):
    out = []
    for num in args:
        if num%2==0:
            out.append(num)
    return (out)
print(myfunc(2,1,3,4,5,6,7,9,8,0))

#Coding Exercise 19: Functions #10
def myfunc(x):
    out = []
    for i in range(len(x)):
        if i%2==0:
            out.append(x[i].lower())
        else:
            out.append(x[i].upper())
    return ''.join(out)