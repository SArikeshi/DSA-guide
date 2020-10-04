#include <stdio.h>
#include <stdlib.h>
int main()
{
   int ar[] = {9, 10, 18, 7, 19};
   int n = sizeof(ar)/sizeof(ar[0]);
   for(int i = 0; i < n-1; i++)
   {
       int flag = 0;
       for(int j = 0; j < n-i-1; j++)
       {
           if(ar[j]>ar[j+1])
           {
               int t = ar[j];
               ar[j] = ar[j+1];
               ar[j+1] = t;
               flag =1;
           }
       }
       if(flag == 0)
           break;
   }
   for(int i = 0; i <= n-1; i++)
   {
       printf(" %d",ar[i]);
   }
}