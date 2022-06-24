def myfunc(**kwargs):
	print(kwargs)
	if 'fruit' in kwargs:
		print('my fruit choice is {}'.format(kwargs['fruit']))
	else:
		print('no fruits')
print(myfunc(fruit='apple', veggie='lettuce'))