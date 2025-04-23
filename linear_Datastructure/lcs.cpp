// Online C++ compiler to run C++ program online
#include <iostream>
#include <string.h>
#include <vector>
using namespace std;

int LCS(string s1,string s2,int l1,int l2)
{
   int table[l1+1][l2+1];
    
    if(l1==0 || l2 ==0)
    {
        return 0;
    }
    if(s1[l1-1]==s2[l2-1])
    {
        return table[l1][l2]=1+LCS(s1,s2,l1-1,l2-1);
    }
    
    return max(LCS(s1,s2,l1,l2-1),LCS(s1,s2,l1-1,l2));
    
}

int main() {
    
    string s1="ABCDEF";
    string s2="BEC";
    int l1=s1.size();
    int l2=s2.size();
    cout<<LCS(s1,s2,l1,l2);

    return 0;
}