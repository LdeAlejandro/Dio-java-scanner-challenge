import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();
    
        if(numero >= 0 && !agencia.trim().isEmpty() && !nomeCliente.trim().isEmpty() && saldo >=0){
            System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                 nomeCliente, agencia, numero, saldo));
                                 scanner.close();

        }
    
        
    }
}