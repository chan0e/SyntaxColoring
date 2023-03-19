package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import DoHtml.ChangeHtml;
import File.TFile;

public class Client {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("> java ColorTokenizer ");
        String filename = sc.readLine();

        //각 PC에서는 경로설정을 달리 해줘야 합니다.
        TFile testFile = new TFile("/Users/young/IdeaProjects/SyntaxColoring/src/File/" + filename);
        testFile.accept(new ChangeHtml() );
        
        sc.close();
      
    }
    
}
