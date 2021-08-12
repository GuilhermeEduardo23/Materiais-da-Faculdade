#include <stdio.h>

void main()
{
	float nota1, nota2, nota3, notaFinal;
	
	printf("Informe a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("\n\nInforme a segunda nota: ");
	scanf("%f", &nota2);
	
	printf("\n\nInforme a terceira nota: ");
	scanf("%f", &nota3);
	
	/*Média Aritmética
	notaFinal = (nota1 + nota2 + nota3)/3;*/
	
	//Média Aritmética Ponderada
	notaFinal = (nota1*1 + nota2*2 + nota3*5)/8;
	
	if(notaFinal < 5)
	{
		printf("\n\nSua nota final e' %2.2f e voce foi reprovado.", notaFinal);
	}
	
	else if(notaFinal > 5 || notaFinal < 7)
	{
		printf("\n\nSua nota final e' %2.2f e voce tera que fazer a prova final.\n\n", notaFinal);
	}
	
	else
	{
		printf("\n\nSua nota final e' %2.2f e voce foi aprovado.", notaFinal);
	}
}
