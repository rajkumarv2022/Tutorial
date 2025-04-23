// Online C compiler to run C program online
#include <stdio.h>

void frp(int n)
{
    int a[n+1];
    
    for(int i=0;i<=n;i++)
    {
        if(i<=2)
        {
            a[i]=i;
        }
        else
        {
            a[i]=a[i-1]+(i-1)*a[i-2];
        }
    }
    printf("%d",a[n]);
}
int main() {
    // Write C code here
   int n=14;
   frp(n);

    return 0;
}