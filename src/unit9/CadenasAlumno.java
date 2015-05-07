/**
 * 
 */
package unit9;

/**
 * @author Luz Feliciano Sanjuan
 * @version 25/02/2015
 *
 */
public class CadenasAlumno {

	/**PR�CTICA CADENAS--2a Parte------
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1 = "jamonmonmonmon";
		String cad2 = "mon";
		String cad3 = "bon";
		String cad;
		String cade;
		String espa = " hola que tal  ";
		String minus = "CAMBIAMELO ANDA";
		
		System.out.println(sonIguales(cad1,cad2));
		System.out.println(esMayor(cad1, cad2));
		System.out.println(esMenor(cad1, cad2));
		System.out.println(comparaIgnorandoMayusculas(cad1, cad2));
		cad = reemplazaTodos(cad1,cad2,cad3);
		System.out.println(cad);
		cade = reemplazaPrimero(cad1,cad2,cad3);
		System.out.println(cade);
		muestraSplitLimite("boo:and:foo", ":", 2);
		muestraSplit("boo:and:foo", ":");
		System.out.println(quitaEspacios (espa));
		System.out.println(convertirMayusculas(espa));
		System.out.println(convertirMinusculas(minus));
		System.out.println(longitudCadena(minus));
		System.out.println(empiezaCon("deshacer", "des"));
		System.out.println(acabaEn("pianista","ista"));
		 System.out.println(posicionPrimeraCadena("holo", "a"));
		 System.out.println(extraerSubstring("monada", 2));
		 System.out.println(extraerSubstring("agenda", 1,4));
		 System.out.println(concatenaCadenas("hola","tonto"));
		 
	}

	/**M�todo que compara dos cadenas y te dice si son iguales
	 * @param String cadena1 string de la primera cadena
	 * @param String cadena2 string de la segunda cadena
	 * @return boolean sonIguales devuelve verdadero si son iguales
	 */
	public static boolean sonIguales(String cadena1, String cadena2)
	{
		boolean igual = false;
		char [] vector1 = cadena1.toCharArray();
		char [] vector2 = cadena2.toCharArray();
		
		if( vector1.length == vector2.length)
		{
			for(int i = 0; i < vector1.length; i++)
			{
				if(vector1[i] != vector2[i])
				{
					igual = false;
					break;
				}
				else
					igual = true;
			}
		}
					return igual;
	}
	
	/**M�todo que compara dos cadenas y te dice si la primera de ellas es mayor o no
	 * @param String cadena1 string de la primera cadena
	 * @param String cadena2 string de la segunda cadena
	 * @return boolean sonIguales devuelve verdadero si la primera es mayor
	 */
	public static boolean esMayor(String cadena1, String cadena2)
	{
		boolean mayor = false;
			if(cadena1.length()>cadena2.length())
			mayor = true;
		return mayor;
	}
	
	/**M�todo que compara dos cadenas y te dice si la primera de ellas es menor o no
	 * @param String cadena1 string de la primera cadena
	 * @param String cadena2 string de la segunda cadena
	 * @return boolean sonIguales devuelve verdadero si la primera es menor
	 */
	public static boolean esMenor(String cadena1, String cadena2)
	{
		boolean menor = false;
		if(cadena1.length() < cadena2.length())
			menor = true;
		return menor;
	}
	
	/**M�todo que compara dos cadenas y te dice si son iguales ignorando las may�sculas que pueda haber
	 * @param String cadena1 string de la primera cadena
	 * @param String cadena2 string de la segunda cadena
	 * @return boolean sonIguales devuelve verdadero si son iguales
	 */
	public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
	{
		boolean igualMayus = false;
			//Convertimos cada cadena en un array de caracteres para ir pas�ndo cade car�cter a may�scula
		char [] texto1 = cadena1.toCharArray();
		char [] texto2 = cadena2.toCharArray();
		if(texto1.length == texto2.length)
		{
			for(int i = 0; i < texto1.length ; i++ )
			{
				if (texto1[i] >= 'a' && texto1[i] <='z') //Paso a may�sculas
				{
					int j = (int) texto1[i];
					j = j-32;
					texto1[i] = (char) j;
				}
				
				if (texto2[i] >= 'a' && texto2[i] <='z') //Paso a may�sculas
				{
					int j = (int) texto2[i];
					j = j-32;
					texto2[i] = (char) j;
				}
			
			if(texto1[i] != texto2 [i])
			{
				igualMayus = false;
				break;
			}
			else
				igualMayus = true;
			}
		}
		return igualMayus;
	}
	
