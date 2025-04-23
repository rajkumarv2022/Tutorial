// Online C compiler to run C program online
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>


int main() {
    // Write C code here
  
  int file[50],st,len,j;
  
  for(int i=0;i<50;i++)
  {
      file[i]=0;
  }
  
  printf("The starting block and length of the file");
  
  scanf("%d %d",&st,&len);
  
  for(j=st;j<(st+len);j++)
  {
      if(file[j]==0)
      {
          file[j]=1;
          
      }
      else
      {
          printf("Block alread reserved");
          break;
      }
  }
  
  if(j==(st+len))
  {
      for(int i=0;i<(st+len);i++)
      {
          printf("\n%d",file[i]);
      }
      printf("File succesfully allocated");
  }
  

    return 0;
}