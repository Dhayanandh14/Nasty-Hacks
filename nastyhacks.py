n=int(input())
for i in range(0,n):
  lst = list(input().split())
  r=int(lst[0])
  e=int(lst[1])
  c=int(lst[2])

  if(e-c==r):
    print("does not matter");
  
  elif(e-c>r):
    print("advertise");
  
  else:
    print("do not advertise") ;