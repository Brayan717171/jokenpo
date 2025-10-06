package br.senai.sp.jandira.ds1m.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class jokenpojogo {

    int escolhaUsuario;
    String escolhaComputador;
    String resultado;

    public void executarPartida(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("***  Vamos jogar Jokenpô!  ***");
        System.out.println("*******************************");
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("*******************************");
        System.out.println("Digite a sua escolha: ");

        escolhaUsuario = leitor.nextInt();
        rodar();

    }

    public void rodar(){
        Random random = new Random();
        String[] escolhas = {"Pedra", "Papel", "Tesoura"};

        int indice = random.nextInt(escolhas.length);
        escolhaComputador = escolhas[indice];
        exibirResultado();
    }

    public void exibirResultado() {
        System.out.println("");
        String usuario = "";
        if (escolhaUsuario == 1) {
            usuario = "Pedra";
        } else if (escolhaUsuario == 2) {
            usuario = "Papel";
        } else if (escolhaUsuario == 3) {
            usuario = "Tesoura";
        } else {
            System.out.println("Escolha inválida!!");
            executarPartida();
        }
        System.out.println("Você escolheu: "+ usuario);
        System.out.println("O computador escolheu: "+ escolhaComputador);

        if (usuario == ("Pedra") && escolhaComputador == ("Tesoura")){
            resultado = "*** Você venceu ***";

        }
        else if (usuario == ("Tesoura") && escolhaComputador == ("Papel")) {
            resultado = "*** Você venceu ***";
        }
        else if (usuario == ("Papel") && escolhaComputador == ("Pedra")) {
            resultado = "*** Você venceu ***";
        }
        else if (usuario == escolhaComputador) {
            resultado = "*** E M P A T E!! ***";

        }else {
            resultado = "*** O computador venceu você :) ***";
        }

        quemVenceu();
        reiniciarPrograma();


    }
    public void quemVenceu(){
        System.out.println("");
        System.out.println(resultado);
    }
    public void reiniciarPrograma(){
        Scanner leitor2 = new Scanner(System.in);

        System.out.println("Jogar novamente (S/N)? ");
        String reinicioDePrograma = leitor2.nextLine();
        if (reinicioDePrograma.equals("S") || reinicioDePrograma.equals("s")){
            executarPartida();
        }
        else {
            System.out.println("Obrigado por usar meu progama!!");
            System.out.println("Finalizando o progama");
        }
    }
}
