import java.util.Scanner;
import java.util.Arrays;
public class prueba{
	public static void main(String[]args){
		System.out.println("---------- Matriz de 3 x 3 ----------");
		System.out.println("");
		System.out.println("Ingresa 9 números mayores a 10 por favor:");
		Scanner entradaEscaner = new Scanner (System.in);
		int matriz[][] = new int[3][3];
		int matriza[][] = new int[3][3];
		int vector1[]= new int[3];
		int vector2[]= new int[3];
		int entradaTeclado;
		int a = 0;
		String opcion = "";
		for(int i =0; i<9;i++)
		{
			if(a==3)
			{
				a=0;
			}
			entradaTeclado = entradaEscaner.nextInt();;
			if(entradaTeclado<=10)
			{
				System.out.println();
				System.out.println("la entrada: " + entradaTeclado +" no es valida, el número no es mayor que 10.");
				System.out.println();
				System.out.println("Ingresa un número mayor a 10 por favor:");
				i=i-1;
			}
			else
			{
				if(i<3)
				{
					matriz[0][a]=entradaTeclado;
				}
				else if(i>2 && i<6)
				{
					matriz[1][a]=entradaTeclado;
				}
				else
				{
					matriz[2][a]=entradaTeclado;
				}
				a=a+1;
			}
		}

		for (int x=0; x < matriz.length; x++)
		{
			for (int y=0; y < matriz[x].length; y++)
		  	{
		  		matriza[x][y]=matriz[x][y];
		  	}
		}

		int v1=0;
		int v2=0;
		for (int x=0; x < matriz.length; x++)
		{
			for (int y=0; y < matriz[x].length; y++)
		  	{

		  		if(x==0)
		  		{
		  			vector1[v1]=matriz[x][y];
		  			v1=v1+1;
		  		}
		  		else if (x==2)
		  		{
		  			vector2[v2]=matriz[x][y];
		  			v2=v2+1;
		  		}
		  	}
		}

		matriza[0][0]=matriza[0][0]+5;
		matriza[0][1]=matriza[0][1]+5;
		matriza[0][2]=matriza[0][2]+5;

		System.out.println();
		System.out.println("A) Sumar 5 a cada elemento que se encuentra en la primera fila de la matriz e imprimir está matriz resultante:");
		System.out.println();

		for (int x=0; x < matriza.length; x++)
		{
		  System.out.print("|");
		  for (int y=0; y < matriza[x].length; y++)
		  {
		  	System.out.print (matriza[x][y]);
		    if (y!=matriza[x].length-1) System.out.print("\t");
		  }
		  System.out.println("|");
		}

		System.out.println();
		System.out.println("B) Sumar la primera y la tercera fila de la matriz y vaciar estos elementos en un vector e imprimir el resultado obtenido así como el vector correspondiente.");
		System.out.println();

		System.out.print("|");
		int s1=0;
		int s2=0;
		for (int z=0; z < vector1.length; z++)
		{
			s1= s1 + vector1[z];
		  	System.out.print (vector1[z]);
		  	if(z+1<vector1.length)
		  	{
		  		System.out.print("\t");
		  		System.out.print("+");
		  		System.out.print("\t");
		  	}
		}
		System.out.print("| = "+s1);

		System.out.println();
		System.out.print("|");
		for (int z=0; z < vector2.length; z++)
		{
			s2= s2 + vector2[z];
		  	System.out.print (vector2[z]);
		  	if(z+1<vector2.length)
		  	{
		  		System.out.print("\t");
		  		System.out.print("+");
		  		System.out.print("\t");
		  	}
		}
		System.out.print("| = "+s2);

		System.out.println();
		System.out.println();
		System.out.println("C) Imprimir todos los resultados obtenidos así como la matriz original");
		System.out.println();

		for (int x=0; x < matriza.length; x++)
		{
		  System.out.print("|");
		  for (int y=0; y < matriza[x].length; y++)
		  {
		  	System.out.print (matriza[x][y]);
		    if (y!=matriza[x].length-1) System.out.print("\t");
		  }
		  System.out.println("|");
		}

		System.out.println();
		System.out.println();

		System.out.print("|");
		s1=0;
		s2=0;
		for (int z=0; z < vector1.length; z++)
		{
			s1= s1 + vector1[z];
		  	System.out.print (vector1[z]);
		  	if(z+1<vector1.length)
		  	{
		  		System.out.print("\t");
		  		System.out.print("+");
		  		System.out.print("\t");
		  	}
		}
		System.out.print("| = "+s1);

		System.out.println();
		System.out.print("|");
		for (int z=0; z < vector2.length; z++)
		{
			s2= s2 + vector2[z];
		  	System.out.print (vector2[z]);
		  	if(z+1<vector2.length)
		  	{
		  		System.out.print("\t");
		  		System.out.print("+");
		  		System.out.print("\t");
		  	}
		}
		System.out.print("| = "+s2);

		System.out.println();
		System.out.println();
		System.out.println("Matriz Original");
		System.out.println();

		for (int x=0; x < matriz.length; x++)
		{
		  System.out.print("|");
		  for (int y=0; y < matriz[x].length; y++)
		  {
		  	System.out.print (matriz[x][y]);
		    if (y!=matriz[x].length-1) System.out.print("\t");
		  }
		  System.out.println("|");
		}
	}
}