package com.digitalhouse.aula06.exercicio03;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";

	public static void main(String[] args) {
		
		List<Convidado> convidados = new ArrayList<Convidado>();
		List<List<FogoDeArtificio>> fogosDeArtiList = new ArrayList<List<FogoDeArtificio>>();
		
		for(int i = 0; i < 10; i++) {		
			convidados.add(new ConvidadoMeli());
			convidados.add(new ConvidadoStandard());
			fogosDeArtiList.add(gerarFogosArtificio());
		}
		
		Evento evento = new Evento(convidados, fogosDeArtiList);
		
		evento.apagarVelas();
		

	}
	
	private static List<FogoDeArtificio> gerarFogosArtificio(){
		List<FogoDeArtificio> fogos = new ArrayList<FogoDeArtificio>();
		for(int j = 0; j < 4; j++) {
			fogos.add(new FogoDeArtificioStandard());
			fogos.add(new FogoDeArtificioIndividual(generarBarulho()));
		}
		return fogos;
	}
	
	private static String generarBarulho() {
		Random random = new Random();
		String barulho = "";
		int index = 0;
		for( int k = 0; k < 4; k++ ) {
		   index = random.nextInt( LETRAS.length() );
		   barulho += LETRAS.substring( index, index + 1 );
		}
		return barulho+" !!";
	}

}
