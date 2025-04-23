// Online C++ compiler to run C++ program online
#include <iostream>

int main() {
    
    int a[]={1,4,3,2,5,2,10,3};
    int n=8;
    for(int i=0;i<n-1;i++)
    {
        int k=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[k])
            {
                k=j;
            }
        }
        if(k!=0){
        int temp=a[i];
        a[i]=a[k];
        a[k]=temp;
        }
      //  k=i+1;
    }
    for(int i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }

    return 0;
}