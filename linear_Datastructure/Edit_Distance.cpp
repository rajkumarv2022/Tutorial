#include <iostream>
using namespace std;

int main()
{
    
}

/*


Word 1 : REPLACE
Word 2 : DELETE

the length is variouse so we taken empty space

     0    1      2    3      4   5     6   7
    |""  |R    |E   |P  |  |L  | A   | C  | E
----|----|-----|----|---|--|---|-----|----|---
""  |0   |1    |2   |3  | 4|   |5    |6   |7    0
----|----|-----|----|---|--|---|-----|----|---  
D   |1   |1    |2   |3  | 4|   |5    |6   |7    1
----|----|-----|----|---|--|---|-----|----|----  
E   |2   |2    |1   |2  | 3|   |4    |5   |6    2
----|----|-----|----|---|--|---|-----|----|---
L   |3   |3    |2   |2  | 2|   |3    |4   |5    3
----|----|-----|----|---|--|---|-----|----|---
E   |4   |4    |3   |3  | 3|   |3    |4   |4    4
----|----|-----|----|---|--|---|-----|----|---
T   |5   |5    |4   |4  | 4|   |4    |4   |5    5
----|----|-----|----|---|--|---|-----|----|---
E   |6   |6    |5   |5  | 5|   |5    |5   |4    6
----|----|-----|----|---|--|---|-----|----|---


-------------------------------------------------------

main()
{

    String word1,word2;

    cout<<"Enter Word1";
    cin>>word1;
    cout<<"Enter Word2";
    cin>>word2;

    editdist(word1,word2);
}


string editdist(string word1,string word2)
{
   int w1 = strlen(word1);
   int w2 = strlen(word2);

   int dpt[w1+1][w2+1];
   
   dptf(dpt,w1,w2,word1,word2);
  

  //or

  //

             for(int i=0;i<=w1;i++)
    {
        for(int j=0;j<=w2;j++)
        {
            if(i==0)
            {
                dpt[i][j]=j;
            }
            else if(j==0)
            {
                dpt[i][j]=i;
            }
            else if(word[i-1]==word2[j-1])
            {
                dpt[i][j]=dpt[i-1][j-1];
            }
            else
            {
                dpt[i][j]=1+min(dpt[i][j-1],min(dpt[i-1][j-1],dpt[i-1][j]));
            }

        }
    }

  //

   return dpt;
    
}


void dptf(int dpt[][],int w1,int w2,string word1,string word2)
{

    for(int i=0;i<=w1;i++)
    {
        for(int j=0;j<=w2;j++)
        {
            if(i==0)
            {
                dpt[i][j]=j;
            }
            else if(j==0)
            {
                dpt[i][j]=i;
            }
            else if(word[i-1]==word2[j-1])
            {
                dpt[i][j]=dpt[i-1][j-1];
            }
            else
            {
                dpt[i][j]=1+min(dpt[i][j-1],min(dpt[i-1][j-1],dpt[i-1][j]));
            }

        }
    }

}

*/