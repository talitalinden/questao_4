import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente();
        System.out.println("""
               Qual operação você deseja realizar?
               Digite 1 para depósito.
               Digite 2 para saque.""");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Qual o valor do seu depósito?");
                c1.setDeposito(sc.nextDouble());
                System.out.println("Depósito realizado com sucesso.");
                break;
            case 2:
                System.out.println("Qual é o valor do saque?");
                c1.setSaque(sc.nextDouble());
                System.out.println("Saque realizado com sucesso.");

                if (c1.getValor_saque() > 1000) {
                    System.out.println("Saldo insuficiente");
                c1.setSaque(sc.nextDouble());
            }
                break;

        }

    }
}
