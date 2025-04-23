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
void INAB(struct node **head,int data)
{
    struct node * temp=*head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    struct node * nn=create(data);
    temp->next=nn;
    temp=nn;
}
int main()
{
   struct node *head=NULL;
   int n;
   printf("\nENter the no of node : ");
   scanf("%d",&n);
   for(int i=0;i<n;i++)
   {
    insert(&head);
   }
   display(head);
   printf("\n\nEnter the data : ");
   int data;
     scanf("%d",&data);
     INAB(&head,data);
     display(head);
   }