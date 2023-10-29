package model;

public class Morador {
	
	public int apartamento;
	public String nome;
	public String modelo;
	public String cor;
	public String placa;
	

	public Morador() {
		super();
	}
	
	public Morador(int apartamento, String nome, String modelo, String cor, String placa) {
		this.apartamento = apartamento;
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}
	
	public Morador (int apartamento) {
		this.apartamento = apartamento;
	}

	@Override
	public String toString() {
		return "[Apartamento #"+apartamento+": Nome do morador: "+nome+"; Modelo do carro: "+modelo+"; Cor do carro: "+cor+"; Placa do carro: "+placa+"]";
	}

	@Override
	public int hashCode() {
		int hash = (apartamento /100)-1;
		return hash;
	}

	
}
