package junit;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    public int id; //id do agendamento
	public int idFuncionario;
	public String medico;
	public String endereco;
	public LocalDate data;
	public LocalTime hora;
	public float valor; //preço de cada cobertura


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public float getFloat() {
		return valor;
	}
	public void setFloat(float valor) {
		this.valor = valor;
	}

		
		public String Consulta (int id, String medico, String endereco, int idFuncionario, LocalTime hora, LocalDate data, float valor) {
			return "O valor da consulta é: " + valor; 
		}
		
		public String Exame (int id, String medico, String endereco, int idFuncionario, LocalTime hora, LocalDate data,  float valor) {
			return "O valor do Exame é: " + valor; 
		}
		
		public String Internacao (int id, String medico, String endereco, int idFuncionario, LocalTime hora, LocalDate data, float valor) {
			return "O valor da Internação é: " + valor; 
		}
}
