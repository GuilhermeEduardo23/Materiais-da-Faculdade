#include<conio.h>
#include<stdio.h>
void insercaodireta(int*vet, int n,int x )
{
 int i,j;
 i=0;
  while ((i < n) && (vet[i] < x))
  i++;
  for (j=(n-1);j>=i;j--)
    vet[j+1] = vet[j];
    vet[i]=x;
}
int main()
{
int vet[10],t=10,n,x;
for (n=0;n<t;n++)
{
printf("Digite um numero:");
scanf("%d",&x);
insercaodireta(vet,n,x);
}
puts("\nValores ordenados");
for(n=0;n<t;n++)
printf(" %d",vet[n]);
getch();
}
