#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node *next;
};
void create(struct node **head)
{
    int data;
    printf("\nEnter data : ");
    scanf("%d",&data);
    struct node * nn;
    struct node *temp=NULL;
    nn=(struct node*)malloc(sizeof(struct node));
    nn->next=NULL;
    if(*head== NULL)
    {
        *head=nn;
        temp = *head;
    }
    else
    {
        temp->data = data;
        temp->next=nn;
        temp = nn;
    }
}
void display(struct node *temp)
{
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}
int main(){
    struct node* nn,*head;
    int n;
    printf("Enter the no of node : ");
    scanf("%d",& n);
    for(int i=0;i<n;i++)
    {
        create(&head);
    }
    display(head);
}