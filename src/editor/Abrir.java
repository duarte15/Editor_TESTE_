package editor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Abrir {
    
    public void abrirArq(){
        System.out.println("informe o caminho do arquivo");
        Scanner sc = new Scanner(System.in);
        String caminho = sc.nextLine();
        //setSrcAddress(caminho);
        
        try{
        //FileInputStream arquivo = new FileInputStream(getSrcAddress());
        FileInputStream arquivo = new FileInputStream(caminho);
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader br = new BufferedReader(input);
        
        String linha;
        int l=1;
        do {
            linha = br.readLine();
            if (linha != null){
                //System.out.println("Linha "+l+ ": "+linha);
                //l+=1;
                System.out.println(linha);
                
            }
        }while(linha != null);

    } catch(Exception e){
        System.out.println("Erro ao ler o arquivo. Reinicie a aplicação!");
    }    }
}
