
/* Vetores * /

/*   9 - 3 - 6 - 4 - 8 - 2 - 7 - 5 -1   */


/*   5-9-3-1-7-8-4-6-2   */






/* 
-> Entrar com a qtde de n�meros
-> Entrar com os n�meros
-> Ordenar
-> Imprimir n�meros desordenados
-> Imprimir n�meros ordenados
*/



#include<stdio.h>
#include<conio.h>
bubble (int v[], int qtd)
{
   int i, j, aux, k=qtd-1;
   for(i=0; i<qtd; i++)
   {    
      for(j=0; j<k; j++)
      {
         if(v[j]>v[j+1])
         {
             aux=v[j];
             v[j]=v[j+1];
             v[j+1]=aux;
         }
      }
      k--;
   }
}
main()
{
   int vet[50];
   int i, n;
   printf ("Digite a quantidade de numeros: ");
   scanf ("%d", &n); 
   for (i=0; i<n; i++)   {
       printf ("Digite um numero: ");
       scanf ("%d", &vet[i]);   }  
   printf ("Sequencia: ");
   for (i=0; i<n; i++)
       printf ("%d ", vet[i]);
   bubble(vet, n);
   printf ("\nSequencia Ordenada: ");
   for (i=0; i<n; i++)
       printf ("%d ", vet[i]);
   getch();
}


