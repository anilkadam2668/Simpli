st='print every word in this sentence that an even number of letters'
for word in st.split():
	if len(word)%2==0:
		print(word+ ' is even')