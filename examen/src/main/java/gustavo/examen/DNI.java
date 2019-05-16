package gustavo.examen;

import java.util.regex.Pattern;

public class DNI {

	private static final String[] letraDni = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J",
			"Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

	public static boolean validarDni(String dni) {

		String dniPattern = "\\d{8}[^uioñ]{1}";

		if (Pattern.matches(dniPattern, dni)) {
			return true;
		}

		return false;
	}

	public static String getLetraDni(String numeroDni) {
		
		String comprobarNumeros = "\\d{8}";
		
		if (Pattern.matches(comprobarNumeros, numeroDni)) {
			
			float num = Float.parseFloat(numeroDni);
			int posLetra = (int)num%23;
			
			return letraDni[posLetra];
			
		}
		
		return "";
		
	}

}
