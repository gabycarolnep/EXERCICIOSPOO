import Exercicio01.Carros;
import Exercicio02.Livros;

public class Main {
    public static void main(String[] args) {

        System.out.println("CARROS");

        Carros Renault = new Renault();

        System.out.println();

        Renault.setAno(2023);
        Renault.setCor("Vermelho");
        Renault.setPortas(4);
        Renault.setMarca("Logan");

        Renault.setVelocidade(0);
        Renault.acelerar();
        Renault.acelerar();
        Renault.frear();
        Renault.frear();
        Renault.carrosInfo();


        Carros Fiat = new Fiat();

        System.out.println();

        Fiat.setAno(2030);
        Fiat.setCor("Azul");
        Fiat.setPortas(2);
        Fiat.setMarca("ToroFuture");

        Fiat.setVelocidade(0);
        Fiat.acelerar();
        Fiat.acelerar();
        Fiat.frear();
        Fiat.frear();
        Fiat.carrosInfo();


        Carros Hyundai = new Hyundai();

        System.out.println();

        Hyundai.setAno(2021);
        Hyundai.setCor("Prata");
        Hyundai.setPortas(4);
        Hyundai.setMarca("Creta");

        Hyundai.setVelocidade(0);
        Hyundai.acelerar();
        Hyundai.acelerar();
        Hyundai.frear();
        Hyundai.frear();
        Hyundai.carrosInfo();

        System.out.println("" +
                "");
        System.out.println("-----------------------------------------------------------------------");


        System.out.println("LIVROS");

        Livros livro1a= new Livros("978-85-01-10556-1");
        System.out.println(livro1a.registroLivro());

        Livros livro1b = new Livros("978-85-01-10556-1","Trono de Vidro: Herdeira do Fogo");
        System.out.println(livro1b.registroLivro());

        Livros livro1c= new Livros("978-85-01-10556-1","Trono de Vidro: Herdeira do Fogo",
                "Fantasia, drama, guerra");
        System.out.println(livro1c.registroLivro());

        Livros livro1d= new Livros("978-85-01-10556-1","Trono de Vidro: Herdeira do Fogo",
                "Fantasia, drama, guerra","Sarah j. Maas");
        System.out.println(livro1d.registroLivro());


        Livros livro2a= new Livros("978-85-01-11512-8");
        System.out.println(livro2a.registroLivro());

        Livros livro2b = new Livros("978-85-01-11512-8","Corte de Névoa e Fúria");
        System.out.println(livro2b.registroLivro());

        Livros livro2c= new Livros("978-85-01-11512-8","Corte de Névoa e Fúria",
                "Fantasia, drama, romance");
        System.out.println(livro2c.registroLivro());

        Livros livro2d= new Livros("978-85-01-11512-8","Corte de Névoa e Fúria",
                "Fantasia, drama, romance","Sarah j. Maas");
        System.out.println(livro2d.registroLivro());


        Livros livro3a= new Livros("978-85-01-10091-1987");
        System.out.println(livro3a.registroLivro());

        Livros livro3b = new Livros("978-85-01-10091-1987","Trono de Vidro: Torre do Alvorecer");
        System.out.println(livro3b.registroLivro());

        Livros livro3c= new Livros("978-85-01-10091-1987","Trono de Vidro: Torre do Alvorecer",
                "Fantasia, drama, guerra");
        System.out.println(livro3c.registroLivro());

        Livros livro3d= new Livros("978-85-01-10091-1987","Trono de Vidro: Torre do Alvorecer",
                "Fantasia, drama, guerra","Sarah j. Maas");
        System.out.println(livro3d.registroLivro());


        System.out.println("" +
                "");
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("FUNCIONÁRIOS/DEMISSÕES");

        System.out.println("Testar... ");




    }
}
