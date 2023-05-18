package ExercicioExtra;

import java.util.Scanner;

public class Restaurante {
    private Scanner scanner = new Scanner(System.in);
    public void atendimento(){
        int opcaoEscolhida = menuInicial();
        while (opcaoEscolhida != 2){
            if(opcaoEscolhida == 1){
                realizarPedido();
            }else{
                System.out.println("Opção inválida");
            }
            opcaoEscolhida = menuInicial();
        }
        System.out.println("Fim do programa");
    }

    private int menuInicial(){
        System.out.println("Olá, caso queira fazer um pedido digite 1");
        System.out.println("\n1: Fazer pedido");
        System.out.println("2: Sair");
        return scanner.nextInt();
    }

    private void realizarPedido(){
        Cliente cliente = new Cliente();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        cliente.setNome(nome);
        cliente.boasVindas();

        Pedido pedido = new Pedido(cliente);
        Cardapio cardapio = new Cardapio();

        System.out.println("\nAbaixo será disponibilizado o cardápio, o que você deseja?" );
        cardapio.opcoesDePratos();
        System.out.println("\nSelecione as opções que deseja e quando quiser finalizar seu pedido digite 0");

        int codigo = scanner.nextInt();
        while (codigo != 0){
            Item item = cardapio.getItemCardapio(codigo);
            if(item == null){
                System.out.println("Item não encontrado.");
            }
            else {
                System.out.println("Item escolhido "+ item.getNome());
                pedido.adicionarPedido(item);
            }
            codigo = scanner.nextInt();
        }

        pedido.mostrarItensPedidos();
        System.out.println("\nQual foi o valor pago ? ");
        double valorPago = Double.valueOf(scanner.next());
        while(valorPago < pedido.getTotalPedido()){
            System.out.println("O valor informado é menor do que o total do pedido");
            valorPago = Double.valueOf(scanner.next());
        }

        System.out.println("Você irá receber um troco de: ");
        pedido.troco(valorPago);
    }
}
