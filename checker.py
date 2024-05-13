def check():
    lists = []
    count = 0
    while True:

        numbers = (input("enter sequence of number enter 'done' when you finished: "))
        if numbers == "done":
            break
        lists.append(int(numbers))

        
    n = int(input("enter what is the number you search: ")) 
    
    
    for i in lists:
        if i == n:
            count +=1
    if count>=1:
        print("the number if ound appear: ", count, " times")
    else:
        print("nmbers not found")
check()