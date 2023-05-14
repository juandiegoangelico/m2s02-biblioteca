package br.com.lagoinha.biblioteca;

public class Main {
    public static void main(String[] args) {

    System.out.println(" Bem-vindo a biblioteca Clarice Lispector");


        Integer opcaoPrincipal = 0;
    do {
        System.out.println("Menu Principal");
        System.out.println("1 - Autor");
        System.out.println("2 - Editora");
        System.out.println("3 - Genero");
        System.out.println("4 - Livro");
        System.out.println("5 - Sair");

    } while (opcaoPrincipal != 5);

git

        /*
        Objetivos:
        - Autor:
            - *Nome         String
        - Livros;
            - *Título        String
            - Subtítulo     String
            - *Genero       String
            - *Idioma        String
            - *Código ISBN  String
            - *Autores       Lista de Autor
            - *Editora       Editora
            - Qtd exemplares    Integer

        - Gênero (Ficção/Romance);
            - *Nome         String

        À fazer:
        - Controle de quantidades disponíveis (empréstimo/venda);

         */
    }
}