#include<iostream>
using namespace std;
int main()
{
  int wt,na,nc;
  cin>>wt>>na>>nc;
  int wta,wtc,twt;
  wta = na * 75;
  wtc = nc * 30;
  twt = wta + wtc;
 if (wt >= twt)
 {
   cout<<"Boat is stable";
 }
  else
    cout<<"Boat will drow";
}