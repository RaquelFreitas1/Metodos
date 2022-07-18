package dio.br.metodos;

public class Main {

    public static void main (String[] arg) {


        //Calculadora
        System.out.println("Exercicio calculadora: ");
        Calculadora.soma (3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao (5, 8);
        Calculadora.divisao (12, 4);


        //Mensagem
        System.out.println("Exercicio Mensagem: ");
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(5);


        //Emprestimo

        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000,5);



        //Quadrilateros

        System.out.println("Exercicio Quadrilateros:");
        Quadrilateros.area(2);
        Quadrilateros.area(3, 7);
        Quadrilateros.area(7,3,2);
        Quadrilateros.area(5,2);





    }


}
