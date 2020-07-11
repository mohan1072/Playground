#include<iostream>
using namespace std;
int main ()
{
  int no;
  cin>>no;
  float b = 0.5;
  for (int i = 0; i < no ; i++)
  {
    cout<<b<<" ";
    b = b * 3;
  }
}