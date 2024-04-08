package view;

import model.Veiculo;
import model.Cliente;

public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente("João", "12345678901", "123.456.758-90","1198765-4321","joao@gmail.com","avenida 123");
    Veiculo veiculo = new Veiculo("ABC2024","Uno",2023,"fiat",500);

    cliente.alugarVeiculo(veiculo);

    }
}
