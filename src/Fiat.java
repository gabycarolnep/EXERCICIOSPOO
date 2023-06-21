import Exercicio01.Carros;

public class Fiat extends Carros {

    @Override
    public void acelerar(){

        setVelocidade(getVelocidade() + 15);
        System.out.println("Acelerando");
        System.out.println("Hora de deixar os Torettos orgulhosos. Pé na tábua!");
        System.out.println("Sua velocidade atual é " + getVelocidade() + " Km/h");
    }
    @Override
    public void frear(){

        setVelocidade(getVelocidade() - 2);
        System.out.println("Freando");
        System.out.println("Devar e sempre, meu amigo. Afinal o que é a velocidade da lebre perto da inteligencia de um fusca?");
        System.out.println("Sua velocidade atual é " + getVelocidade() + " Km/h");
    }

    public void carroInfo(){

        System.out.println("INFORMAÇÕES DO MODELO FIAT: ");

        System.out.println(".......................");

        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço: " + getValor());
        System.out.println("Quantidade de portas: " + getPortas());
    }


}
