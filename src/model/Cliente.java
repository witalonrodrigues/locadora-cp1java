package model;

public class Cliente {
    private String nome;
    private String cpf;
    private String cnh;
    private String telefone;
    private String endereco;
    private boolean temVeiculoAlugado;

    public Cliente(String nome, String cnh, String cpf, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cnh = cnh;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.temVeiculoAlugado = false;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public boolean isTemVeiculoAlugado() {
        return temVeiculoAlugado;
    }

    public void setTemVeiculoAlugado(boolean temVeiculoAlugado) {
        this.temVeiculoAlugado = temVeiculoAlugado;
    }
    public boolean alugarVeiculo(Veiculo veiculo) {
        if (!temVeiculoAlugado) {
            temVeiculoAlugado = true;
            return true;
        } else {
            System.out.println("Este cliente já possui um veículo alugado.");
            return false;
        }
    }

    public boolean devolverVeiculo() {
        if (temVeiculoAlugado) {
            temVeiculoAlugado = false;
            return true;
        } else {
            System.out.println("Este cliente não possui veículo alugado para devolver.");
            return false;
        }
    }
}
