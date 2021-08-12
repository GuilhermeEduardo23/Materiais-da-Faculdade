#include<stdio.h>
#include<conio.h>

void insertionSort(int *vet, int n, int x){
	int i, j;
	i = 0;
	j = 0;
	while((i < n) && (vet[i] < x)){
		i++;
	}
    for(j = (n - 1); j >= i; j--){
        vet[j+1] = vet[j];
    }
    vet[i] = x;
}

void main(){
	int vet[100], t, n, x, i;

	puts("\nDigite a quantidade de elementos a serem inseridos:\n");
	scanf("%d", &t);

	for(n = 0; n < t; n++){
		printf("Digite um numero!\n");
		scanf("%d", &x);
		insertionSort(vet, n, x);
	}

	puts("\nValores Ordenados\n");

	for(i = 0; i < t; i++){
		printf("%d", &vet[i]);
	}
	system("pause");
}
