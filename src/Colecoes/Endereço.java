package Colecoes;

public class Endereço {

	String endereco;
	int numero;
	String complemento;
	
	Endereço (String endereco, int numero, String complemento){
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1; 
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereço other = (Endereço) obj;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
	
	
	
}
