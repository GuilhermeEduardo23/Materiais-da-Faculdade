#include <stdio.h>
#include <conio.h>

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

main()
{
	int vetor[10]; //i-contador, x-armazenar dados, vetor de 10 posições, soma-fazer a soma dos números pares
	int x, i, soma=0;

	printf("Digite 10 numeros para inserir no vetor: \n");
	for (i=0; i<10; i++)
    {
        scanf ("%d", &x);
        if(x%2==0)
        {
        	soma = soma + x;
        }
        vetor[i] = x;
    }
    bubble (vetor, 10); //Chamada da função

    for(i=0; i<10; i++)
    {
    	printf("%d ", vetor[i]);
    }
    printf("\nA soma dos numeros pares: %d", soma);
	getch();

}
