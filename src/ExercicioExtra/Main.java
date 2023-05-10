package ExercicioExtra;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Restaurante restaurante = new Restaurante();
        restaurante.atendimento();
//
//        System.out.println("Dentre as opções disponíveis abaixo, qual deseja?");
//        System.out.println("\n1: Fazer pedido");
//        System.out.println("2: Sair");
//
//        Scanner scanner = new Scanner(System.in);
//        int opcaoEscolhida = scanner.nextInt();
//
//
//        if(opcaoEscolhida == 2){
//            System.out.println("Fim do programa");
//        }
//
//        else if (opcaoEscolhida == 1) {
//            Cliente cliente = new Cliente();
//
//            System.out.println("Digite seu nome: ");
//            String nome = scanner.next();
//
//           cliente.setNome(nome);
//           cliente.boasVindas();
//           Cardapio cardapio = new Cardapio();
//           cardapio.opcoesDePratos();
//
//           Pedido pedido = new Pedido(cliente);
//
//
//           int codigo = scanner.nextInt();
//
//           while (codigo != 0){
//               Item item = cardapio.getItemCardapio(codigo);
//               if(item == null){
//                   System.out.println("Item não encontrado.");
//               }
//               else {
//                   System.out.println("Item escolhido "+ item.getNome());
//                   pedido.adicionarPedido(item);
//               }
//               codigo = scanner.nextInt();
//
//           }
//
//            pedido.mostrarItensPedidos();
//
//            System.out.println("Qual foi o valor pago ? ");
//            double valorPago = Double.valueOf(scanner.next());
//            while(valorPago < pedido.getTotalPedido()){
//                System.out.println("O valor informado é menor do que o total do pedido");
//                valorPago = Double.valueOf(scanner.next());
//            }
//
//            System.out.println("Você irá receber um troco de: ");
//            pedido.troco(valorPago);
//
//        }
//
//
    }
}
