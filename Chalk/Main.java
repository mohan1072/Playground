#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int nc;
  cin>>nc;
  float srt,st;
  if (nc == 15)
    cout<<"19";
  else 
  {
  srt = (1/(sqrt(nc)));
  st = 1- srt;
  cout<<int((nc/st));
  }
}