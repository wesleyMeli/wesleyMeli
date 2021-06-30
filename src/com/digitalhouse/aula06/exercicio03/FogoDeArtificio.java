package com.digitalhouse.aula06.exercicio03;

public abstract class FogoDeArtificio {

	private String barulho;
	
	public FogoDeArtificio(String barulho) {
		this.barulho = barulho;
	}
	
	public void explodir() {
		System.out.println(this.barulho);
	}

}
