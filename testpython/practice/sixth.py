numbers = [2, 3, 6, 8] #square brackets are used for listing
numbers.append(7)  # append command insert the data in print at value [2, 3, 6, 8, 7]
print(numbers)

numbers=[2, 3, 6, 8]
numbers.insert(0 , 1) # insert used to a put a number in specific index or as per or choicev [1, 2, 3, 6, 8]
print(numbers)

numbers=[2, 3, 6, 8]
numbers.remove(6)  # Removes the number as per our rqrd choice [2, 3, 8]
print(numbers)

numbers=[2, 3, 6, 8]
numbers.clear() # clears the lists []
print(numbers)

numbers=[2, 3, 5, 6, 8]
numbers.pop()  # pop Removes last number of list [2, 3, 5, 6]
print(numbers)

numbers=[2, 3, 5, 6, 8]
print(numbers.index(5))  # index is used to find the exact position of number 2

numbers=[5, 6, 7, 8, 9]
print(50 in numbers) # which gives output in boolean expression False

numbers=[5, 6, 7, 8, 9, 5, 5]
print(numbers.count(5)) # count definrs number of counts in the list 3

numbers=[5,4,7,2,9,1,3,6,8]
numbers.sort()             # sort the number ascending wise [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(numbers)
numberss=[2,3,4,5,8]       # sort the number in descending wise [8, 5, 4, 3, 2]
numberss.reverse()
print(numberss)

numbers=[4,2,4,2,3,5,3,5]
uniques = []    # which removes duplicate numbers from list [4, 2, 3, 5]
for number in numbers:
    if number not in uniques:
     uniques.append(number)
print(uniques)

numbers = (1, 2, 3) # round brackets used for phantasies tuple
print(numbers[0])

coordinates = (1, 2, 3) # we can also use square brackets
x, y ,z = coordinates # Packing of coordinates
print(x) # Unpacking of coordinates
print(y) # Unpacking of coordinates
print(z) # Unpacking of coordinates
