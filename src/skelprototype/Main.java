
package skelprototype;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
        String rutaL = "C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/Lexico.flex";
        String rutaC = "C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/LexicoCup.flex";
        String[] rutas = {"-parser", "Sintaxis","C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/Sintaxis.cup"};
        
        File archivo;
        
        archivo = new File(rutaL);
        JFlex.Main.generate(archivo);
        
        archivo = new File(rutaC);
        JFlex.Main.generate(archivo);
        
        try {
            java_cup.Main.main(rutas);
            
        } catch(Exception ex){
            System.out.println(ex);
        }
        
        
        Path rutaSym = Paths.get("C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/user/Documents/NetBeansProjects/SkelPrototype/sym.java"), 
                Paths.get("C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/Sintaxis.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/user/Documents/NetBeansProjects/SkelPrototype/Sintaxis.java"), 
                Paths.get("C:/Users/user/Documents/NetBeansProjects/SkelPrototype/src/skelprototype/Sintaxis.java")
        );
        
    }
}
