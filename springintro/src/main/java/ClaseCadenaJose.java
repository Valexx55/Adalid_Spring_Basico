public class ClaseCadenaJose implements CadenaAlReves{
		
	public String alreves(String cadenaentrada) {
		// TODO Auto-generated method stub
		String cadena = cadenaentrada;					
		char[] arraycadena =  cadena.toCharArray();
		char[] arraycadenadevuelta = cadena.toCharArray(); 
		int z = 0;
		for (int x=arraycadena.length;x > 0;x--){
			arraycadenadevuelta[z] = arraycadena[x-1];
			z++;		
		}
		return (String.valueOf(arraycadenadevuelta));			
	}
	
}
