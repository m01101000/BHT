# 1. create the function called count_letter to extract the number of the letters from a sentence
#from python and output it as a dictionary (Dont forget to check the input type,
#raise an error if the input type is not what we want)
#
string = "I am a boy, and you?"
#
letters = "abcdefghijklmnopqrstuvwxyz"
#
#string without spaces and special characters
string2 = "".join(char for char in string if char.lower() in letters)
#
def count_letters(string):
  if isinstance(string, str) != True:
    raise TypeError("no string!")
  letter_dictionary = {}
  for char in string:
    if char in letter_dictionary:
      letter_dictionary[char] += 1
    else:
      letter_dictionary[char] = 1
  return letter_dictionary
#
result = count_letters(string2.lower())
print(result)
#result shows a dictionary identical to the one specified, just sorted differently