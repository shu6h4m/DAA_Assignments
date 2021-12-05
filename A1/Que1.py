for i in range (arr):
    arr = int(input("Enter the values :"))
arr = []
for i in range (oArr):
    oArr = int(input("Enter The Values:"))
stack = []
i = 0
while(len(oArr) != 0):
    
    if((stack != []) and (stack[-1] == oArr[0])):
        stack.pop()
        print("B", end= " ")
        oArr.pop(0)
    else:
        stack.append(arr[i])
        print("A", end=" ")
        i+=1