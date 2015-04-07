
package buscas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		//Profundidade();
		AEstrela();
	}
	
	public static void Profundidade(){
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
        
        Profundidade.buscaProfundidade(juazeiro,destino);
	}

	public static void AEstrela(){

		List<Cidade> ArrayCidade = new ArrayList<Cidade> ();
		List<Rota> ArrayRota = new ArrayList<Rota> ();
		// ( id, cidade1, cidade2, distancia, qualidade)
		ArrayRota.add(new Rota(1, "A", "D", 70, 80));
		ArrayRota.add(new Rota(2, "A", "C", 60, 70));
		ArrayRota.add(new Rota(3, "A", "B", 10, 30));
		ArrayRota.add(new Rota(4, "A", "I", 200, 90));
		ArrayRota.add(new Rota(5, "B", "E", 30, 60));
		ArrayRota.add(new Rota(6, "D", "F", 20, 60));
		ArrayRota.add(new Rota(7, "C", "E", 80, 90));
		ArrayRota.add(new Rota(8, "F", "G", 25, 80));
		ArrayRota.add(new Rota(9, "C", "I", 70, 50));
		ArrayRota.add(new Rota(10, "E", "I", 50, 70));
		ArrayRota.add(new Rota(11, "G", "H", 30, 100));
		ArrayRota.add(new Rota(12, "G", "I", 110, 70));
		
		ArrayCidade.add(new Cidade("A",false)); //0
		ArrayCidade.add(new Cidade("B",false)); //1
		ArrayCidade.add(new Cidade("C",false)); //2
		ArrayCidade.add(new Cidade("D",false)); //3
		ArrayCidade.add(new Cidade("E",false)); //4
		ArrayCidade.add(new Cidade("F",false)); //5
		ArrayCidade.add(new Cidade("G",false)); //6
		ArrayCidade.add(new Cidade("H",false)); //7
		ArrayCidade.add(new Cidade("I",false)); //8


		ArrayCidade.get(0).cidadesVizinhas.add(ArrayCidade.get(3)); // Rota 01 - A, D
		ArrayCidade.get(3).cidadesVizinhas.add(ArrayCidade.get(0)); // Rota 01 - D, A
		
		ArrayCidade.get(0).cidadesVizinhas.add(ArrayCidade.get(2)); // Rota 02 - A, C
		ArrayCidade.get(2).cidadesVizinhas.add(ArrayCidade.get(0)); // Rota 02 - C, A
		
		ArrayCidade.get(0).cidadesVizinhas.add(ArrayCidade.get(1)); // Rota 03 - A, B
		ArrayCidade.get(1).cidadesVizinhas.add(ArrayCidade.get(0)); // Rota 03 - B, A
		
		ArrayCidade.get(0).cidadesVizinhas.add(ArrayCidade.get(8)); // Rota 04 - A, I
		ArrayCidade.get(8).cidadesVizinhas.add(ArrayCidade.get(0)); // Rota 04 - I, A
		
		ArrayCidade.get(1).cidadesVizinhas.add(ArrayCidade.get(4)); // Rota 05 - B, E
		ArrayCidade.get(4).cidadesVizinhas.add(ArrayCidade.get(1)); // Rota 05 - E, B
		
		ArrayCidade.get(2).cidadesVizinhas.add(ArrayCidade.get(4)); // Rota 07 - C, E
		ArrayCidade.get(4).cidadesVizinhas.add(ArrayCidade.get(2)); // Rota 07 - E, C
		
		ArrayCidade.get(2).cidadesVizinhas.add(ArrayCidade.get(8)); // Rota 09 - C, I
		ArrayCidade.get(8).cidadesVizinhas.add(ArrayCidade.get(2)); // Rota 09 - I, C
		
		ArrayCidade.get(3).cidadesVizinhas.add(ArrayCidade.get(5)); // Rota 06 - D, F
		ArrayCidade.get(5).cidadesVizinhas.add(ArrayCidade.get(3)); // Rota 06 - F, D
		
		ArrayCidade.get(4).cidadesVizinhas.add(ArrayCidade.get(8)); // Rota 10 - E, I
		ArrayCidade.get(8).cidadesVizinhas.add(ArrayCidade.get(4)); // Rota 10 - I, E
		
		ArrayCidade.get(5).cidadesVizinhas.add(ArrayCidade.get(6)); // Rota 08 - F, G
		ArrayCidade.get(6).cidadesVizinhas.add(ArrayCidade.get(5)); // Rota 08 - G, F
		
		ArrayCidade.get(6).cidadesVizinhas.add(ArrayCidade.get(7)); // Rota 11 - G, H
		ArrayCidade.get(7).cidadesVizinhas.add(ArrayCidade.get(6)); // Rota 11 - H, G
		
		ArrayCidade.get(6).cidadesVizinhas.add(ArrayCidade.get(8)); // Rota 12 - G, I
		ArrayCidade.get(8).cidadesVizinhas.add(ArrayCidade.get(6)); // Rota 12 - I, G
		
		
		//System.out.println("A:" + ArrayCidade.get(0).nome +" se liga com " + ArrayCidade.get(0).cidadesVizinhas.get(0).nome);
		//System.out.println("D:" + ArrayCidade.get(0).cidadesVizinhas.get(0).nome +" se liga com " + ArrayCidade.get(0).cidadesVizinhas.get(0).cidadesVizinhas.get(1).nome);
		
        //Cidade destino = new Cidade("D",false);
        
        Profundidade.buscaProfundidade(ArrayCidade.get(0),ArrayCidade.get(7));
		
	}
	
}
