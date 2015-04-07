package buscas;

import java.util.ArrayList;

public class Cidade {
	public String nome;
    public Boolean visitada;
    public ArrayList<Cidade> cidadesVizinhas;

    public Cidade(String nome,Boolean visitada){
        this.nome = nome;
        this.visitada = visitada;
        this.cidadesVizinhas = new ArrayList<Cidade>();
    }
    
    public void addCidadeVizinha(Cidade cidade){
        this.cidadesVizinhas.add(cidade);
    }
    
    public String toString(){
        return "Cidade: " + this.nome;
    }
    
    public Boolean equals(Cidade outra){
        return this.nome == outra.nome;
    }
}
