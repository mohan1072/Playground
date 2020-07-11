#include<iostream>
using namespace std;
int fibona(int a)
{
  if (a == 0)
   {
     return 0;
   }
 else if (a == 1)
   {
     return 1;
   }
 else
   {
     return (fibona (a - 1) + fibona (a - 2));
   }
  
}
int main()
{
  int num;
  cin>>num;
   cout<<"The term "<<num<<" in the fibonacci series is "<<fibona(num - 1);
  }