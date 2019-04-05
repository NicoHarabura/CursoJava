package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Digite a primeira nota:");
		String resposta2 = JOptionPane.showInputDialog("Digite a segunda nota:");
		
		System.out.println(resposta1 + resposta2);
		
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double media = (nota1 + nota2)/2;
		
		System.out.printf("Sua média é: %.2f ", media);
	}

}
