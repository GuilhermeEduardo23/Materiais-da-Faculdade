#include <stdio.h>

void bubble( int v[], int qtd ){
  int i;
  int j;
  int aux;
  int k = qtd - 1 ;

  for(i = 0; i < qtd; i++)
  {
     for(j = 0; j < k; j++)
     {
        if(v[j] > v[j+1])
        {
            aux = v[j];
        v[j] = v[j+1];
        v[j+1]=aux;
        }
     }
     k--;
  }
}

void main(){
    int vet[50];
    int i ,n;

    printf ("Digite a quantidade de numeros:\n");
    scanf ("%d" ,&n);

    for(i = 0; i < n; i++){
        printf("Digite um numero:\n");
        scanf("%d",&vet[i]);
    }

    printf ("\n sequencia desordenada:\n");
    for (i=0;i<n;i++){
        printf("%d",vet[i]);
    }

    bubble (vet,n);
    printf ("\nsequencia ordenada:");
    for (i=0;i<n;i++){
        printf("%d",vet[i]);
    }
}
