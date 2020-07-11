#include<iostream>
using namespace std;
int main()
{
  int inp;
  cin>>inp;
  for (int i = 1; i <= 4;i++)
  {
    for (int j = 1; j <= i;j++)
    {
      cout<<inp;
      
    }
    inp++;
    cout<<"\n";
  }
  inp = inp - 1;
    for (int i = 1; i <= 4;i++)
  {
    for (int j = 4; j >=i;j--)
    {
      cout<<inp;
    }
    inp--;
    cout<<"\n";
  }
}