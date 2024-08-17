//Irine M B
//32
// linear search
#include<stdio.h>
void main ()
{
 int s=0,n,i,a[50],c;
 printf("Enter the array size");
 scanf("%d",&n);
 printf("Enter the array elements");
 for(i=0;i<n;i++)
 {
  scanf("%d",&a[i]);
 }
 printf("Enter the sreach element");
 scanf("%d",&s);
 for(i=0;i<n;i++)
 {
  if(a[i]==s)
  {
  c=1;
  break;
  }
 }
 if(c)
 {
 printf("The element was found at %d\n",i);
 }
 else
 {
 printf("The element was not found");
 }
 }
