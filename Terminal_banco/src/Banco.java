import java.util.*;

public class Banco {

    public static void main(String[] args) {

        Integer conta = 1201;
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome :");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite Sua agencia ex . 000-0 ");
        String agencia = scanner.nextLine();

        System.out.println("O numero da sua conta " + conta);

        System.out.println("Digite um valor para deposito ");

        Double deposito = scanner.nextDouble();


        if (deposito > 0) {

            saldo = saldo + deposito;
            System.out.println("Deposito Realizado Com sucesso. seu novo saldo :" + saldo);  
        }else{

            System.out.println("Não foi realizado deposito ");
        }

    System.out.println(" Ola "  + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + conta + " seu saldo R$ " + saldo + " sua nova conta ja esta disponivel para utilizar  ");
 

    









        
    }
    
}
