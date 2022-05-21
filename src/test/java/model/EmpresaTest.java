package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpresaTest {

    @BeforeEach
    void limparFiliais() {
        FilialFactory.setListaVazia();
    }

    @Test
    void deveRetornarAlunos() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Adriana", "186.221.660-66", "MG0001", "Centro de distribuição - Juiz de Fora");
        empresa.cadastrar("Claudio", "879.168.380-79", "MG0002", "Centro de distribuição - Viçosa");
        empresa.cadastrar("Sebastião", "297.682.180-10", "MG0002", "Centro de distribuição - Viçosa");
        empresa.cadastrar("Ana Maria", "639.552.250-70", "MG0002", "Centro de distribuição - Viçosa");
        empresa.cadastrar("Beatriz", "094.389.290-29", "MG0003", "Centro de distribuição - Belo Horizonte");


        List<String> saida = List.of(
                "Funcionario{nome='Adriana', cpf='186.221.660-66', filialCodigo='MG0001', filialNome='Centro de distribuição - Juiz de Fora'}",
                "Funcionario{nome='Claudio', cpf='879.168.380-79', filialCodigo='MG0002', filialNome='Centro de distribuição - Viçosa'}",
                "Funcionario{nome='Sebastião', cpf='297.682.180-10', filialCodigo='MG0002', filialNome='Centro de distribuição - Viçosa'}",
                "Funcionario{nome='Ana Maria', cpf='639.552.250-70', filialCodigo='MG0002', filialNome='Centro de distribuição - Viçosa'}",
                "Funcionario{nome='Beatriz', cpf='094.389.290-29', filialCodigo='MG0003', filialNome='Centro de distribuição - Belo Horizonte'}"
        );

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCidadesIgualAZero() {
        assertEquals(0, FilialFactory.getTotalFiliais());
    }

    @Test
    void deveRetornarTotalCidadesIgualAUm() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Adriana", "186.221.660-66", "MG0001", "Centro de distribuição - Juiz de Fora");

        assertEquals(1, FilialFactory.getTotalFiliais());
    }

    @Test
    void deveRetornarTotalCidadesIgualATres() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Adriana", "186.221.660-66", "MG0001", "Centro de distribuição - Juiz de Fora");
        empresa.cadastrar("Claudio", "879.168.380-79", "MG0002", "Centro de distribuição - Viçosa");
        empresa.cadastrar("Sebastião", "297.682.180-10", "MG0002", "Centro de distribuição - Viçosa");
        empresa.cadastrar("Ana Maria", "639.552.250-70", "MG0002", "Centro de distribuição - Viçosa");
        empresa.cadastrar("Beatriz", "094.389.290-29", "MG0003", "Centro de distribuição - Belo Horizonte");

        assertEquals(3, FilialFactory.getTotalFiliais());
    }
}