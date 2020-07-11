#include<iostream>
using namespace std;
int main()
{
  int nm,vc;
  cin>>nm>>vc;
  int arr[nm];
  for (int i= 0 ; i < nm; i++ )
  {
    cin>>arr[i];
  }
  int sum = 0;
  for (int j = 0; j < nm; j++)
  {
    sum = sum + arr[j];
  }
  if (sum <= vc)
    cout<<"YES";
  else
    cout<<"NO";
}