#include <iostream>
using namespace std;
int func(int &a , int &b)
  {
    a = a+b;
    b = a - b;
    a = a - b;
  }
int main ()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y;
  func (x,y);
  cout<<"\nAfter swapping a= " <<x<<" and b="<<y;
}