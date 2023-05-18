package ExercicioExtra;
import java.util.ArrayList;

public class Cardapio {

    private ArrayList<Item> cardapio = new ArrayList<>();

    private ArrayList<Pedido> cardapioBebidas = new ArrayList<>();

    public Cardapio(){
        cardapio.add(new Item(1, "Pizza", 50.00));
        cardapio.add(new Item(2, "Hambúrguer", 35.0));
        cardapio.add(new Item(3, "Cachorro quente", 8.50));
        cardapio.add(new Item(4, "Queijo", 10.00));
        cardapio.add(new Item(5, "Macarrão", 25.00));

    }

    public void opcoesDePratos(){
        for (Item item : cardapio) {
            System.out.println(item.getCod()+" - " + item.getNome() +" - " + item.getPreco());
        }
    }

    public Item getItemCardapio(int codigo){
        for (Item item : cardapio) {

            if(item.getCod() == codigo){
                return item;

            }
        }
        return null;
    }

}
