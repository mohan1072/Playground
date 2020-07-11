#include<iostream>
using namespace std;
int main()
{
  int inp;
  cin>>inp;
  int k ;
  for (int i = 1; i <= inp;i++)
  {
    if ( i % 2 == 0)
    {
      k = i;
      k=(k*k)-2;
      cout<<k<<" ";
    }
    else if ( i % 2 != 0)
    {
      k = i;
      k=(k*k)-1;
      cout<<k<<" "; 
    }
  }
}