package editor;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Criar {
    public void criarArq(){
        try{
            System.out.println("Insira o novo simbolo seguido de sua tradução, separados pela combinação '+=+' e com ';.;' no final. \n (Ex.: @ +=+ arroba ;.;)");
            FileOutputStream arquivo = new FileOutputStream("dicionario.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            Scanner sc =new Scanner(System.in);
            String novaTrad=sc.nextLine();


            pr.println("weivgyhbwv");
            pr.println("l3 c1; l3 c2; l3 c3");
            pr.println(novaTrad);
            pr.println("l2 c1; l2 c2; l2 c3");
            pr.println("l3 c1; l3 c2; l3 c3");
            
            pr.close();
            arquivo.close();
            
        } catch(Exception e){
            System.out.println("Erro ao escrever o arquivo");
        }
    }
}
