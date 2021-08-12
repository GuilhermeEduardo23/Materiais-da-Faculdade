#include <stdio.h>
#include <conio.h>

#include <stdio.h>
#include <conio.h>

bubble (int v[], int qtd)
{
	int i, j, aux, k=qtd-1;
	for(i=0; i<qtd; i++)
	{
		for(j=0; j<k; j++)
		{
			if(v[j]>v[j+1])
			{
				aux=v[j];
				v[j]=v[j+1];
				v[j+1]=aux;
			}
		}
		k--;
	}
}
main()
{
	int vet[10];
	int i, n=10;
	int x;

	printf("Escolha uma das 4 opcoes a seguir\n\n");
	scanf("%d", &x);

	printf("1-Quantidade de elementos");
	printf("2-Inserir elementos");
	printf("3-Imprimir elementos desordenados");
	printf("4-Imprimir elementos ordenados");

	switch(x){
    case 1:

        break;

    case 2:

        break;

    case 3:

        break;

    case 4:

        break;

    default:
        printf("Opcao Invalida!!!");
        break;
	}

	printf("Digite 10 numeros a seguir: \n");
	for(i=0; i<n; i++)
	{
		printf("Digite um numero: ");
		scanf("%d", &vet[i]);
	}
	bubble(vet, n);
	printf("\nSequencia Ordenada: ");
	for(i=0; i<n; i++)
		printf("%d", vet[i]);
	getch();
}
