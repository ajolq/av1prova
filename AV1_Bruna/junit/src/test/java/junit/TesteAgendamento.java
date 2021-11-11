package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class TesteAgendamento {
    @Test
	void MarcarConsultaDermatologista(){
		//Arrange
		Agendamento agendar = new Agendamento();

        float valor = 300;
		String esperado = "O valor da consulta é: " + valor;
		
		LocalTime hora = LocalTime.of(07,0);
		LocalDate data = LocalDate.of(2021, 6, 8);
        
		
        Medico<String, String> doutor = Medico.Dermatologista();

		//Act
		String resultado = agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data, valor);
		
		//Assert
		assertEquals(esperado, resultado);
	}

    @Test
	void MarcarConsultaCardiologista(){
		//Arrange
		Agendamento agendar = new Agendamento();

		float valor = 550;
		String esperado = "O valor da consulta é: " + valor;
		
		LocalTime hora = LocalTime.of(15,0);
		LocalDate data = LocalDate.of(2022, 01, 10);
		
        Medico<String, String> doutor = Medico.Cardiologista();

		//Act
		String resultado = agendar.Consulta(2, doutor.getKey(), doutor.getValue(), 2, hora, data, valor);
		
		//Assert
		assertEquals(esperado, resultado);
	}

    @Test
    void MarcarConsultaGinecologista(){
        //Arrange
        Agendamento agendar = new Agendamento();
        
        float valor = 150;
		String esperado = "O valor da consulta é: " + valor;
        
        LocalTime hora = LocalTime.of(11,0);
        LocalDate data = LocalDate.of(2021, 03, 26);
        
        Medico<String, String> doutor = Medico.Ginecologista();

        //Act
        String resultado = agendar.Consulta(3, doutor.getKey(), doutor.getValue(), 3, hora, data, valor);
        
        //Assert
        assertEquals(esperado, resultado);
    }

    @Test
    void MarcarConsultaOrtopedista(){
        //Arrange
        Agendamento agendar = new Agendamento();
        
        float valor = 80;
		String esperado = "O valor da consulta é: " + valor;
        
        LocalTime hora = LocalTime.of(11,0);
        LocalDate data = LocalDate.of(2021, 04, 01);
        
        Medico<String, String> doutor = Medico.Ortopedista();

        //Act
        String resultado = agendar.Consulta(4, doutor.getKey(), doutor.getValue(), 4, hora, data, valor);
        
        //Assert
        assertEquals(esperado, resultado);
    }

    @Test
    void MarcarExame() {
        //Arrange
        Agendamento agendar = new Agendamento();
        
        float valor = 800;
		String esperado = "O valor do Exame é: " + valor;
        
        LocalTime hora = LocalTime.of(8,0);
        LocalDate data = LocalDate.of(2021, 12, 5);
        
        Medico<String, String> doutor = Medico.Laboratorio();

        //Act
        String resultado = agendar.Exame(1, doutor.getKey(), doutor.getValue(), 1, hora, data, valor);
        
        //Assert
        assertEquals(esperado, resultado);
    }

    @Test
    void MarcarInternacao() {
        //Arrange
        Agendamento agendar = new Agendamento();
        
        float valor = 1500;
		String esperado = "O valor da Internação é: " + valor;
                
        LocalTime hora = LocalTime.of(7,0);
        LocalDate data = LocalDate.of(2021, 11, 16);
                
        Medico<String, String> doutor = Medico.Internacao();
                
        //Act
        String resultado = agendar.Internacao(1, doutor.getKey(), doutor.getValue(), 1, hora, data, valor);
                
        //Assert
        assertEquals(esperado, resultado);
    }

}
