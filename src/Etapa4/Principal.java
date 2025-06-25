package Etapa4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("----- BEM-VINDO AO SISTEMA DE GERENCIAMENTO DE SHOPPING -----\n");
        System.out.println("Deseja criar um shopping?");
        System.out.println("Digite um número:");
        System.out.println("1 - Sim\n2 - Não");
        opcao = teclado.nextInt();
        teclado.nextLine(); // Limpa o buffer2
        while (true) {
            if (opcao == 1) {
                break;
            } else {
                System.out.println("----- Saindo do programa -----");
                return;
        }
    }
        System.out.println("\t\t----- NOME -----\n");
        System.out.println("----- Digite o nome do shopping -----\n");
        String nomeShopping = teclado.nextLine();
        System.out.println("\t\t----- ENDEREÇO -----\n");
        System.out.println("----- Digite o nome da rua do shopping -----\n");
        String ruaShopping = teclado.nextLine();
        System.out.println("----- Digite a cidade do shopping -----\n");
        String cidadeShopping = teclado.nextLine();
        System.out.println("----- Digite o estado do shopping -----\n");
        String estadoShopping = teclado.nextLine();
        System.out.println("----- Digite o país do shopping -----\n");
        String paisShopping = teclado.nextLine();
        System.out.println("----- Digite o CEP do shopping -----\n");
        String cepShopping = teclado.nextLine();
        System.out.println("----- Digite o número do shopping -----\n");
        String numeroShopping = teclado.nextLine();
        System.out.println("----- Digite o complemento do shopping -----\n");
        String complementoShopping = teclado.nextLine();

        Endereco enderecoShopping = new Endereco( ruaShopping, cidadeShopping,  estadoShopping,  paisShopping,  cepShopping,  numeroShopping, complementoShopping);

        System.out.println("\t\t----- TAMANHO -----\n");
        System.out.println("----- Digite a capacidade máxima de lojas do shopping -----\n");
        int capacidadeLojas = teclado.nextInt();


        Shopping shoppingAtual = new Shopping(nomeShopping, enderecoShopping , capacidadeLojas);

        while (true){
            System.out.println("\t----- Menu do shopping " + shoppingAtual.getNome() + " -----"+ "\n");
            System.out.println(".\t(1) CRIAR UMA LOJA\n");
            System.out.println(".\t(2) CRIAR UM PRODUTO\n");
            System.out.println(".\t(3) REMOVER UMA LOJA\n");
            System.out.println(".\t(4) REMOVER UM PRODUTO\n");
            System.out.println(".\t(5) SAIR\n");

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

                    System.out.println("\n----- Digite o tipo de loja?  -----\n");
                    System.out.println(".\t(1) Alimentação\n");
                    System.out.println(".\t(2) Bijuteria\n");
                    System.out.println(".\t(3) Cosméticos\n");
                    System.out.println(".\t(4) Informática\n");
                    System.out.println(".\t(5) Vestuário\n");
                    int tipoLoja = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer

                    Data dataFundacao = new Data(dia,mes,ano);

                    Loja novaLoja = null;
                    switch (tipoLoja){
                        case 1:
                            System.out.println("\n----- Data do alvará da loja  -----");
                            System.out.println("\n----- Digite o dia do alvará da loja  -----\n");
                            int diaAlvara = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("\n----- Digite o mês do alvará da loja  -----\n");
                            int mesAlvara = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("\n----- Digite o ano do alvará da loja  -----\n");
                            int anoAlvara = teclado.nextInt();
                            teclado.nextLine();
                            Data dataAlvara = new Data(diaAlvara,mesAlvara,anoAlvara);

                            novaLoja = new Alimentacao(nomeLoja, funcionariosLoja, salarioBase, shoppingAtual.getEndereco(), dataFundacao, dataAlvara, tamanhoEstoque);
                            break;

                        case 2:
                            System.out.println("\n----- Meta de vendas da loja  -----\n");
                            System.out.println("\n----- Digite a meta de vendas por mês da loja  -----\n");
                            double metaVendas = teclado.nextDouble();
                            teclado.nextLine();

                            novaLoja = new Bijuteria(nomeLoja, funcionariosLoja, salarioBase, shoppingAtual.getEndereco(), dataFundacao, tamanhoEstoque, metaVendas);
                            break;

                        case 3:
                            System.out.println("\n----- Taxa de comercialização da loja  -----\n");
                            System.out.println("\n----- Digite a taxa de comercialização da loja  -----\n");
                            double taxaComercializacao = teclado.nextDouble();
                            teclado.nextLine();

                            novaLoja = new Cosmetico(nomeLoja, funcionariosLoja, salarioBase, shoppingAtual.getEndereco(), dataFundacao, tamanhoEstoque, taxaComercializacao);
                            break;

                        case 4:
                            System.out.println("\n----- Seguro eletrônico da loja  -----\n");
                            System.out.println("\n----- Digite o valor do seguro de eletrônicos da loja  -----\n");
                            double seguroEletronicos = teclado.nextDouble();
                            teclado.nextLine();

                            novaLoja = new Informatica(nomeLoja, funcionariosLoja, salarioBase, shoppingAtual.getEndereco(), dataFundacao, tamanhoEstoque, seguroEletronicos);
                            break;

                        case 5:
                            System.out.println("\n----- Produtos importados da loja  -----\n");
                            System.out.println("\n----- Digite se os produtos da loja são importados?  -----\n");
                            System.out.println(".\t(1) Sim\n");
                            System.out.println(".\t(2) Não\n");

                            boolean produtosImportados = false;

                            switch (teclado.nextInt()){
                                case 1:
                                    produtosImportados = true;
                                    break;
                                case 2:
                                    produtosImportados = false;
                                    break;
                            }

                            novaLoja = new Vestuario(nomeLoja, funcionariosLoja, salarioBase, shoppingAtual.getEndereco(), dataFundacao, produtosImportados, tamanhoEstoque);
                            break;

                        default: System.out.println("\n----- OPÇÃO INVÁLIDA. CRIANDO LOJA GENÉRICA -----\n");
                        novaLoja = new Loja(nomeLoja, funcionariosLoja, shoppingAtual.getEndereco(), dataFundacao, tamanhoEstoque);
                        break;
                    }

                    if (novaLoja != null){
                        if (shoppingAtual.insereLoja(novaLoja)){
                            System.out.println("\nLoja '" + novaLoja.getNome() + "' criada e adicionada ao shopping com sucesso!\n");
                            System.out.println(novaLoja + "\n");
                        } else {
                            System.out.println("\n----- Não foi possível adicionar a loja. Verifique se o shopping está cheio ou se já existe uma loja com o mesmo nome. -----\n");
                        }
                    } else {
                        System.out.println("\n----- Não foi possível criar a loja (opção de tipo inválida). Tente novamente -----\n");
                    }
                    break;
                case 2:
                    System.out.println("\n----- Digite o nome do produto:  -----\n");
                    String nomeProduto = teclado.nextLine();

                    System.out.println("\n----- Digite o preco do produto:  -----\n");
                    double precoProduto = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("\n----- Validade do produto  -----");
                    System.out.println("\n----- Digite o dia da validade: -----\n");
                    int diaValidade = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("\n----- Digite o mes da validade: -----\n");
                    int mesValidade = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("\n----- Digite o ano da validade: -----\n");
                    int anoValidade = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("\n----- Digite a quantidade do produto: -----\n");
                    int quantidadeProduto = teclado.nextInt();
                    teclado.nextLine();

                    Data dataValidadeProduto = new Data(diaValidade, mesValidade, anoValidade);

                    System.out.println("\n----- Digite o nome da loja que deseja adicionar o produto:  -----\n");
                    String nomeLojaProduto = teclado.nextLine();

                    Loja lojaAlvo = shoppingAtual.buscarLojaNome(nomeLojaProduto);

                    Produto produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto, quantidadeProduto);

                    if (lojaAlvo != null) {
                        lojaAlvo.insereProduto(produto);
                    } else {
                        System.out.println("Loja '" + nomeLojaProduto + "' não encontrada no shopping. Produto não adicionado.\n");
                    }

                    System.out.println("\n" + produto + "\n");

                    Data dataReferencia = new Data(20,10, 2023);

                    if (produto.estaVencido(dataReferencia)){
                        System.out.println("|\tProduto vencido\n");}
                    else { System.out.println("|\tProduto nao vencido\n");
                    }

                    break;
                case 3:
                    System.out.println("\n----- Digite o nome da loja que deseja remover  -----\n");
                    String nomeLojaRemover = teclado.nextLine();
                    if (shoppingAtual.removeLoja(nomeLojaRemover)){
                        System.out.println("\n|\tLOJA REMOVIDA COM SUCESSO\n");
                    } else {
                        System.out.println("\n|\tNÃO FOI POSSÍVEL REMOVER A LOJA\n");
                    }

                    break;
                case 5:
                    System.out.println("----- SAINDO DO PROGRAMA -----");
                    return;
                default:
                    System.out.println("\n----- OPÇÃO INVÁLIDA -----\n");
                    break;
            }
        }
    }
}