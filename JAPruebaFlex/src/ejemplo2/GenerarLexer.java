/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import java.io.File;

/**
 *
 * @author Yova
 */
public class GenerarLexer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dir = System.getProperty("user.dir")+"/src/ejemplo2/Flex3.lex";
        System.out.println(dir);
        generarLexer(dir);
    }
    
    public static void generarLexer(String dir){
        File file = new File(dir);
        jflex.Main.generate(file);     
    }
    
}
