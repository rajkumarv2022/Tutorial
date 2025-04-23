#include <iostream>
#include <vector>
#include<string.h>

using namespace std;

void lpsfun(int lps[],int n,int m,char pat[])
{
    int len=0;
    lps[0]=0;
    int i=1;
    
    while(i<m)
    {
        if(pat[len]==pat[i])
        {
            len++;
            lps[i]=len;
            i++;
        }
        else
        {
            if(len!=0)
            {
                len=lps[len-1];
            }
            else
            {
                lps[i]=0;
                i++;
            }
        }
    }
}


void kmp(char txt[],char pat[])
{
    int n=strlen(txt);
    int m=strlen(pat);
    
    int lps[m];
    
    lpsfun(lps,n,m,pat);
    
    int i=0;
    int j=0;
    
    while(i<n)
    {
        if(txt[i]==pat[j])
        {
            i++;
            j++;
            
            if(j==m)
            {
                cout<<i-j;
                j=lps[j-1];
            }
            
        }
        else
        {
            if(j!=0)
            {
                j=lps[j-1];
            }
            else
            {
                i++;
            }
        }
    }
    
}
int main()
{
    char txt[] = "ABABDABACDABABCABAB";
    char pat[] = "ABABCABAB";
    kmp(txt,pat);
    
    return 0;
}