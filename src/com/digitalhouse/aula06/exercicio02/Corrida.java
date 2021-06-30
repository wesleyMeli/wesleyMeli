/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
	
	private double distancia;
	private double premioEmDolares;
	private String nome;
	private int quantidadeVeiculosPermitidos;
	private List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();;
	private SocorristaCarro socorristaCarro = new SocorristaCarro();
	private SocorristaMoto socorristaMoto = new SocorristaMoto();

	public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
		this.distancia = distancia;
		this.premioEmDolares = premioEmDolares;
		this.nome = nome;
		this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
	}
	
	public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos, List<Veiculo> listaVeiculos) {
		this.distancia = distancia;
		this.premioEmDolares = premioEmDolares;
		this.nome = nome;
		this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
		this.listaVeiculos = listaVeiculos;
	}
	
	public void registrarCarro(double velocidade, double aceleracao,double anguloDeGiro, String patente) throws CorridaException {
		verifyAmount();
		listaVeiculos.add(new Carros(velocidade, aceleracao, anguloDeGiro,patente));
	}

	public void registrarMoto(double velocidade, double aceleracao,double anguloDeGiro, String patente) throws CorridaException {
		verifyAmount();
		listaVeiculos.add(new Motos(velocidade, aceleracao, anguloDeGiro, patente));
	}
	
	public void removerVeiculoo(Veiculo veiculo) {
		listaVeiculos.remove(veiculo);
	}

    public void removerVeiculoPorPlaca(String placa) {
    	listaVeiculos.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
    }
    
    public void iniciarCorrida() {
    	Veiculo veiculoVencedor = new Veiculo();
    	double posicaoVencedor = 0;
    	for(Veiculo veiculo : listaVeiculos) {
    		double atual = ( veiculo.getVelocidade() * veiculo.getAceleracao() ) / 
    				( veiculo.getAnguloDeGiro() * ( veiculo.getPeso()-veiculo.getRodas()*100 ) );
    		if(posicaoVencedor < atual) {
    			posicaoVencedor = atual;
    			veiculoVencedor = veiculo;
    		}
    	}
    	System.out.println(":::: O vencedor ééééééé :::::::");
    	System.out.println(veiculoVencedor);
    }
    
    public void socorrerCarro(String documento) throws CorridaException {
    	socorristaCarro.socorrer( (Carros) getVeiculoPorPlaca(documento)  );
    }

    public void socorrerMoto(String documento) throws CorridaException {
    	socorristaMoto.socorrer((Motos) getVeiculoPorPlaca(documento));
    }
    
    private Veiculo getVeiculoPorPlaca(String placa) throws CorridaException {
    	Veiculo veiculo = listaVeiculos.stream().filter(v -> v.getPlaca().equalsIgnoreCase(placa)).findFirst().orElse(null);
    	if(veiculo == null) throw new CorridaException("Nenhum veiculo encontrado com a placa "+placa);
    	return veiculo;
    }
	
	private void verifyAmount() throws CorridaException {
		if(listaVeiculos.size() == quantidadeVeiculosPermitidos) throw new CorridaException("Não há vagas para a corrida");
	}

}
