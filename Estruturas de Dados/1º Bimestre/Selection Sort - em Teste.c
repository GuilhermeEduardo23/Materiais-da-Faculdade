#include <stdio.h>
#include <conio.h>

selection(int vetor[], int x)
{
    int num_menor, aux, n, t;

    for(n=0; n<x-1; n++)
    {
        num_menor=n;
        for(t=n+1; t<x; t++)
        {
            if(vetor[n]>vetor[t])
                num_menor=t;
        }
        if(n!=num_menor)
        {
            aux=vetor[n];
            vetor[n]=vetor[num_menor];
            vetor[num_menor]=aux;
        }
    }
}

int main()
{
    int x;
    int y=10;
    int vetor[x];

    printf("Digite a quantidade de numeros para serem inseridos: ");
    for(x=0; x<y; x++){
        printf("Digite um numero: ");
        scanf("%d", &vetor[x]);
    }

    selection(vetor, x);

    printf("Sequencia Ordenada: ");
    for(x=0; x<5; x++)
        printf("%d - ", vetor[x]);

    getch();
}
