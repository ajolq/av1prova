package junit;

public class Faturamento {
    
    public int id;
    public String medico;
    public int paciente; //numero de pacientes atendidos
    public float valorConsulta;
    public float valorTotal;
    public int dia;


    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}

    public int getPaciente() {
		return paciente;
	}
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

    public float getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(float valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

    public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

    public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

    public String Nota (int id, String medico, int paciente, float valorConsulta, float valorTotal, int dia) {

        String emitirNota;

		if (dia == 6) { 
			emitirNota =  "Disponível para emissão";
		} else {
			emitirNota = "Não disponível";
		}

		return "ID:" + id + "\n" + "Nome:" + medico + "\n" + "Numero de pacientes: " + paciente + "\n" + "Valor da consulta: " + valorConsulta + "\n" 
        + "Valor total: " + valorTotal + "\n" + "Emissão da nota: " + emitirNota;
	}	

    

}
