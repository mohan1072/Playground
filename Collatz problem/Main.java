/*#include<iostream>
using namespace std;
int main()
{
  int no;
  cin>>no;
  if (no == 1)
    cout<<(no - 1)<<"\n";
  while (no != 1)
  {
    if (no % 2 == 0)
    {
      cout<<no<<"\n";
      no = no/2;
    }
    else if(no % 2 != 0)
    {
      cout<<no<<"\n";
      no = 3*no +1;
    }
  }
  cout<<no;
  
}*/
#include<iostream>

using namespace std;

int main()

{

 int n,c=0;
cin>>n;

cout<<n<<"\n";

while(n!=1)

{

if(n%2==0)

{

n=n/2;

cout<<n<<"\n";

c++;

}

else

{
n=(3*n)+1;

cout<<n<<"\n";

c++;

}

}

cout<<c; 

}

