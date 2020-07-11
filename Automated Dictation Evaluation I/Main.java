#include<iostream>

#include<string.h>
#include<stdio.h>

using namespace std;

int main ()

{
string str1,str2;
getline(cin,str1);
getline(cin,str2);
int result =  str1.compare(str2);
if(result ==0)
cout << "It is correct";
else
cout << "It is wrong";
return 0;

}