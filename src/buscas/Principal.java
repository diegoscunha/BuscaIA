
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
		
		Cidade A = new Cidade("A",false); //0
		Cidade B = new Cidade("B",false); //1
		Cidade C = new Cidade("C",false); //2
		Cidade D = new Cidade("D",false); //3
		Cidade E = new Cidade("E",false); //4
		Cidade F = new Cidade("F",false); //5
		Cidade G = new Cidade("G",false); //6
		Cidade H = new Cidade("H",false); //7
		Cidade I = new Cidade("I",false); //8


		A.cidadesVizinhas.add(D); // Rota 01 - A, D
		D.cidadesVizinhas.add(A); // Rota 01 - D, A
		
		A.cidadesVizinhas.add(C); // Rota 02 - A, C
		C.cidadesVizinhas.add(A); // Rota 02 - C, A
		
		A.cidadesVizinhas.add(B); // Rota 03 - A, B
		B.cidadesVizinhas.add(A); // Rota 03 - B, A
		
		A.cidadesVizinhas.add(I); // Rota 04 - A, I
		I.cidadesVizinhas.add(A); // Rota 04 - I, A
		
		B.cidadesVizinhas.add(E); // Rota 05 - B, E
		E.cidadesVizinhas.add(B); // Rota 05 - E, B
		
		C.cidadesVizinhas.add(E); // Rota 07 - C, E
		E.cidadesVizinhas.add(C); // Rota 07 - E, C
		
		C.cidadesVizinhas.add(I); // Rota 09 - C, I
		I.cidadesVizinhas.add(C); // Rota 09 - I, C
		
		D.cidadesVizinhas.add(F); // Rota 06 - D, F
		F.cidadesVizinhas.add(D); // Rota 06 - F, D
		
		E.cidadesVizinhas.add(I); // Rota 10 - E, I
		I.cidadesVizinhas.add(E); // Rota 10 - I, E
		
		F.cidadesVizinhas.add(G); // Rota 08 - F, G
		G.cidadesVizinhas.add(F); // Rota 08 - G, F
		
		G.cidadesVizinhas.add(H); // Rota 11 - G, H
		H.cidadesVizinhas.add(G); // Rota 11 - H, G
		
		G.cidadesVizinhas.add(I); // Rota 12 - G, I
		I.cidadesVizinhas.add(G); // Rota 12 - I, G
		
		
		//System.out.println("A:" + ArrayCidade.get(0).nome +" se liga com " + ArrayCidade.get(0).cidadesVizinhas.get(0).nome);
		//System.out.println("D:" + ArrayCidade.get(0).cidadesVizinhas.get(0).nome +" se liga com " + ArrayCidade.get(0).cidadesVizinhas.get(0).cidadesVizinhas.get(1).nome);
		
        //Cidade destino = new Cidade("D",false);
        
        Profundidade.buscaProfundidade(A,H);
        System.out.println(A.cidadesVizinhas.get(1).cidadesVizinhas.get(1).cidadesVizinhas.get(0).nome);
        
	}
	
}
