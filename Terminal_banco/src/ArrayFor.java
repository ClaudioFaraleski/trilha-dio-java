public class ArrayFor {

    public static void main(String[] args) {
        
        String nomes [] = {"Lucas" , "Jonas" , "mateus"};

        for (String nome : nomes) {

            if(nome == "mateus"){

                break;
            }

            System.out.println("Os Nomes São :" + nome);
            
        }
    }

}
