#include <stdio.h>
#include <conio.h>

main()
{
    int i, j, num_atual, num_vetor[9]={10,8,9,7,5,6,3,4,2,1};

    for(i=0; i<9; i++)
    {
        num_atual=num_vetor[i]; //num_atual==10
        j=i+1;
        while((j>=0) && (num_atual<num_vetor[j]))
        {
            num_vetor[j+1]=num_vetor[j];
            j--;
        }
        num_vetor[j+1]=num_atual;
        }
	getch();
}
