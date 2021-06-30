package com.digitalhouse.aula06.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	List<Convidado> convidados = new ArrayList<Convidado>();
	List<List<FogoDeArtificio>> fogosDeArtiList = new ArrayList<List<FogoDeArtificio>>();

	public Evento(List<Convidado> convidados, List<List<FogoDeArtificio>> fogosDeArtiList) {
		this.convidados = convidados;
		this.fogosDeArtiList = fogosDeArtiList;
	}

	public void apagarVelas() {
		explodirFogos();
		distribuiBolo();
		
	}
	
	private void explodirFogos (){
		for(List<FogoDeArtificio> fogosDeArtificios : this.fogosDeArtiList) {
			for(FogoDeArtificio fogosArtificio : fogosDeArtificios) {
				fogosArtificio.explodir();
			}
		}	
	}
	
	private void distribuiBolo() {
		for (Convidado convidado : this.convidados) {
			convidado.comerBolo();
		}
	}
}
