
import java.util.Scanner;


public class TerminalBanco {

   
    public static void main(String[] args) {

        int menu;
        int deposito = 0;
        int saque = 0;
        int saldo = 0;
        int saldoaux = 0;
        
    

    while (true) { 
        
     
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n 1 - Deposito " + 
                          "\n 2 - Saldo " + 
                          "\n 3 - Saque " + 
                          "\n 0 - Sair ");
                          
        menu = scanner.nextInt();


        if (menu == 0) {
            break;
        }

    

         switch (menu) {
            case 1:
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("Digite um valor para deposito: ");
            deposito = scanner1.nextInt();

            if (deposito <= 0 ) {
                System.err.println("Valor invalido");
              
            }else{
               
                System.out.println(" Seu Deposito foi realizado com sucesso");
                deposito = deposito + saldo;
                saldoaux += deposito;

            }  
             break;
            case 2:
            
            System.out.println(" Seu saldo é : " + saldoaux  );

            
             break;
            
            case 3:
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Digite o valor que deseja sacar :");
            saque = scanner2.nextInt();

            if(saldo  <=0 ){
                System.out.println(" você não tem saldo suficiente ");
                
             }else{
                
                System.out.println(" Saque no valor R$ " + saque + " realizado com Sucesso ");
                saldo  = saldo - saque;
                System.out.println(" Seu novo saldo : " + saldo);
             }
             break;
            default:
                System.out.println("Operacao Não encontrada");
        }
    }
System.out.println("Programa Finalizado !");    
    }
    

}