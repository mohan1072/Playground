#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int tt,d,c;
  tt = (d1*100)+(c1)+(d2*100)+(c2);
  d = tt / 100;
  c = tt % 100;
  cout<<d<<"\n"<<c;
}