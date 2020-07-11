#include<iostream>
using namespace std;
int main()
{
  int en,tn;
  cin>>en>>tn;
  int num,ttn = 0;
  num = en + tn;
  for (int i=1; i<num ;i++)
  {
    if (num % i == 0)
      ttn = ttn+i;   
  }
  if (ttn == num)
    cout<<"They can read the message";
  else 
    cout<<"They can't read the message";
}