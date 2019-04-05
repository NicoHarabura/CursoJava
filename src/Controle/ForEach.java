package Controle;

import org.omg.Messaging.SyncScopeHelper;

public class ForEach {

	public static void main(String[] args) {
double notas1[] = {7.0, 8.5, 3.5};
		
		double notas2[] = new double[3];
		notas2[0] = 7.0;
		notas2[1] = 8.5;
		notas2[2] = 3.5;
		
		double totalnotas1 = 0;
	for (double nota: notas2){
		totalnotas1 += nota;
	}
	
		
		double totalnotas2 = 0;
	for (double nota: notas2){
		totalnotas2 += nota;
	}
	System.out.println(totalnotas1/notas1.length);
	System.out.println(totalnotas2/notas2.length);
		
	}
}
