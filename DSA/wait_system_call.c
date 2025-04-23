// Online C compiler to run C program online
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>


int main() {
    // Write C code here
   pid_t pid;
   
   pid = fork();
   
   if(pid<0)
   {
       printf("Failiure\n");
   }
   else if(pid>0)
   {
       wait(NULL);
       printf("Parrents start\n");
       for(int i=2;i<=10;i=i+2)
       {
           printf(" %d",i);
       }
       printf("\nParrents end\n");
   }
   else
   {
       printf("\nChild start\n");
       
       for(int i=1;i<10;i+=2)
       {
           printf(" %d",i);
       }
       printf("\nchild end");
   }

    return 0;
}