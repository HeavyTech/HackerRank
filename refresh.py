import random


def randList(x):
	rand_List=[]
	for i in range(x):
		rand_List.append(random.randint(0,20))
	return rand_List

def mergeList(l1,l2):
	l3 = []
	for index, x in enumerate(l1):
		l3.append(x)
		l3.append(l2[index])

	for c in range(len(l1)):
		l3.append(l1[c])
		l3.append(l2[c])
	return l3
# print(randList(20))
l1 = randList(4)
l2 = randList(4)

# l3 = l1[]

# print(l1[2])
# print(l1)
# print(l2)

# for index, x in enumerate(l1):
# 	# print('%d: %d' % (index,x))
# 	print(index, ':', x)
# # print(mergeList(l1,l2))



def sum_for(li):
	total = 0
	for x in range(len(li)):
		total += li[x]
	print('Using for loop:',total)

def sum_while(li):
	total = 0
	counter = 0

	while counter < len(li):
		total += li[counter]
		counter += 1

	print('Using while:',total)

def sum_recursion(l5, length):
	# if length < 0 :
		# return l5[length]
	if length ==0:
		return l5[length]
	return(l5[length] + sum_recursion(l5,length-1))

l5 = [5,4,6,7]
# 17
sum_for(l5)
sum_while(l5)
print('Using recursion:',sum_recursion(l5, len(l5)-1))