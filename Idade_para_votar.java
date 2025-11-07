import java.util.Scanner;

public class Idade_para_votar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        // idade necessária para votar.
        //idade maior que 18 anos obrigado a votar.
        //idade entre 16 e 17 anos pode votar caso queira.
        //Menor que 16 anos não pode votar.
        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("você tem " + idade + " anos.\nPode votar. " );
        
        } else if (idade >= 16 && idade < 18){
            System.out.println("você tem " + idade + " anos."
            + "\nFica ao seu critério caso queira votar.");
                    
        } else{
            System.out.println("você tem " + idade + " anos.\nVocê nao pode votar." );
        }
    }
}
