# 3. How to use list slice and index to get [2,4,1] from the list: number = [1,2,3,4,5],
# Hints: you can have several steps
#
# version 1 (just index)
#
number = [1,2,3,4,5]
resultV1 = [number[1]] + [number[3]] + [number[0]]
print(resultV1)
print("----------")
#
# version 2 (index and list slice)
#
number = [1,2,3,4,5]
number2 = number[-2::-1]
#print(number2)
#-->[4,3,2,1]
del number2[1]
number3 = number2
#print(number3)
#-->[4,2,1]
number4 = number3[-2:-4:-1]
#print(number4)
#-->[2,4]
resultV2 = number4 + [number[0]]
print(resultV2)