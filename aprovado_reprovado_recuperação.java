//“Reprovado” se a nota < 6

//“Recuperação” se a nota estiver entre 6 e 7

//“Aprovado” se a nota ≥ 7

import java.util.Scanner;
public class aprovado_reprovado_recuperação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Primeira nota: ");
        float n1 = scanner.nextInt();

        System.out.println("Segunda nota:");
        float n2 = scanner.nextFloat();

        double media = (n1 + n2) / 2; 

        if (media >= 7){
            System.out.println("sua média foi: " + media
            + "\nAprovado.");
        }else if (media >=6 && media < 7){
            System.out.println("sua média foi: " + media
            + "\nRecuperação.");
        }else{
            System.out.println("sua média foi: " + media
            + "\nREPROVADO!");
        }
    }
}
