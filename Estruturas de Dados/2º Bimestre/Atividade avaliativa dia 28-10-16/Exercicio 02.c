/*
Faça um algoritmo que ordene 20 números armazenados em um vetor aplicando a ordenação
com o algoritmo Bubblesort, ao final da execução mostre na tela o vetor ordenado e
desordenado e também os números pares e os número impares deste vetor.
*/

#include<stdio.h>

void BubbleSort(int v[], int qtd){
    int i, j, aux;
    int k = qtd - 1;

    for(i = 0; i < qtd; i++){
        for(j = 0; j < k; j++){
            if(v[j] > v[j+1]){
                aux = v[j];
                v[j] = v[j+1];
                v[j+1] = aux;
            }
        }
        k--;
    }
}

void main(){
    int i;
    int vet[20];

    printf("Digite 20 numeros:\n");

    for(i = 0; i < 20; i++){
        printf("Digite o numero na posicao %d:\n", i + 1);
        scanf("%d", &vet[i]);
    }

    printf("Sequencia Desordenada:\n");
    for(i = 0; i < 20; i++){
        printf("    %d", vet[i]);
    }
    printf("\n");

    BubbleSort(vet, 20);

    printf("Vetor Ordenado:\n");
    for(i = 0; i < 20; i++){
        printf("    %d", vet[i]);
    }
    printf("\n");

    printf("Numeros Pares:\n");
    for(i = 0; i < 20; i++){
        if(vet[i] % 2 == 0){
            printf("    %d", vet[i]);
        }
    }
    printf("\n");

    printf("Numeros Impares:\n");
    for(i = 0; i < 20; i++){
        if(vet[i] % 2 != 0){
            printf("    %d", vet[i]);
        }
    }
    printf("\n");

	system("pause");
}
