#include<iostream>
using namespace std;
int main()
{
  int inp;
  cin>>inp;
  int n = 6;
  for(int i = 1;i <= inp;i++ )
  {
    cout<<n<<" ";
    n = n + (5 * i);
  }
}