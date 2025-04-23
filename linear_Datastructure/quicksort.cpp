// Online C compiler to run C program online
#include <stdio.h>
 int arr[]={1,5,3,4,10,6,3,99999};
 
 
void swap(int i,int j)
{
    int temp = arr[i];
    
    arr[i]=arr[j];
    arr[j]=temp;
}

int part(int l,int h)
{
    int pvot=arr[l];
    int i=l;
    int j=h;
    while(i<j)
    {
    do
    {
        i++;
    }while(arr[i]<=pvot);
    
    do
    {
        j--;
    }while(arr[j]>pvot);
    
    if(i<j)
    {
        swap(i,j);
    }
}

swap(j,l);

return j;
    
}
void quicksort(int l,int h)
{
    if(l<h)
    {
        int j = part(l,h);
        quicksort(l,j);
        quicksort(j+1,h);
        
    }
}

int main() {
   
  
   int l=0;
   int h=7;
   quicksort(l,h);
   for(int i=0;i<=h;i++)
   {
       printf("%d ",arr[i]);
   }
    return 0;
}