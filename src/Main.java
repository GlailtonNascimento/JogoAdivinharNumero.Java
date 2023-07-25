import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroComputador = (int)(Math.random() * 100);
        Integer numeroUsuario = -1 ; //Variavel flog
        while (numeroUsuario != numeroComputador){
            System.out.println("Digite um numero: ");
            numeroUsuario = leitor.nextInt();
            if (numeroComputador > numeroUsuario) {
                System.out.println("Incorreto...Digite um numero maior:");
            } else if (numeroComputador < numeroUsuario) {
                System.out.println("Incorreto....Digite um numero menor: ");

            }
        }
        System.out.println("Parabéns ....Você acertou o numero é : " + numeroComputador);
    }
}