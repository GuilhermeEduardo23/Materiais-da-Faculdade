#include<stdio.h>

float tabela[5][4] = {{3000, 2500, 500, 700},
                           {1.1, 1.9, 0.7, 1},
                           {2.5, 0.8, 4.0, 2.2},
                           {50, 92, 120, 50},
                           {65, 90, 140, 70}};

float individuo[100][7];


void main(){
    void montagem();
    void acabamento();
    void valorTotal();
    void imprimir();
    int i, j;

    for(i = 0;i < 100;i = i + 2){
        for(j = 0;j < 4;j++){
            if(j == 0){
                individuo[i][j] = rand()%3000;
                individuo[i+1][j] = tabela[0][j] - individuo[i][j];
            }
            else if(j == 1){
                individuo[i][j] = rand()%2500;
                individuo[i+1][j] = tabela[0][j] - individuo[i][j];
            }
            else if(j == 2){
                individuo[i][j] = rand()%500;
                individuo[i+1][j] = tabela[0][j] - individuo[i][j];
            }
            else if(j == 3){
                individuo[i][j] = rand()%700;
                individuo[i+1][j] = tabela[0][j] - individuo[i][j];
            }
        }
    }

    montagem(individuo);
    acabamento(individuo);
    valorTotal(individuo);
    imprimir(individuo);

	system("pause");
}

void montagem(float ind[100][7]){
    int i, j;
    float somaMontagem = 0;

    for(i = 0;i < 100;i = i + 2){
        for(j = 0;j < 4;j++){
            somaMontagem = somaMontagem + (ind[i][j] * tabela[1][j]);
        }
        ind[i][4] = somaMontagem;
        somaMontagem = 0;
    }
}

void acabamento(float ind[100][7]){
    int i, j;
    float somaAcabamento = 0;

    for(i = 0;i < 100;i = i + 2){
        for(j = 0;j < 4;j++){
            somaAcabamento = somaAcabamento + (ind[i][j] * tabela[2][j]);
        }
        ind[i][5] = somaAcabamento;
        somaAcabamento = 0;
    }
}

void valorTotal(float ind[100][7]){
    int i, j;
    float somaTotal = 0;

    for(i = 0;i < 100;i++){
        for(j = 0;j < 4;j++){
            somaTotal = somaTotal + (ind[i][j] * tabela[3][j]);
        }
        ind[i][6] = somaTotal;
        somaTotal = 0;
    }
}

void imprimir(int ind[100][7]){
    int i, j;
    int x = 1;

    printf("\t\t\t\tTabela de Individuos");
    for(i = 0;i < 100;i++){
            printf("\n");
            if(i % 2 == 0){
                printf("\n\n\tIndividuo %d\n", x);
                printf("\n");
                printf("\t  M1\t  M2\t  M3\t  M4\tMont(Hrs)\tAcab(Hrs)\tTotal(R$)\n");
                printf("\t--------------------------------------------------------------------------\n");
                printf("Prop");
                x++;
            }
            else{
                printf("Terc");
            }

        for(j = 0;j < 7;j++){
                if((j == 4) || (j == 5)){
                    if(i % 2 == 0){
                    printf("\t|%6.1f|", individuo[i][j]);
                    }
                    else{
                        printf("\t|******|");
                    }
                }
                else if(j == 6){
                    printf("\t|%8.1f|", individuo[i][j]);
                }
                else{
                    printf("\t|%4.0f|", individuo[i][j]);
                }
        }
        printf("\n\t--------------------------------------------------------------------------");
    }
}
