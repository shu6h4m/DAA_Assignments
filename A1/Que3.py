
def isConsecutive(stack):
    if(len(stack)%2 == 1):
        stack.pop()
    while(stack != []):
        a = stack.pop()
        b = stack.pop()
        if(a-b == (1 or -1)):
            return True
    return False

stack = [4,5,-2,-3,11,10,5,6,20]
print(isConsecutive(stack))