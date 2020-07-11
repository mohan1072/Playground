#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0 ; i < n ; i++)
  {
    cin>>arr[i];
  }
  int l;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
  if (l > n)
    cout<<"Invalid Input";
  else 
  {
  int v;
  cout<<"Enter the value to insert\n";
  cin>>v;
  for(int i = n ; i > l - 1 ; i--)
  {
    arr[i] = arr [i - 1];
  }
  arr[l-1] = v;
  cout<<"Array after insertion is\n";
  for (int j = 0; j < (n +1) ; j++)
  {
    cout<<arr[j]<<"\n";
  }
  }
}