package br.senai.sp.jandira.ds1m.jokenpo.model;

import java.util.Scanner;

public class jokenpojogo {

    int escolhaUsuario;
    String escolhaComputador;

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
    }
}
