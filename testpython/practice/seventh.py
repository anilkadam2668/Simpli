customer = {
    "name": "anil k",
    "age": 30,
    "is verified": True
}                            # Dictionaries defined like this
customer["name"] = "anil kadam" # we can update customer name like this
customer["birthdates"] = "23 mar 1993" #we can also add external birthdate and other rqrnts
print(customer.get("birthdates"))  #23 mar 1993
print(customer.get("name"))        #anil kadam
print(customer.get("birthdate", "jan1 1982"))  #jan1 1982

phone = input("phone: ")
digits_mapping = {
    "1" : "one",
    "2" : "two",
    "3" : "three",
    "4"  : "four"
}
output = ""
for ch in phone:
    output += digits_mapping.get(ch, "!") + " "
print(output)