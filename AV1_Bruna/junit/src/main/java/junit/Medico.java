package junit;

public class Medico<id,local>{
    public final id nome;
    public final local endereco;

    public Medico(id nome, local endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public id getKey() {
        return nome;
    }

    public local getValue() {
        return endereco;
    }
    
    public static Medico<String, String> Dermatologista() {
    	return new Medico <String, String>("Gabriel", "Rua Luiz Manhaes");
    }
    
    public static Medico<String, String> Cardiologista() {
    	return new Medico <String, String>("Julya", "Rua Presidente Juscelino Kubitschek");
    }
    
    public static Medico<String, String> Ginecologista() {
    	return new Medico <String, String>("Nicolas", "Av. Travessa Primeiro de Maio");
    }
    
    public static Medico<String, String> Ortopedista() {
    	return new Medico <String, String>("Danny", "Rua Rui Barbosa");
    }
    
    public static Medico<String, String> Laboratorio() {
    	return new Medico <String, String>("Lab STARS", "Rua José Pereira da Costa");
    }
    
    public static Medico<String, String> Internacao() {
    	return new Medico <String, String>("Hospital Metropolis", "Rua Lucindo Billio");
    }
}
