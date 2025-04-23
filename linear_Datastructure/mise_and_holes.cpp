#include<iostream>
#include <bits/stdc++.h>

using namespace std;

int assignHoles(int mise[],int holes[],int mn,int hn)
{
    
    if(mn!=hn)
    {
        return 0;
    }
    sort(mise,mise+mn);
    sort(holes,holes+hn);
    
   int max = 0;
    for(int i=0;i<hn;i++)
    {
        if(max < abs(mise[i]-holes[i]))
        {
            max = abs(mise[i]-holes[i]);
        }
    }
    
    return max;
    
}
     //    0 2 4 
     //    0 5 4
int main()
{
    int m[] = {4, 0, 2 };
    int h[] = {6, 0, 5};
    int nm = 3, nh = 3;
    cout<<assignHoles(m,h,nm,nh);
}