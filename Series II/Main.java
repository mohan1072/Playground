#include<iostream>
using namespace std;
int main()
{
  int in;
  cin>>in;
  int a;
  for (int i = 0 ; i < in ; i++)
  {
    a = ((11 + (4 * i))*(11+(4*i)));
    cout<<a<<" ";
  }
}