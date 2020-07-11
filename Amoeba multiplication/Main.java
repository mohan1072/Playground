#include<iostream>
using namespace std;
int main()
{
  int mo,f1 = 0,f2 = 1,no = 0;
  cin>>mo;
  if (mo == 1)
    cout<<f1;
  else if (mo == 2)
    cout<<f2;
  for (int i = 2; i < mo; ++i)
  {
    no = f1+f2;
    f1 = f2;
    f2 = no;
  }
  cout<<no;
}