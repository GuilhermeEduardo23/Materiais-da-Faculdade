/*
Elabore um algoritmo que consiga ordenar um vetor de números definidos pelos usuários.
Para tanto siga a estrutura case abaixo.
1 – Quantidade de elementos a serem inseridos
2 – Inserir elementos
3 – Imprimir elementos ordenados
4 – Imprimir elementos desordenados
5 – Imprimir a soma dos números
6 – Imprimir a soma dos números pares e ímpares
7 – Imprimir a multiplicação dos números pares
8 – Imprimir a multiplicação da soma dos núm pares com os núm ímpares
9 – Sair

*/
#include<stdio.h>

void InsertionSort(int vetorDesordenado[], int tamanhoVetor ){

   int i, j, valorAtual;

   for( j=1; j < tamanhoVetor; j++ ){
      valorAtual = vetorDesordenado[j];
      i = j-1;

      while(i >= 0 && vetorDesordenado[i] > valorAtual){
        vetorDesordenado[i+1] = vetorDesordenado[i];
        i--;
      }

      vetorDesordenado[i+1] = valorAtual;
   }
}

void main(){
    int vet[100];
    int vetaux[100];
    int vetpar[100];
    int vetimpar[100];
    int somatotal = 0;
    int somapar = 0;
    int somaimpar = 0;
    int multpar = 1;
    int multsomapi = 0;
    int i ,n, c, x, y;
    n = 0;
    x = 0;
    y = 0;

    do{
        printf("\n1 - Qtd de elementos\n");
        printf("2 - Inserir elementos\n");
        printf("3 - Imprimir elementos ordenados\n");
        printf("4 - Imprimir elementos desordenados\n");
        printf("5 - Imprimir a soma dos numeros\n");
        printf("6 - Imprimir a soma dos numeros pares e impares\n");
        printf("7 - Imprimir a multiplicacao dos numeros pares\n");
        printf("8 - Imprimir a multiplicacao da soma dos numeros pares com os numeros impares \n");
        printf("9 - Sair\n");
        scanf("%d", &c);

        switch(c){
            case 1 :
                printf("Deseja inserir quantos elementos?\n");
                scanf("%d", &n);
            break;

            case 2:
                for(i = 0; i < n; i++){
                    printf("Digite o %d numero: ", i + 1);
                    scanf("%d",&vet[i]);
                    vetaux[i] = vet[i];

                    if(vet[i] % 2 == 0){
                        vetpar[x] = vet[i];
                        x++;
                    }
                    else{
                        vetimpar[y] = vet[i];
                        y++;
                    }
                }
            break;

            case 3:
                InsertionSort(vet, n);
                printf("\nValores Ordenados\n");

                for(i = 0; i < n; i++){
                    printf("%d  ", vet[i]);
                }
            break;

            case 4:
                printf("\nValores Desordenados\n");

                for(i = 0; i < n; i++){
                    printf("%d  ", vetaux[i]);
                }
            break;

            case 5:
                printf("\nSoma Total\n");
                somatotal = vet[0];
                for(i = 0; i < (n - 1); i++){
                    somatotal = somatotal + vet[i+1];
                }

                printf("%d", somatotal);
            break;

            case 6:
                for(i = 0;i < x;i++){
                    somapar = somapar + vetpar[i];
                }
                for(i = 0;i < y;i++){
                    somaimpar = somaimpar + vetimpar[i];
                }
                printf("\nSoma dos Elementos Pares:\n%d", somapar);
                printf("\nSoma dos Elementos Impares:\n%d", somaimpar);

            break;

            case 7:
                printf("\nMultiplicacao dos Numeros Pares\n");

                for(i = 0; i < x; i++){
                    multpar = multpar * vetpar[i];
                }

                printf("%d", multpar);
            break;

            case 8:
                printf("Imprimir a multiplicacao da soma dos numeros pares com os numeros impares \n");
                multsomapi = somapar * somaimpar;
                printf("%d", multsomapi);
            break;
        }

    }while(c != 9);

	system("pause");
}

