package view;

import java.util.Scanner;

public class MenuInstituicaoView {

    Scanner in = new Scanner(System.in);

    public int telaMenu() {
        System.out.println("\nMENU INSTITUIÇÃO");
        System.out.println("(1) Agendar palestra");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        return in.nextInt();
    }

    public int menuAgendarPalestra() {
        System.out.print("ID do palestrante: ");
        return in.nextInt();
    }

    public int menuEscolherTema() {
        System.out.print("ID do tema: ");
        return in.nextInt();
    }
}
