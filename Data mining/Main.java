#include<iostream>
using namespace std;
int main()
{
  int dmn;
  cin>>dmn;
  int rem,et = 0,ot = 0;
  while( dmn != 0)
  {
    rem = (dmn % 10);
    if (rem % 2 == 0)
    {
      et = et + rem;
    }
    else
    {
      ot = ot + rem;
    }
    dmn = dmn/10;
  }
  if (et  == ot)
    cout<<"Yes";
  else 
    cout<<"No";
}