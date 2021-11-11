package junit;

public class Funcionario {
    public int idFunc;
	public String nomeFunc;
	public boolean plano;
	
	public int getIdFunc() {
		return idFunc;
	}
	public void setId(int idFunc) {
		this.idFunc = idFunc;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public boolean getPlano() {
		return plano;
	}
	public void setPlano(boolean plano) {
		this.plano = plano;
	}
	
	public String Carteirinha (int idFunc, String nomeFunc, boolean plano) {
		int id = idFunc;
		String nome = nomeFunc;
		String verificarPlano;
		
		if (plano == true) { 
			verificarPlano =  "Ativo";
		} else {
			verificarPlano = "Desativado";
		}
		return "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Plano: " + verificarPlano;
	}	
}
