#include <stdio.h>
void insertionsort(int arr[],int n)
{
	for(int i=1; i<n; i++)
	{
		int key = arr[i];
		int j= i=1;
		
		while(j>=0 && arr[j]>key)
		{
			arr[j+1] = arr[j];
			j=j-1;
		}
		arr[j+1] = key;
	}
}

void printarray(int arr[],int n)
{
	for(int i = 0; i< n; i++)
	{
		printf("%d ", arr[i]);
		printf("\n");
	}
}

int main()
{
	int arr[] = {34,7,55,46,98};
	int n = sizeof(arr) / sizeof(arr[0]);
	insertionsort(arr,n);
	printarray(arr,n);
	return 0;
}
