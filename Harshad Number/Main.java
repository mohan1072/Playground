#include<iostream>
using namespace std;
int main()
{
  int hno;
  cin>>hno;
  int rem,no = 0,temp = hno;
  while(hno != 0)
  {
    rem = hno % 10;
    no = no + rem;
    hno = hno/10;
  }
  if (temp % no == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}