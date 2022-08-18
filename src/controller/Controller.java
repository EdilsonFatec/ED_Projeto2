package controller;

public class Controller {

	public Controller() {
		super();
	}
	public String Conversao(int valor, String binario) {
	    int resto=0;
// Foi definida a condição de parada como sendo o valor < 2	    
		if  (valor==1) {
			return "1"+binario;
		}
		else {
			if  (valor==0) {
				return "0"+binario;
			}
			else {
				resto = valor % 2;
				binario = Integer.toString(resto)+binario;
				binario = Conversao((valor / 2), binario);
			}
		}
	 return binario;
	}
}
