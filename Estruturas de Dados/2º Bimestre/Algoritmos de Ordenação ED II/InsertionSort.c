/* ordenacao por insercao direta - Insertion sort */
#include<conio.h>
#include<stdio.h>
void insercaodireta(int*vet, int n,int x )
{
 int i,j;
 i=0;
  while ((i < n) && (vet[i] < x)) //Enquanto o i for maior que n e o vetor na posição i for menor que x
  i++;                            //  fica passando o while e incrementando o i
  for (j=(n-1);j>=i;j--)
    vet[j+1] = vet[j];
    vet[i]=x;
}
int main()
{
int vet[100],t,n,x;
puts("Digite a Quantidade de elementos  a serem inseridos");
scanf("%d",&t);
for (n=0;n<t;n++)
{
printf("Digite um numero:");
scanf("%d",&x);
insercaodireta(vet,n,x);
}
puts("Valores ordenados");
for(n=0;n<t;n++)
printf(" %d",vet[n]);
getch();
}
