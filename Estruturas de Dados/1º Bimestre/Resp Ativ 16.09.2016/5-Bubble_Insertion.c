#include<stdio.h>
#include<conio.h>
#define MAXT 1000
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
void insercaodireta(int*vet, int n,int x )
{
 int i,j;
 i=0;
  while ((i < n) && (vet[i] < x))
  i++;
  for (j=(n-1);j>=i;j--)
    vet[j+1] = vet[j];
    vet[i]=x;
}
main () {
   int vet[100], vetaux[100];
   int i, n, x;        
     char ch;          
     do {
     	 puts ("\n\n1 - Quant. de elementos"); 
         puts ("2 - Inserir elementos"); 
		 puts ("3 - Ordenação Bubblesort"); 
		 puts ("4 - Ordenação InsertionSort");      
         puts ("5 - Imprimir vetor desordenado"); 
         puts ("6 - Imprimir vetor ordenado");                      
         puts ("7 - Sair"); 
		                                
         ch = getch();
         switch (ch) {
         	
         	  case '1':
                printf ("\nDigite a quantidade de numeros: ");
                scanf ("%d", &n);
               break;
         	
               case '2':
                for (i=0; i<n; i++)
                 {
                  printf ("\nDigite um numero: ");
                  scanf ("%d", &x);
                  vet[i] = x;
                  vetaux[i] = x;
                 }  
               break;               
               case '3':              	
               	bubble(vet, n);
                puts ("\nBubbleSort Finalizado!");                
               break;        
               case '4':
				for (i=0;i<n;i++)
				{
				x=vet[i];
				insercaodireta(vet,i,x);
				}
                puts ("\nInsertionSort Finalizado!");
               break;  
               case '5':
                puts ("\nSequencia Desordenada: ");
                for (i=0; i<n; i++)
                printf ("%d ", vetaux[i]);
               break;
               case '6':
                puts ("\nSequencia Ordenada: ");
				for (i=0; i<n; i++)
                printf ("%d ", vet[i]);
               break;   
         }
     }while (ch != '7');
}












