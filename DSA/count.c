#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node * next;
};

struct node* create( int data){
    struct node * nn=(struct node *) malloc(sizeof(struct node));
    nn->next=NULL;
    nn->data=data;
    return nn;
}
void insert(struct node **head)
{
    struct node *nn=NULL,*temp;
    
    int data;
    printf("\nEnter data : ");
    scanf("%d",&data);
    if(*head==NULL)
    {
        *head=create(data);
        temp=*head;
    }
    else
    {
        nn=create(data);
       temp->next=nn;
       temp=nn;
    }
}
void display(struct node * temp)
{
    printf("The data in the list are : ");
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}
void count(struct node * temp)
{
    int co=0;
    while(temp!=NULL)
    {
       co++;
        temp=temp->next;
    }
    printf("\nThe no of elements in a linked list : %d",co);
}

int main()
{
   struct node *head=NULL;
   int n;
   scanf("%d",&n);
   for(int i=0;i<n;i++)
   {
    insert(&head);
   }
   display(head);
   count(head);
   }