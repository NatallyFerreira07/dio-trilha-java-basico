import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     
    //TODO: conhecer e importar a classe scanner
    var scanner = new Scanner(System.in);


    //Exibir as mensagens para o usuario

    System.out.println("Me informe seu nome: ");
    String nomeCliente = scanner.next();

    System.out.printf("Certo %s agora me informe o numero da conta: \n", nomeCliente);
    int numeroConta = scanner.nextInt();

    System.out.println("Me informe o numero da sua agencia: ");
    String agencia = scanner.next();
          
    System.out.println("Por fim, me informe seu saldo: ");
    double saldo = scanner.nextDouble();


    //Obter pela classe scanner os valores digitados no terminal

    //Exibir a mensagem final, da conta criada
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque. \n", nomeCliente, agencia, numeroConta, saldo);
    
    }
}
