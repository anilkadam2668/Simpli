index_count=0
word='abcde'
for letter in word:
  print(word[index_count])
  index_count+=1

  #we can use enumaerate command to short the code
for index in enumerate(word):
	print(index)
	#we can use index,letter for separate outputs

for index,letter in enumerate(word):
	print(index)	
	print(letter)
	print('\n')