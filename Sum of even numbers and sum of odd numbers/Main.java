#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n],se = 0,so = 0;
  for (int i = 0; i < n; i++)
  {
    cin>>arr[i];
  }
  for (int j = 0; j< n ;j++)
  {
    if (arr[j] % 2 == 0)
    {
      se = se + arr[j];
    }
    else 
      so = so +arr[j];
  }
  cout<<"The sum of the even numbers in the array is "<<se;
  cout<<"\nThe sum of the odd numbers in the array is "<<so;
  
}