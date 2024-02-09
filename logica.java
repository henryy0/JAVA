import java.util.Scanner;
//Carlos Henrique Nery da Silva Rgm: 34369201 //
//Victor Hugo Freitas Dias Rgm:34336141 //
//Bruno Otavio Ramos da Silva RGM: 34519912 //

public class logica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota1, nota2;

        System.out.println("Nota1: ");
        nota1 = in.nextInt();

        System.out.println("Nota2: ");
        nota2 = in.nextInt();

        int media = (nota1+nota2)/2;
        if (media > 7) {
            System.out.println("Aprovado");
        }
        else if (media > 5 &&  media <  7) {
            System.out.println("Exame");
        }
        else if (media < 5) {
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Erro");
        }
        }
    }
    