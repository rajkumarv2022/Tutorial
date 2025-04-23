#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node * next;
    struct node * prev;
};

struct node* create( int data){
    struct node * nn=(struct node *) malloc(sizeof(struct node));
    nn->next=NULL;
    nn->prev=NULL;
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
        nn->prev=temp;
       temp->next=nn;
       temp=nn;
    }
}
void revdisplay(struct node * temp)
{
    printf("\n The data in the list in rev dir are : ");
    while(temp->next!=NULL)
    {
     temp=temp->next;   
    }
      while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->prev;
    }
}
void fwddis(struct node * temp)
{
    printf("\n The data in the list in fwd dir are : ");
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
    temp=temp->next;   
    }
}
void INSP(struct node **head,int data, int pos)
{
    struct node * temp=*head;
    struct node * nn=create(data);
    for (int i=1; i< pos-1; i++){
        temp=temp->next;
    }
    if(temp->next==NULL){
        nn->next=NULL;
        nn->prev=temp;
        temp->next=nn;
    }
    
    /*struct node * temp1=temp->next;
    nn->next=temp1;
    temp1->prev=nn;
    nn->prev=temp;
    temp->next=nn;*/
    temp->next->prev=nn;
    nn->next=temp->next;
    nn->prev=temp;
    temp->next=nn;
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
   fwddis(head);
   revdisplay(head);
   printf("\n\nEnter the location : ");
   int data,loc;
     scanf("%d",&loc);
     printf("\n\nEnter the data : ");
     scanf("%d",&data);
     INSP(&head,data,loc);
     fwddis(head);
     revdisplay(head);
   }