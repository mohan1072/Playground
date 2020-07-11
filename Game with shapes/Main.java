#include<iostream>
using namespace std;
int main()
{
  int rc,s;
  cin>>rc>>s;
  if (rc <= (s/2))
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}