import java.util.Scanner;



public class positivo_ou_negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        //Peça ao usuário para digitar um número inteiro 
        //e informe se ele é positivo, negativo ou zero.
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 0){
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero == 0){
            System.out.println("O Número é zero");
        } else {
            System.out.println("O número " + numero + " é negativo.");
        } 


    }
}
