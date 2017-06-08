
public class ClaseCadenaVale implements CadenaAlReves{

	public String alreves(String palabra_in) {
		String cadena_reves = "";
		int longuitud = palabra_in.length();
		char char_aux = ' ';
		
		for (int i = longuitud-1; i >=0; i= i-1)
		{
			char_aux = palabra_in.charAt(i);
			cadena_reves = cadena_reves + char_aux;
			
		}
		
		return cadena_reves;
	}

	
}
