/*
Elabore um programa que leia somente 10 números e faça a ordenação dos elementos
utilizando SelectionSort. Ao final da ordenação imprima na tela os elementos ordenados
e a multiplicação dos números impares após a ordenação do vetor.
*/

#include <stdio.h>

void SelectionSort (int vetor[],int max){
  int i, j, min, aux;

  for (i = 0; i < (max - 1); i++){
    min = i;
    for (j = i+1; j < max; j++){
        if (vetor[j] < vetor[min]){
            min = j;
        }
    }

    if (i != min) {
        aux = vetor[i];
        vetor[i] = vetor[min];
        vetor[min] = aux;
    }
  }
}

void main(){
    int vet[10];
    int i ,n;
    n = 10;
    int resultado = 1;

    printf("Digite 10 numeros:\n");
    for(i = 0; i < n; i++){
        scanf("%d",&vet[i]);
    }

    printf ("\nVetor Desordenado:\n");
    for (i = 0;i < n;i++){
        printf("    %d",vet[i]);
    }

    SelectionSort(vet,n);

    printf ("\nVetor Ordenado:\n");
    for (i = 0;i < n;i++){
        printf("    %d",vet[i]);
    }

    printf("\nNumeros Impares:\n");
    for (i = 0;i < n;i++){
        if(vet[i] % 2 != 0){
            printf("    %d", vet[i]);
            resultado = (resultado * vet[i]);
        }
    }

    printf("\nMultiplicacao dos Numeros Impares:\n %d", resultado);


}
