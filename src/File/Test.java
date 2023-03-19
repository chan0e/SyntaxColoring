package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.crypto.spec.PBEKeySpec;
import javax.print.event.PrintEvent;


public class Test {
    public static void mian(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("input source file name : " );
        String fileName = Scanner.nextLine();
        
        Scanner.close();

        String keywordVisitor = new String();
        String symbolVisitor = new String();
        String nameVisitor = new String();
        String crVisitor = new String();
        String nullVisitor = new String();

        try{
            File file = new File("ColorTokenizedSourceFile.html");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter  = new PrintWriter(fileWriter) ;
        }catch(IOException e){
                e.printStackTrace();
        }


    }
}
