package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteFuncionario {

    @Test
    void VerificarPlano() {
        //Arrange
        Funcionario Funcionario = new Funcionario();
        
        int id = 3;
        String nome = "Eduardo";
        String plano = "Ativo";
        
        String esperado = "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Plano: " + plano;
                                
        //Act
        String resultado = Funcionario.Carteirinha(id, nome, true);
        
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void EmissaoNota() {

        //Arrange
        Faturamento Faturamento  = new Faturamento();

        int id = 16;
        String medico = "Julya";
        int paciente = 2;
        float valorConsulta = 550; 
        float valorTotal = 1100;
        String emitirNota = "Disponível para emissão";


        String esperado = "ID:" + id + "\n" + "Nome:" + medico + "\n" + "Numero de pacientes: " + paciente + "\n" + "Valor da consulta: " + valorConsulta + "\n" 
        + "Valor total: " + valorTotal + "\n" + "Emissão da nota: " + emitirNota;

        //Act

        String resultado = Faturamento.Nota(id, medico, paciente, valorConsulta, valorTotal, 6);
        
        //Assert

        assertEquals(esperado,resultado);
    }

    
}
