package buscas;

public class Rota {
	public int id;
	public String cidade1;
	public String cidade2;
	public float distancia;
	public int qualidade;
	
	
    public Rota(int id, String cidade1, String cidade2, float distancia, int qualidade){
    	this.id = id;
    	this.cidade1 = cidade1;
    	this.cidade2 = cidade2;
    	this.distancia = distancia;
    	this.qualidade = qualidade;
    }
}
