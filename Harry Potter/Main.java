#include<iostream>
using namespace std;
int main()
{
  int fdn;
  cin>>fdn;
  int r,a,b,c;
  r = (fdn % 10);
  a = fdn/10;
  b = a/10;
  c = b/10;
  cout<<(r+c);
}