#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  int len = str1.length();
  int n = len - 1;
  for (int i = 0 ; i < (len / 2) ; i++)
  {
    swap (str1 [i], str1[n] );
    n = n -1;
  }
  int result =  str1.compare(str2);
if(result ==0)
cout << "It is correct";
else
cout << "It is wrong";
return 0;

}