package ExercicioExtra;

public class Item {
    private int cod;
    private String nome;
    private double preco;

    public Item(int cod, String nome, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
