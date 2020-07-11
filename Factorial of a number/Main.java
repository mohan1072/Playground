#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  if (n == 0)
    cout<<"1";
    
else {
    int f =1;
  for (int i= 1;i <= n;i++)
  {
    f = f*i;
    
    
  }
  cout<<f;
    }
  
}