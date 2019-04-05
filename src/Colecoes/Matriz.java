package Colecoes;

public class Matriz {

	public static void main(String[] args) {
		double notaj[][] = {{7.7, 8.6},{6.2, 9.7}};
		
		double notap[][] = new double[2][];
		notap[0] = new double[2];
		notap[1] = new double[2];
		notap[0][0] = 7.7;
		notap[0][1] = 8.6;
		notap[1][0] = 6.2;
		notap[1][1] = 9.7;
		
		double totalj = 0;
		int tamanhoj = 0;
		for (int i = 0; i < notaj.length ; i++){
			for (int j = 0; j < notaj[i].length; j++){
				totalj += notaj[i][j];
				tamanhoj++;
			}
		}
		
		double totalp = 0;
		int tamanhop = 0;
		
		for(double[] notaparcial: notap){
			for (double nota: notaparcial){
				totalp += nota;
				tamanhop++;
			}
		}
		System.out.println(totalj/tamanhoj);
		System.out.println(totalp/tamanhop);
	}
}
