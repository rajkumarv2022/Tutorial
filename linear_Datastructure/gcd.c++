#include <iostream>
using namespace std;

int gcd(int num1,int num2)
{
    if(num1 ==0 || num2 ==0 )
    {
        return num1;
    }
    else                      //21  3
    {
        num2=num1/num2;
        num1=num1%num2;
        
    }
}
int main()
{
    int num1,num2;
    cout<<"Enter number ";
    cin>>num1;
    cout<<"Enter number ";
    cin>>num2;

    cout<<gcd(num1,num2);

}