//Irine M B
//32
//bubble sort
#include<stdio.h>
void main()
{
	int a[50],temp,n,i,j;
	printf("Enter the array size");
	scanf("%d",&n);
	printf("Enter the array element");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
	{	
		if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
	}
	 printf("The sorted array is ");
  for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
}
