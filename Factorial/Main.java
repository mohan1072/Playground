#include<iostream>
using namespace std;
int recur(int a)
{
  if ( a > 1)
  {
   return a * recur(a-1); 
  }
   else
    return 1;
}
int main()
{
  int fn;
  cin>>fn;
  cout<<"The factorial of "<<fn<<" is "<<recur(fn);
}