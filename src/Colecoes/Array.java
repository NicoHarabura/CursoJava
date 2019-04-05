package Colecoes;

public class Array {
	
	public static void main(String[] args) {
		double notas1[] = {7.0, 8.5, 3.5};
		
		double notas2[] = new double[3];
		notas2[0] = 7.0;
		notas2[1] = 8.5;
		notas2[2] = 3.5;
		
		double totalnotas1 = 0;
		
		for (int i = 0; i < notas1.length; i++){
			totalnotas1 += notas1[i];
		}
		System.out.println(totalnotas1/notas1.length);
		
		double totalnotas2 = 0;
		
		for (int i = 0; i < notas2.length; i++){
			totalnotas2 += notas2[i];
		}
		
		System.out.println(totalnotas2/notas2.length);
		
		
		
		
	}

}
