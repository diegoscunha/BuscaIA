package buscas;

public class Profundidade {

	public static boolean buscaProfundidade(Cidade origem,Cidade destino){
		System.out.println(origem);
        for(Cidade cidade : origem.cidadesVizinhas){
            if(!cidade.visitada){
                if(cidade.equals(destino)){
                    System.out.println("Cheguei! em " + cidade.nome);
                    return true;
                }
                cidade.visitada = true;
                if (buscaProfundidade(cidade,destino)){
                    return true;
                }
                System.out.println("Voltei para " + origem.nome);
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
        Cidade capim = new Cidade("Capim Grosso",false);
        Cidade feira = new Cidade("Feira de Santana",false);
        Cidade juazeiro = new Cidade("Juazeiro",false);
        Cidade salvador = new Cidade("Salvador",false);
        Cidade lauro = new Cidade("Lauro de Freitas",false);
        Cidade aracaju = new Cidade("Aracaju",false);
        Cidade petrolina = new Cidade("Petrolina",false);
        Cidade recife = new Cidade("Recife",false);
        Cidade maceio = new Cidade("Maceio",false);

        capim.addCidadeVizinha(feira);

        feira.addCidadeVizinha(capim);
        feira.addCidadeVizinha(juazeiro);
        feira.addCidadeVizinha(salvador);
        feira.addCidadeVizinha(aracaju);
    
        salvador.addCidadeVizinha(feira);
        salvador.addCidadeVizinha(lauro);
    
        lauro.addCidadeVizinha(salvador);
        lauro.addCidadeVizinha(aracaju);
    
        aracaju.addCidadeVizinha(feira);
        aracaju.addCidadeVizinha(lauro);
        aracaju.addCidadeVizinha(maceio);
    
        maceio.addCidadeVizinha(aracaju);
        maceio.addCidadeVizinha(petrolina);
        maceio.addCidadeVizinha(recife);
    
        recife.addCidadeVizinha(maceio);
        recife.addCidadeVizinha(petrolina);
    
        petrolina.addCidadeVizinha(juazeiro);
        petrolina.addCidadeVizinha(recife);
        petrolina.addCidadeVizinha(maceio);
    
        juazeiro.addCidadeVizinha(petrolina);
        juazeiro.addCidadeVizinha(feira);
    
        Cidade destino = new Cidade("Aracaju",false);
        
        buscaProfundidade(salvador,destino);
	}

}
