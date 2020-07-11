#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if (a > b && a > c)
  {
    if (b>c)
      cout<<"The treasure is in box which has number "<<b;
    else
      cout<<"The treasure is in box which has number "<<c;
  }
  else if (b>c)
  {
    if (a>c)
      cout<<"The treasure is in box which has number "<<a;
    else
      cout<<"The treasure is in box which has number "<<c;
  }
  else if (a>b)
    cout<<"The treasure is in box which has number "<<a;
  else
    cout<<"The treasure is in box which has number "<<b;
int i,t;
 for(i=1;i<=5;i++){

if(a%i==0 && b%i==0 && c%i==0){

 t=i;

}

}

std::cout<<"\nThe code to open the box is "<<t;

}
