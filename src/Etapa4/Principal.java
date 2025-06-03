package Etapa4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        Endereco endereçoShopping = new Endereco("Rua dos Bobos", "Porto Alegre", "RS", "Brasil", "99000-100", "0", "Lado b");
        Shopping shopping1 = new Shopping("Shopping Sinos", endereçoShopping , 19);

        while (true){
            System.out.println("\tEscolha uma opcao: \n");
            System.out.println(".\t(1) CRIAR UMA LOJA\n");
            System.out.println(".\t(2) CRIAR UM PRODUTO\n");
            System.out.println(".\t(3) SAIR\n");

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer

            switch (opcao){
                case 1:
                    System.out.println("\n----- Digite o nome da loja  -----\n");
                    String nomeLoja = teclado.nextLine();
                    
                    System.out.println("\n----- Digite a quantidade de funcionarios da loja  -----\n");
                    int funcionariosLoja = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer
                    
                    System.out.println("\n----- Digite o salario base da loja  -----\n");
                    int salarioBase = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer
                    
                    System.out.println("\n----- Endereco da loja  -----");
                    System.out.println("\n----- Digite o nome da rua da loja  -----\n");
                    String nomeRua = teclado.nextLine();
                    
                    System.out.println("\n----- Digite a cidade da loja  -----\n");
                    String cidade = teclado.nextLine();
                    
                    System.out.println("\n----- Digite o estado da loja  -----\n");
                    String estado = teclado.nextLine();
                    
                    System.out.println("\n----- Digite o pais da loja  -----\n");
                    String pais = teclado.nextLine();

                    System.out.println("\n----- Digite o cep da loja  -----\n");
                    String cep = teclado.nextLine();

                    System.out.println("\n----- Digite o numero da loja  -----\n");
                    String numero = teclado.nextLine();

                    System.out.println("\n----- Digite o complemento da loja  -----\n");
                    String complemento = teclado.nextLine();

                    Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                    System.out.println("\n----- Digite o dia da funcacao da loja  -----\n");
                    int dia = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer

                    System.out.println("\n----- Digite o mes da funcacao da loja  -----\n");
                    int mes = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer

                    System.out.println("\n----- Digite o ano da funcacao da loja  -----\n");
                    int ano = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer

                    System.out.println("\n----- Digite o tamanho do estoque da loja  -----\n");
                    int tamanhoEstoque = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer

                    Data dataFundacao = new Data(dia,mes,ano);

                    Loja loja = new Loja(nomeLoja, salarioBase, funcionariosLoja, enderecoLoja, dataFundacao, tamanhoEstoque);

                    System.out.println("\n" + loja.toString() + "\n");

                    break;
                case 2:
                    System.out.println("\n----- Digite o nome do produto  -----\n");
                    String nomeProduto = teclado.nextLine();

                    System.out.println("\n----- Digite o preco do produto  -----\n");
                    int precoProduto = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("\n----- Validade do produto  -----");
                    System.out.println("\n----- Digite o dia da validade  -----\n");
                    int diaValidade = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("\n----- Digite o mes da validade  -----\n");
                    int mesValidade = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("\n----- Digite o ano da validade  -----\n");
                    int anoValidade = teclado.nextInt();
                    teclado.nextLine();

                    Data dataValidadeProduto = new Data(diaValidade, mesValidade, anoValidade);

                    Produto produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto);

                    System.out.println("\n" + produto.toString() + "\n");

                    Data dataReferencia = new Data(20,10, 2023);

                    if (produto.estaVencido(dataReferencia)){
                        System.out.println("|\tProduto vencido\n");}
                    else { System.out.println("|\tProduto nao vencido\n");
                    }
                    break;
                case 3:
                    System.out.println("----- SAINDO DO PROGRAMA -----");
                    return;
                default:
                    System.out.println("\n----- OPÇÃO INVÁLIDA -----\n");
                    break;
            }
        }
    }
}