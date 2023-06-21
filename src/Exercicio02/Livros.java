package Exercicio02;

public class Livros {

    private String genero;
    private String nome;
    private String ISBN;
    private String autor;

    public Livros (String ISBN) {
        this.ISBN = ISBN;
    }

    public Livros (String ISBN, String nome) {
        this.ISBN = ISBN;
        this.nome = nome;
    }

    public Livros (String ISBN, String nome, String genero) {
        this.ISBN = ISBN;
        this.nome = nome;
        this.genero = genero;

    }

    public Livros (String ISBN, String nome, String genero, String autor) {
        this.ISBN = ISBN;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String registroLivro() {

        if (getNome()==null){
            System.out.println("Seu livro registrado com os seguintes parâmetros: ");
            return getISBN();
        }

        if (getGenero()==null){
            System.out.println("Seu livro registrado com os seguintes parâmetros: ");
            return getISBN()  + getNome();
        }

        if (getAutor()==null){
            System.out.println("Seu livro registrado com os seguintes parâmetros: ");
            return getISBN() + getNome() +  getGenero() ;
        }

        System.out.println("Seu livro registrado com os seguintes parâmetros: ");
        return getISBN() +  getNome() +  getGenero() +  getAutor();
    }
}

