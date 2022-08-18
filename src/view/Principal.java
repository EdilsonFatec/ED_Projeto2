package view;
import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int valor;
		String binario="";

		Controller conv = new Controller();
		
	    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número = "));
	    binario =  conv.Conversao(valor,binario);
	    
		System.out.println("O número decimal "+valor+" em binário é "+binario);
	}

}
