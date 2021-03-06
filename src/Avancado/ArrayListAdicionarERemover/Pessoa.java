package Avancado.ArrayListAdicionarERemover;

import java.util.ArrayList;

public class Pessoa {

	public Pessoa(String nome)
    {
        m_nome = nome;
    }

    public String getNome()
    {
        return m_nome;
    }

    private String m_nome;
    
    public static void main(String[] args) {
    	ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Adiciona algumas pessoas.
        pessoas.add(new Pessoa("Jos�"));
        pessoas.add(new Pessoa("Maria"));
        pessoas.add(new Pessoa("Pedro"));

        System.out.print("Pessoas cadastradas:\n");
        for(int i = 0; i < pessoas.size(); i++)
        {
            System.out.print(pessoas.get(i).getNome() + "\n");
        }

        // Removendo Pedro:
        for(int i = 0; i < pessoas.size(); i++)
        {
            Pessoa p = pessoas.get(i);

            if(p.getNome().equals("Pedro"))
            {
                // Encontrou uma pessoa cadastrada com nome "Pedro".

                // Remove.
                pessoas.remove(p);

                // Sai do loop.
                break;
            }
        }

        System.out.print("Pessoas cadastradas ap�s remo��o:\n");
        for(int i = 0; i < pessoas.size(); i++)
        {
            System.out.print(pessoas.get(i).getNome() + "\n");
        }
	}
}
