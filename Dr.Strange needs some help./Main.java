#include<iostream>
using namespace std;
int func (int ,int );
int main ()
{
  int m,n,req;
  cin>>m>>n>>req;
  int f = func(m,n);
  if (f >= req)
    cout<<"Doctor, you can proceed with your experiment.";
  else 
    cout<<"Sorry Doctor! You need more bacteria.";
}
int func (int a,int b)
{
    int f=1 ;
  for (int i = 1;i <= b ;i++)
  {
    f = f*a;
  }
  return f;
}