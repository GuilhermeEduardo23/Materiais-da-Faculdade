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
main () {
   int vet[50], vetaux[50];
   int i, n, x;        
     char ch;          
     do {
     	 puts ("\n\n1 - Quant. de numeros no vetor"); 
         puts ("2 - Inserir elementos");       
         puts ("3 - Imprimir elementos desordenados"); 
         puts ("4 - Imprimir elementos ordenados");                      
         puts ("5 - Sair"); 
		                                
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
                puts ("\nSequencia Desordenada: ");
                for (i=0; i<n; i++)
                printf ("%d ", vetaux[i]);
               break;
               case '4':
                bubble(vet, n);
                puts ("\nSequencia Ordenada: ");
                for (i=0; i<n; i++)
                printf ("%d ", vet[i]);
               break;   
         }
     }while (ch != '5');
}












