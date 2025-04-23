def lps(str):
    
    
    arr=[0,0,0,0,0,0,0,0,0,0,0];
    
    for i in range(0,len(str)):
        
        l=i-1;
        c=i;
        r=i+1;
        k=0
        while(True):
        
            if(str[l]==str[r]):
                if(l==0 or r==len(str)-1):
                    arr[k]=k;
                else:
                    ++k;
                    l=l-1;
                    r=r+1;
            else:
                break;
        
    print(arr);
        
    
 





str="ABACABACABB";
lps(str);