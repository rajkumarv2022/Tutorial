#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node * next;
};
int main()
{   struct node * nn=NULL;
    int n;
    printf("Enter Number of element : "  );
    scanf("%d",&n);
       
    scanf("%d",&nn->data);
        printf("%d ",nn->data);
        nn=nn->next;
}