#include <stdio.h>					/* Inclus�o da biblioteca */
#include <conio.h>					/* Inclus�o da biblioteca */

bubble (int v[], int qtd) 			/* Fun��o bubble */
{
	int i, j, aux, k=qtd-1; 		/* Defini��o de Vari�veis */
	for(i=0; i<qtd; i++) 			// Limita a quantidade de posi��es que ser� percorrido no vetor
	{
		for(j=0; j<k; j++) 			//
		{
			if(v[j]>v[j+1])  		// Ir� verificar se o n�mero que est� na posi��o � maior que o n�mero que est� na posi��o seguinte
			{
				aux=v[j];			//Est� armazenando o n�mero da posi��o atual
				v[j]=v[j+1];		//Insere o valor menor na posi��o anterior
				v[j+1]=aux;			//Insere o valor maior para a posi��o posterior.
			}
		}
		k--; 						/* Decrementa o valor em k */
	}
}
main() 								/* Programa Principal */	
{
	int vet[20]; 					/* Definindo vetor de 20 posi��es */
	int i, n=20; 						/* Defini��o de vari�veis inteiras */
	printf("Digite 20 numeros a seguir: \n"); 				/* Mensagem para a quantidade de n�meros */
	for(i=0; i<n; i++) 				/* Abre-se uma estrutra de condi��o (la�o) */
	{
		printf("Digite um numero: "); 								/* Mensagem para digitar um n�mero */
		scanf("%d", &vet[i]); 										/* Armazena os valores no vetor */
	}
	bubble(vet, n); 				/* Chamada de fun��o */
	printf("\nSequencia Ordenada: "); 					/* Mensagem mostrando a sequ�ncia ordenada */
	for(i=0; i<n; i++) 									/* Abre-se uma estrutra de condi��o (la�o) */
		printf("%d", vet[i]); 							/* Mostra o vetor com a sequ�ncia ordenada */
	getch(); 											/* L� o valor do usu�rio e n�o imprime na tela */
} 									/* Fim do programa principal */
