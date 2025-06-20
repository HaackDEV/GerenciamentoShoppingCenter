# Sistema de Gerenciamento de Shopping Center

**Versão:** 1.0.0

## Descrição

Este projeto é um sistema desenvolvido em Java para o gerenciamento de um shopping center. O sistema modela a estrutura de um shopping, contendo diferentes tipos de lojas, e permite a realização de operações como adicionar e remover lojas, gerenciar produtos, e consultar informações específicas. Este projeto foi desenvolvido como parte de uma avaliação acadêmica.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

-   **Criação de Shopping:** Permite instanciar um shopping com nome, endereço e uma capacidade definida de lojas.
-   **Gerenciamento de Lojas:**
    -   Adicionar novas lojas ao shopping.
    -   Remover lojas existentes pelo nome.
    -   Suporte para diferentes tipos de lojas, como:
        -   Alimentação
        -   Bijuteria
        -   Cosmético
        -   Informática
        -   Vestuário
-   **Consultas:**
    -   Contar a quantidade de lojas por tipo.
    -   Encontrar a loja de informática com o seguro de eletrônicos mais caro.
-   **Gerenciamento de Produtos:**
    -   Adicionar e remover produtos do estoque de uma loja.
    -   Imprimir a lista de produtos de uma loja.
-   **Cálculos e Métricas:**
    -   Calcular o gasto total com salários de uma loja.
    -   Determinar o tamanho da loja (Pequena, Média ou Grande) com base no número de funcionários.

## Estrutura do Projeto

O projeto é organizado em torno das seguintes classes principais:

-   `Shopping`: A classe principal que representa o shopping center e gerencia o conjunto de lojas.
-   `Loja`: Uma classe base que representa uma loja genérica, com atributos como nome, funcionários, endereço, data de fundação e estoque de produtos.
-   **Subclasses de `Loja`**: Classes especializadas que herdam de `Loja` e adicionam atributos específicos, como `Alimentacao`, `Cosmetico`, `Informatica`, etc.
-   `Produto`: Representa um produto no estoque de uma loja.
-   `Endereco`: Representa o endereço de uma loja ou do shopping.
-   `Data`: Representa datas, como a data de fundação ou a data do alvará.

## Como Utilizar

Para utilizar este projeto, você pode criar uma classe principal (ex: `Main.java` ou `Principal.java`) para instanciar os objetos e testar as funcionalidades.

**Exemplo:**

```java
public class Principal {
    public static void main(String[] args) {
        // 1. Criar endereço e data
        Endereco enderecoShopping = new Endereco("Rua Principal", "Centro", "12345-678", "Cidade", "Estado", "País");
        Data dataFundacaoLoja = new Data(10, 3, 2020);

        // 2. Criar um shopping
        Shopping meuShopping = new Shopping("Shopping Central", enderecoShopping, 10);

        // 3. Criar e adicionar uma loja
        Loja lojaDeRoupa = new Vestuario("Estilo & Cia", 15, 2000, enderecoShopping, dataFundacaoLoja, 500, true);
        meuShopping.insereLoja(lojaDeRoupa);

        // 4. Adicionar um produto à loja
        Produto calca = new Produto("Calça Jeans", dataFundacaoLoja, 150.00);
        lojaDeRoupa.insereProduto(calca);

        // 5. Consultar informações
        System.out.println("Quantidade de lojas de vestuário: " + meuShopping.quantidadeLojasPorTipo("Vestuário"));
    }
}
```

## Histórico de Versões

### v1.0.0 - (20 de junho de 2025)
-   Lançamento inicial do projeto.
-   Implementação das funcionalidades básicas de gerenciamento de shopping, lojas e produtos.

## Autor

Ruan Haack da Silva
