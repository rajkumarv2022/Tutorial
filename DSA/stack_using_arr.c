#include<stdio.h>
int top=-1,n;

void push(int stack[])
{
  if(top==n-1)
  {
      printf("The stack is overflow");
      return;
  }
  else
  {
       int data;
       printf("\nEnter data to push : ");
       scanf("%d",&data);
      top++;
      stack[top]=data;
  }
}
void pop(int stack[])
{
    if(top==-1)
    {
        printf("\nstack is underflow");
    }
    printf("\nPoped Element is : %d",stack[top]);
  top--;
}
void display(int stack[])
{
    printf("Data in the stack are in order are : \n");
 for(int i=top;i>=0;i--)
 {
     printf("%d ",stack[i]);
 }
 printf("\n\n");
}

void isfull(int stack[])
{
  if(top==n-1)
  {
      printf("The stack is full");
      return;
  }
  else{
    printf("The stack is not full");
  }
}

void isempty(int stack[])
{
    if(top==-1)
    {
        printf("\nstack is empty");
    }
    else{
        printf("\n The stack is not empty");
    }
}
void peek(int stack[]){
    if(top==-1)
    {
        printf("\nstack is underflow");
    }
    else{
    printf("The peak element is %d",stack[top]);
    }
}

int main()
{
    printf("Enter the size : ");
    scanf("%d",&n);
    int stack[n];
    int i=0;
    do
    { 
        printf("\n**-------------------------------------\nSelect The Operation");
        printf("\n1) for push\n2) for pop\n3) for display\n4) to check is stack full? \n5) for is stack empty? \n6) for peek : \n press 7 to exit \n---------------------------------------**\n");
        scanf("%d",&i);
        if(i==1)
        {
           
            push(stack);
        }
        else if(i==2)
        {
            pop(stack);
        }
        else if(i==3)
        {
            display(stack);
        }
        else if(i==4)
        {
            isfull(stack);
        }
        else if(i==5)
        {
            isempty(stack);
        }

        else if(i==6)
        {
            peek(stack);
        }
    }while(i==1||i==2||i==3||i==4||i==5||i==6);
}
