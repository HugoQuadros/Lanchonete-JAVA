import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            mostrarMenuPrincipal();
        } while(true);
    }

    private static void fecharPedido (Sanduiche sanduiche){
        System.out.println("----------------");
        System.out.println("Pedido Fechado");
        System.out.println("Informe a distância da entrega: ");

        System.out.println("Tempo estimado de entrega: "
                + sanduiche.calcularEntrega(lerOpcao()) + "minutos");

    }

    public static void montarSanduiche() {

        Sanduiche sanduiche = new Sanduiche();
        do {
            System.out.println("------------------------");
            System.out.println("Menu de Sanduiches");
            System.out.println("Escolha os ingredientes do seu lanche");
            System.out.println("[1] Queijo        [5] Presunto");
            System.out.println("[2] Hamburguer    [6] Molho Especial");
            System.out.println("[3] Bacon         [7] Alface");
            System.out.println("[4] Ovo           [8] Tomate");
            System.out.println("[9] Montar Lanche [0] VOLTAR ao Menu Principal");
            System.out.println("Opção: ");

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    sanduiche.adicionarIngrediente("Queijo");
                    break;
                case 2:
                    sanduiche.adicionarIngrediente("Hamburguer");
                    break;
                case 3:
                    sanduiche.adicionarIngrediente("Bacon");
                    break;
                case 4:
                    sanduiche.adicionarIngrediente("Ovo");
                    break;
                case 5:
                    sanduiche.adicionarIngrediente("Presunto");
                    break;
                case 6:
                    sanduiche.adicionarIngrediente("Molho Especial");
                    break;
                case 7:
                    sanduiche.adicionarIngrediente("Alface");
                    break;
                case 8:
                    sanduiche.adicionarIngrediente("Tomate");
                    break;
                case 9:
                    mostrarLanche(sanduiche);
                    break;
                case 0:
                    System.out.println("Lanche em produção");
                    mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }

    private static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static void mostrarLanche(Sanduiche sanduiche) {
        System.out.println("Seu lanche neste momento: ");
        System.out.println(sanduiche.toString());
    }

    private static void mostrarMenuPrincipal() {

        System.out.println("Menu Delivery");
        System.out.println("[1] Sanduiches");
        System.out.println("[2] Massas");
        System.out.println("[3] Bolos");
        System.out.println("[0] SAIR");
        System.out.println("Digite a sua opção: ");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                System.out.println("Opção escolhida: sanduiche");
                montarSanduiche();
            case 2:
                System.out.println("Opção escolhida: massas");
                break;
            case 3:
                System.out.println("Opção escolhida: bolos");
                break;
            case 0:
                System.out.println("Opção escolhida: sair do sistema");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}