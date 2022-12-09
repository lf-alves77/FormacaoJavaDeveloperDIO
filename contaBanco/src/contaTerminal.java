import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela Scanner os valores digitados no terminal
        //TODO: Exibir a mensagens criada

        String nomeCliente = "Lucas Alves";
        float saldo = 1000.5f;


        Scanner scanner = new Scanner(System.in);

        
        

        System.out.println("Por favor, digite o número da agencia: ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int num = scanner.nextInt();


        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");








    

    }
}
