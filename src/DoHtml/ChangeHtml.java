package DoHtml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Acceptor.Acceptor;
import Visitor.Recipe;

public class ChangeHtml implements Recipe{

    @Override
    public void visit(Acceptor ChangeHtml) {
        // TODO Auto-generated method stub
        try {
            File file = new File("test.html");
            
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(ChangeHtml.getFilename()));
            FileWriter writer = new FileWriter(file);
            System.out.println("스캔 성공");


            String line = null;
            writer.write("<html><body>");    
            while((line = bufferedReader.readLine()) != null){
                    
                    line = line.replace("import", "<font color=\"blue\">import </font>")
                    .replace("public", "<font color=\"blue\">public </font>")
                    .replace("static", "<font color=\"blue\">static </font>")
                    .replace("void", "<font color=\"blue\">void </font>")
                    .replace("new", "<font color=\"blue\">new </font>")
                    .replace("try", "<font color=\"blue\">try</font>")
                    .replace("()", "<font color=\"red\">() </font>")
                    .replace(".", "<font color=\"red\">. </font>")
                    .replace(";", "<font color=\"red\">; </font>")
                    .replace("{", "<font color=\"red\">{ </font>")
                    .replace("}", "<font color=\"red\">} </font>");
                    
                    
                    
                    
    
                    writer.write(line+"<br>");
                    

            }

            writer.write("</html></body>");
            writer.flush();
        }
        catch (IOException e) {
                System.out.println("스캔 실패");
                e.printStackTrace();

        }
    }



    
    
}
