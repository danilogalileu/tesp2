package br.unibh;

import java.util.Date;

public class Aluno extends Pessoa{

	private Long matr�cula;
	private Date dataAniversario;

	public Long getMatr�cula() {
		return matr�cula;
	}

	public void setMatr�cula(Long matr�cula) {
		this.matr�cula = matr�cula;
	}

	public Aluno(Long matr�cula, String nome, String cpf, Date dataAniversario) {
		super(nome, cpf);
		this.matr�cula = matr�cula;
		
		this.dataAniversario = dataAniversario;
	}

	public Aluno(Long matr�cula, String nome, String cpf) {
		super(nome, cpf);
		this.matr�cula = matr�cula;
		
	}

	public Aluno(Long matr�cula, String nome) {
		super(nome, null);
		this.matr�cula = matr�cula;
		
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return super.toString()+"Aluno [matr�cula=" + matr�cula + ", dataAniversario="
				+ dataAniversario + "]";
	}

	
}