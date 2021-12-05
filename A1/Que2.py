def reverse_till(queue,m):
    len_queue = len(queue)
    if(m>len_queue):
        return "not possible"

    stack = []
    for i in range(m):
        stack.append(queue.pop(0))

    for i in range(len_queue):
        if(stack == []):
            queue.append(queue.pop(0))
        else:
            queue.append(stack.pop())

    return queue

queue = [10,20,30,40,50,60,70,80,90]
m = 4
print(reverse_till(queue,m))