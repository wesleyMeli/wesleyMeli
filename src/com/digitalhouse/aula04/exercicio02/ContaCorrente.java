/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio02;

public class ContaCorrente {

	private double sale;
	private String numberAccount;

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	
	public ContaCorrente(ContaCorrente contaCorrente) {
		super();
		this.sale = contaCorrente.sale;
		this.numberAccount = contaCorrente.numberAccount;
	}

	public ContaCorrente(double sale, String numberAccount) {
		super();
		this.sale = sale;
		this.numberAccount = numberAccount;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public void deposito(double value) {
		this.sale += value;
	}

	public void saque(double value) {
		this.sale -= value;
	}

	public void devolucao(double value) {
		this.sale += value;
	}

	public void transferencia(double value) {
		this.sale += value;
	}

}
