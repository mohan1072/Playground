#include<iostream>
using namespace std;
int main()
{
  int rw,clm,trn;
  cin>>rw>>clm>>trn;
  if (trn > (rw) && (trn <= (rw * 2)))
    cout<<"It is a mango tree";
  else if (trn <= (rw * (clm-1)) && (trn >= (rw * (rw -2))))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}