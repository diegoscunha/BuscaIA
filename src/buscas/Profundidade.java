package buscas;

public class Profundidade {

	public static boolean buscaProfundidade(Cidade origem,Cidade destino){
		System.out.println(origem);
        for(Cidade cidade : origem.cidadesVizinhas){
            if(!cidade.visitada){
                if(cidade.equals(destino)){
                    System.out.println("Cheguei em " + cidade.nome+"!");
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
	

}
