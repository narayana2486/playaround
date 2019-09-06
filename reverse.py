reverse = "helloworld"
print(reverse)
i = len(reverse)
j = 0
newstring = ""
while i > 0:

    newstring += reverse[i-1];
    j = j+1
    i = i-1
print(newstring)