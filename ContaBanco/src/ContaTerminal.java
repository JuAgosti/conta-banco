import java.util.Scanner;

public class ContaTerminal {
     //TODO:Concher e importar a classe Scanner
         public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in);      
        //Exibir as mensgaem para o nosso usuário
            
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta
        System.out.println("Olá" + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agêmcia é " + agencia + ", conta 343" + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

        scanner.close();
    
}

}
