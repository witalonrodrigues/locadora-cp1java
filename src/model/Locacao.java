package model;

import java.time.LocalDate;

public class Locacao {
    private Veiculo placa;
    private Cliente cpf;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Veiculo preco;

    public Locacao(LocalDate dataInicio, LocalDate dataFim, Veiculo preco, Veiculo placa, Cliente cpf) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.preco = preco;
        this.placa = placa;
        this.cpf = cpf;
    }
    public Veiculo getPlaca() {
        return placa;
    }

    public void setPlaca(Veiculo placa) {
        this.placa = placa;
    }

    public Cliente getCpf() {
        return cpf;
    }

    public void setCliente(Cliente cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Veiculo getPreco() {
        return preco;
    }

    public void setPreco(Veiculo preco) {
        this.preco = preco;
    }
    public boolean iniciarLocacao() {
        if (dataFim == null) {
            System.out.println("Locação já iniciada.");
            return false;
        } else {
            dataInicio = LocalDate.now();
            return true;
        }
    }

    public boolean finalizarLocacao() {
        if (dataFim == null) {
            dataFim = LocalDate.now();
            return true;
        } else {
            System.out.println("Locação já finalizada.");
            return false;
        }
    }
}


