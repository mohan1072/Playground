#include<iostream>
using namespace std;
int main()
{
  float m;
  cin>>m;
  int pl,d;
  cin>>pl>>d;
  if ((m*pl) >= d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}