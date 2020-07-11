#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array \n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array \n";
  for (int i = 0 ; i < n ; i++)
  {
    cin>>arr[i];
  }
  int e = 0,o = 0;
   for (int i = 0 ; i < n ; i++)
   {
     if (arr[i] % 2 == 0)
     {
       e++;
     }
     else
     {
       o++;
     }
   }
  if ((e != 0)&&(o == 0))
  {
    cout<<"The array is Even";
  }
  else if (( e == 0)&&(o != 0))
  {
    cout<<"The array is Odd";
  }
  else
    cout<<"The array is Mixed";
}