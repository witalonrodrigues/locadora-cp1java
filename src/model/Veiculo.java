package model;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private String marca;
    private double preco;
    private boolean disponibilidade;

    public Veiculo(String placa, String modelo, int ano, String marca, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.preco = preco;
        this.disponibilidade = true;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponibilidade = disponibilidade;
    }

    public boolean verificarDisponibilidade(){
        return disponibilidade;
    }
        public void definirDisponibilidade(boolean disponibilidade) {
            this.disponibilidade = disponibilidade;
    }
}