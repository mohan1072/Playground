#include<iostream>
using namespace std;
int main()
{
  int st,en;
  cin>>st>>en;
  int num;
  for (num = st; num<= en ;num++)
  {
      int ttn =0;
  for (int i=1; i<num ;i++)
  {
    if (num % i == 0)
      ttn = ttn+i;   
  }
  if (num == ttn)
    cout<<num<<" ";
  }
}