	/**M�todo que reemplaza la cadena todas las expresiones
	 * @param String cadena string de la cadena
	 * @param String regla string de la expresi�n a reemplazar
	 * @param String ccambio string del cambio del reemplazamiento
	 * @return String resultado del reemplazamiento
	 */
	public static String reemplazaTodos(String cadena, String regla, String cambio)
	{
		char [] texto1 = cadena.toCharArray();
		char [] texto2 = regla.toCharArray();
		char [] texto3 = cambio.toCharArray();
		int contador = 0;
		
		for(int i = 0; i < texto2.length; i++)
		{
			for(int j = 0; j < texto1.length; j++)
			{
				if(texto1[j] == texto2[i])
				{
					contador++;
				}	
				if(contador == texto2.length)
				{
					contador = 0;
					for(int k = 0; k < texto1.length; k++)
					{
						if(texto1[k] == texto2[contador])
						{
							texto1[k] = texto3[contador];
							contador++;
						}
						if(contador == texto2.length)
							contador = 0;
					}
				}
			}
		}
		String cadena1 = new String(texto1);
		return cadena1;
	}
	
	/**M�todo que reemplaza la cadena s�lo la primera cadena que coincida con la regla
	 * @param String cadena string de la cadena
	 * @param String regla string de la expresi�n a reemplazar
	 * @param String ccambio string del cambio del reemplazamiento
	 * @return String resultado del reemplazamiento
	 */
	public static String reemplazaPrimero(String cadena, String regla, String cambio)
	{
		char [] texto1 = cadena.toCharArray();
		char [] texto2 = regla.toCharArray();
		char [] texto3 = cambio.toCharArray();
		int contador = 0;
		
		for(int i = 0; i < texto2.length; i++)
		{
			for(int j = 0; j < texto1.length; j++)
			{
				if(texto1[j] == texto2[i])
				{
					texto1[j] = texto3[i];				
					contador ++;
				
					if(contador == texto2.length-2)
					{
						break;
					}
				}
			}
		}
		String cadena1 = new String(texto1);
		return cadena1;
	}
		
	/**M�todo que nos divide una cadena en base a una expresi�n y un l�mite que ser� el n�mero total de cadenas 
	 * @param String cadena string de la cadena
	 * @param String regla string de la expresi�n
	 * @param int Limite n�mero total de cadenas que nos muestra
	 */
	public static void muestraSplitLimite(String cadena, String regla, int Limite)
	{
		char [] texto1 = cadena.toCharArray();
		char [] texto2 = regla.toCharArray();

		String nueva = "";
					
		for(int i = 0;i<texto1.length;i++)
		{
			if(texto1[i] == texto2[0])
			{
				texto1[i] = ' ';
			}
		}
		for(int i = 0;i<texto1.length;i++)
			nueva = nueva + texto1[i];
			System.out.print(nueva + " ");
			System.out.println();
			
	}


	/**M�todo que nos divide una cadena en base a una expresi�n 
	 * @param String cadena string de la cadena
	 * @param String regla string de la expresi�n
	 */
	public static void muestraSplit(String cadena, String regla)
	{
		char [] texto1 = cadena.toCharArray();
		char [] texto2 = regla.toCharArray();
		String nueva = "";
		
		for(int i = 0;i<texto1.length;i++)
		{
			if(texto1[i] == texto2[0])
			{
				texto1[i] = ' ';
			}
		}
		for(int i = 0;i<texto1.length;i++)
			nueva = nueva + texto1[i];
			System.out.print(nueva + " ");
			System.out.println();
		
	}
	
	/**M�todo que devuelve un String sin espacios previos/posteriores
	 * @param String cadena string de la cadena
	 * @return String cadenaSin sin espacios
	 */
	public static String quitaEspacios(String cadena)
	{
		String cadenaSin = "";
		for (int i = 0; i < cadena.length(); i++) 
		{
			  if (cadena.charAt(i) != ' ')
			    cadenaSin += cadena.charAt(i);
			
		}
		return cadenaSin;
		
	}
	
	/**M�todo que devuelve un String convertido a may�sculas
	 * @param String cadena string de la cadena
	 * @return String cadena en mayusculas
	 */
	public static String convertirMayusculas(String cadena)
	{
		String cadenaMay = "";
		char [] texto1 = cadena.toCharArray();
		
		for(int i = 0; i < texto1.length ; i++ )
		{
			if (texto1[i] >= 'a' && texto1[i] <='z') //Paso a may�sculas
			{
				int j = (int) texto1[i];
				j = j-32;
				texto1[i] = (char) j;
			}
		}
		for(int i = 0; i < texto1.length ; i++ )
			cadenaMay += texto1[i];
		
		return cadenaMay;
	}
	
