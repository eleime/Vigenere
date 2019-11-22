package Vigenere;
import java.util.Scanner;
public class Vigenere
{
	public static void main (String g[])
	{
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int [26][26];
		char abecedarioM[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char abecedariom[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
                String texto="";
		String maxClave="";
		String clave="";
                
 
		int numero=1;
		int numero2=1;
		int opc=0;
                int cont=0;
		for (int i=0;i<26;i++) 
		{
			for (int j=0; j<26; j++) 
				{
					matriz[i][j]= numero;
					numero++;
					if(numero>26)
					{
						numero=1;
					}
				}
			numero++;
			if(numero>26) 
			{
				numero=1;
			}
 
		}
		for (int x=0;x<26;x++) 
		{
			for (int y=0; y<26;y++ ) 
			{
				System.out.print(matriz[x][y] + " ");
					
			}
			System.out.println(" ");
		}
		System.out.println("Hola, Que deseas hacer?");
		System.out.println("1: Cifrar");
		System.out.println("2: Descifrar");
		opc=sc.nextInt();
		if (opc==1) 
		{
			
		
			System.out.println("Ingresa el texto a cifrar:");
			texto= sc.nextLine();
			texto=texto.toLowerCase();
			System.out.println("Ingresa la clave para cifrar");
			clave=sc.nextLine();
			clave=clave.toLowerCase();
	                //char[] texto2= new char[texto.length()];
	        
	        String texto2="";
	        int pass=0;
			for(int c=0;c<texto.length();c++)
	                {
	                        if(texto.charAt(c)!=' ')
	                        {
	                                texto2+=texto.charAt(c);
	 
	                        }
	                }
	        for (int d=0;d<=texto2.length();d++) 
	        {
	        	
	        	if(cont<clave.length())
	        	{
	        		maxClave+=clave.charAt(cont);
	                        cont++;
	        	}
	        	else
	        	{
	        		cont=0;
	                        maxClave+=clave.charAt(cont);
	        	}
	        	
	        }
	        System.out.println(maxClave);
	        System.out.println(texto2);
			char [] textoC= new char[texto2.length()];
			char [] claveC= new char[maxClave.length()];
			int [] cifrado= new int[texto2.length()];
	 
			for (int a=0; a<texto2.length(); a++) 
			{	
				textoC[a]=texto2.charAt(a);
			}
			
	        for (int b=0; b<clave.length(); b++) 
			{	
				claveC[b]=maxClave.charAt(b);
			}
	                int mat=0;
			int mat2=0;
			for (int t=0;t<texto2.length(); t++) 
			{
				for (int h=0; h<26;h++) 
				{
					if (textoC[t]==abecedariom[h]) 
					{
						mat=numeros[h];
						
					}
					if (claveC[t]==abecedariom[h]) 
					{
						mat2=numeros[h];
					}

					cifrado[t]=matriz[mat2][mat];
					mat=0;
					mat2=0;
				}
			}
	                for(int k=0; k<texto2.length(); k++)
	                {
	                    System.out.println(cifrado[k] + " ");
	                }
		}
		else if(opc==2)
		{
			
		}
		else
		{
			Systm.out.println("Error, ingresaste una opcion erronea");
			
		}
 
 
	}
}