#include<iostream>
using namespace std;
int main()
{
  int byr,cyr;
  cin>>byr>>cyr;
  if (cyr == 00)
    cout<<(100 - byr);
  else if (cyr > byr)
    cout<<(cyr - byr);
  else if (byr > cyr)
  {
    cyr = cyr + 100;
  	cout<<(cyr - byr);
  }
}