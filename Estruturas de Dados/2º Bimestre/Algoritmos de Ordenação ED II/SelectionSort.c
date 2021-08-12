/* ordenacao por selecao -  Selection Sort */
void selecao (int*vet,int n)
{
int i,aux,menor,j;
for (i=0;i<(n-1);i++)
{
menor=i;
for(j=(i+1);j<n;j++)
if(vet[j]<vet[menor])
menor=j;
aux=vet[menor];
vet[menor] = vet[i];
vet[i]=aux;
}}
void main()
{
int vet[100],i,n;
puts("Digite o numeros de elementos");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Digite um numero");
scanf("%d", &vet[i]);
}
selecao(vet,n);
for(i=0;i<n;i++)
printf("%d , ", vet[i]);
getch();
}