	/**M�todo que devuelve un String convertido a min�sculas
	 * @param String cadena string de la cadena
	 * @return String cadena en min�sculas
	 */
	public static String convertirMinusculas(String cadena)
	{
		String cadenaMin = "";
		char [] texto1 = cadena.toCharArray();
		
		for(int i = 0; i < texto1.length ; i++ )
		{
			if (texto1[i] >= 'A' && texto1[i] <='Z') //Paso a may�sculas
			{
				int j = (int) texto1[i];
				j = j+32;
				texto1[i] = (char) j;
			}
		}
		for(int i = 0; i < texto1.length ; i++ )
			cadenaMin += texto1[i];
		
		return cadenaMin;
		
	}
	

	/**M�todo que te devuelve la longitud de una cadena
	 * @param String cadena cadena para calcular su longitud
	 * @return Long longitud de la cadena
	 */
		public static long longitudCadena(String cadena)
		{
			long longitud;
			
			longitud = cadena.length();
			
			return longitud;
		}
		
		/**M�todo que te indica si la cadena comienza con el prefijo dado
		 * @param String cadena a analizar
		 * @param String prefijo dado
		 * @return Boolean devuelve verdadero si empieza por el prefijo dado
		 */
		public static boolean empiezaCon(String cadena, String prefijo)
		{
			boolean empieza = false;
			char [] texto1 = cadena.toCharArray();
			char [] texto2 = prefijo.toCharArray();
			int contador = 0;
			
				for(int j = 0; j < texto2.length; j++)
				{
						if(texto1[j] == texto2[j])
						{
							contador ++;
					
							if(contador == texto2.length)
							{
								empieza = true;
							}
						}
				}
			
			return empieza;
		}
		
		/**M�todo que te indica si la cadena acaba con el sufijo dado
		 * @param String cadena a analizar 
		 * @param String sufijo dado
		 * @return boolean devuelve verdadero si acaba con el sufijo dado
		 */
		public static boolean acabaEn(String cadena, String sufijo)
		{
			boolean acaba = false;
			char [] texto1 = cadena.toCharArray();
			char [] texto2 = sufijo.toCharArray();
			int contador = 0;
			int longitud = texto1.length-1;
			
				for(int j = texto2.length-1; j >= 0 ; j--)
				{
					
						if(texto1[longitud] == texto2[j])
						{
							contador ++;
							longitud--;
						}
				}
				if(contador == texto2.length)
				{
					acaba = true;
				}
			
			return acaba;
		}
		
		/**M�todo que te devuelve la posici�n en la que se encuentra una letra/conjunto de letras en un string
		 * @param String cadena dada
		 * @param String letra a cambiar en la cadena
		 * @return long devuelve la posici�n en la que se encuentra la letra
		 */
		public static long posicionPrimeraCadena(String cadena, String letra)
		{
			long posicion = -1;
			char [] texto1 = cadena.toCharArray();
			char [] texto2 = letra.toCharArray();
			
			for(int j = 0; j < texto1.length; j++)
			{
					if(texto1[j] == texto2[0])
					{
						posicion = j + 1;
					}
			
			}
			return posicion;
		}
		
		/**M�todo que te devuelve una parte del string en una posici�n determinada
		 * @param String cadena a extraer
		 * @param int posicionInicio posicion indicada
		 * @return String devuelve la subcadena
		 */
		public static String extraerSubstring(String cadena, int posicionInicio)
		{
			String subcadena = "";
			char [] texto1 = cadena.toCharArray();
			
			for(int i = posicionInicio; i < texto1.length; i++)
				subcadena += texto1[i]; 
			
			return subcadena;
		}
		
		/**M�todo que te devuelve una parte del string que empieza y acaba en una posici�n determinada
		 * @param String cadena cadena a extraer la sucadena
		 * @param int posicionInicio inicio de la subcadena
		 * @param int posicionFinal final de la subcadena
		 * @return String devuelve la subcadena calculada
		 */
		public static String extraerSubstring(String cadena, int posicionInicio, int posicionFinal)
		{
			String subcadena = "";
			char [] texto1 = cadena.toCharArray();
			
			for(int i = posicionInicio; i <= posicionFinal; i++)
				subcadena += texto1[i]; 
			
			return subcadena;
		}
		
		/**M�todo que te concatena dos cadenas usando el operando +
		 * @param String cadena1 primera cadena a concatenar
		 * @param String cadena2 segunda cadena a concatenar
		 * @return String cadena total
		 */
		public static String concatenaCadenas(String cadena1, String cadena2)
		{
			String cadena = "";
			char [] texto1 = cadena1.toCharArray();
			char [] texto2 = cadena2.toCharArray();
			
			for(int j = 0; j < texto1.length; j++)
			{
				cadena += texto1[j];
			}
				cadena += " ";
				for(int j = 0; j < texto2.length; j++)
				{
					cadena += texto2[j];
				}
			return cadena;
		}
	
		
}
