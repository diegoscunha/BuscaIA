package buscas;

public class Rota {
	public int id;
	public Cidade cidade1;
	public Cidade cidade2;
	public float distancia;
	public int qualidade;
	
	
    public Rota(int id, Cidade cidade1, Cidade cidade2, float distancia, int qualidade){
    	this.id = id;
    	this.cidade1 = cidade1;
    	this.cidade2 = cidade2;
    	this.distancia = distancia;
    	this.qualidade = qualidade;
    }
}
