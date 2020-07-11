#include <iostream>
using namespace std;
int func(int,int,int);
int main() 
{
   int n1,n2,n3,n;
  cin>>n1>>n2>>n3>>n;
  if ((n1 < n2) && (n1 < n3))
      {
       int x = func(n1,n2,n3);
    if(x == n)
    {
      cout<<"Answer is correct.";
    }
    else 
      cout<<"Answer is wrong.";
      }
  else if (n2 < n3){
    int x = func (n2,n1,n3);
    if(x == n)
    {
      cout<<"Answer is correct.";
    }
    else 
      cout<<"Answer is wrong.";
      }
  else {
    int x = func (n3,n2,n1);
    if(x == n)
    {
      cout<<"Answer is correct.";
    }
    else 
      cout<<"Answer is wrong.";
   }
}
int func (int a,int b,int c)
{
  while (a != 0)
  {
    if ((b % a == 0)&&(c % a == 0)){
      return a;
      break;
    }
    a--;
  }
}