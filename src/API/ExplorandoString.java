package API;

public class ExplorandoString {
	
	public static void main(String[] args) {
		String nome = new String();
		nome = "Nicolau";
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.indexOf("N"));
		System.out.println(nome.charAt(1));
		System.out.println(nome.concat(" é ").concat("bem ").concat("doido."));
		System.out.println(nome.startsWith("Nico"));
		System.out.println(nome.endsWith("lau"));
		System.out.println(nome.substring(2, 4));
		System.out.println(nome.isEmpty());
		System.out.println(nome.equalsIgnoreCase("niCoLaU"));
		
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0, 4).concat(" é legal!");
		System.out.println(nome);
		
	
	}

}
