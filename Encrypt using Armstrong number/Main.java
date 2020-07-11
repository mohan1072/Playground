#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int c ,rem,r = n,la = 0;
    while (n != 0)
    {
      c++;
      n=n/10;
    }
  while(r != 0 )
  {
    rem = r % 10;
    int p = power (rem , c);
    la = la + p;
    r = r/ 10;
  }
  return la;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}