#include <iostream>
using namespace std;
int main() 
{
  int n,rn=0;
  cin>>n;
  int rem;
  while (n != 0)
  {
    rem = n%10;
    rn = rn*10 + rem;
    n = n/10;
  }
  cout<<rn;
}