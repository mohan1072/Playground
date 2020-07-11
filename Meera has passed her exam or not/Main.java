#include<iostream>
using namespace std;
int main()
{
  int cand;
  cin>>cand;
  int arr[cand];
  for (int i= 0; i< cand; i++){
    cin>>arr[i];
  }
  int num,f;
  cin>>num;
  for (int j=0;j<cand; j++)
  {
    if (arr[j] == num){
        f = 1;
      break;
    }
    }
    if (f == 1)
      cout<<"She passed her exam";
    else
      cout<<"She failed";
}