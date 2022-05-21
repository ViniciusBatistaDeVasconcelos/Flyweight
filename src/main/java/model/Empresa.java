package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrar(String nomeFuncionario, String cpfFuncionario,
                          String codigoFilial, String nomeFilial) {

        Filial filial = FilialFactory.getInstance().getFilial(codigoFilial, nomeFilial);
        Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, filial);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> resultado = new ArrayList<String>();

        for (Funcionario funcionario : this.funcionarios) {
            resultado.add(funcionario.obterFuncionario());
        }
        return resultado;
    }
}
