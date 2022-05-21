package model;

public class Funcionario {

    private String nome;
    private String cpf;
    private Filial empresa;

    public Funcionario(String nome, String cpf, Filial empresa) {
        this.nome = nome;
        this.cpf = cpf;
        this.empresa = empresa;
    }

    public String obterFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", cpf='" + this.cpf + '\'' +
                ", filialCodigo='" + this.empresa.getCodigo() + '\'' +
                ", filialNome='" + this.empresa.getNome() + '\'' +
                '}';
    }
}
