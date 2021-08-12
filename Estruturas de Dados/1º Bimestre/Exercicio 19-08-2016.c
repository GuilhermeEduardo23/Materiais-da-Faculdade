#include <stdio.h>					/* Inclusão da biblioteca */
#include <conio.h>					/* Inclusão da biblioteca */

bubble (int v[], int qtd) 			/* Função bubble */
{
	int i, j, aux, k=qtd-1; 		/* Definição de Variáveis */
	for(i=0; i<qtd; i++) 			// Limita a quantidade de posições que será percorrido no vetor
	{
		for(j=0; j<k; j++) 			//
		{
			if(v[j]>v[j+1])  		// Irá verificar se o número que está na posição é maior que o número que está na posição seguinte
			{
				aux=v[j];			//Está armazenando o número da posição atual
				v[j]=v[j+1];		//Insere o valor menor na posição anterior
				v[j+1]=aux;			//Insere o valor maior para a posição posterior.
			}
		}
		k--; 						/* Decrementa o valor em k */
	}
}
main() 								/* Programa Principal */	
{
	int vet[20]; 					/* Definindo vetor de 20 posições */
	int i, n=20; 						/* Definição de variáveis inteiras */
	printf("Digite 20 numeros a seguir: \n"); 				/* Mensagem para a quantidade de números */
	for(i=0; i<n; i++) 				/* Abre-se uma estrutra de condição (laço) */
	{
		printf("Digite um numero: "); 								/* Mensagem para digitar um número */
		scanf("%d", &vet[i]); 										/* Armazena os valores no vetor */
	}
	bubble(vet, n); 				/* Chamada de função */
	printf("\nSequencia Ordenada: "); 					/* Mensagem mostrando a sequência ordenada */
	for(i=0; i<n; i++) 									/* Abre-se uma estrutra de condição (laço) */
		printf("%d", vet[i]); 							/* Mostra o vetor com a sequência ordenada */
	getch(); 											/* Lê o valor do usuário e não imprime na tela */
} 									/* Fim do programa principal */
