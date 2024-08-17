import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        int tabuada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a tabuada que deseja :");
        tabuada = scanner.nextInt();

        for (int i = 0; i <=10; i++) {

            if(tabuada == 11){
                System.out.println("A Tuabada vai ate 10! Programa Finalizado");
                break;
                
            }

            System.out.println(tabuada + " x " + i + " = " + tabuada * i );
            
        }
       

    }

}
