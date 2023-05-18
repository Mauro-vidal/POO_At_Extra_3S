package ExercicioExtra;
import java.util.ArrayList;

public class Pedido {

    private double totalPedido;
    private Cliente cliente;
    private double taxaServico = 10;

    private ArrayList<Item> itens = new ArrayList<>();

    public Pedido(Cliente cliente){
      this.cliente = cliente;
    }

    public void adicionarPedido(Item item){
        itens.add(item);
    }

    public void mostrarItensPedidos(){
        double taxaServico = 10;
        totalPedido = 0;

        for (Item item : itens) {
            System.out.println(item.getCod()+" - " + item.getNome() +" - " + item.getPreco());
            totalPedido+= item.getPreco();

        }

        double valorTaxa = (taxaServico / 100) * taxaServico;
        totalPedido = totalPedido + valorTaxa ;
        System.out.println("\nValor total do pedido com uma taxa de 10% R$: "+totalPedido);
    }

    public void troco(double valorPago){
        valorPago = valorPago - totalPedido;
        System.out.println(valorPago);

    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

