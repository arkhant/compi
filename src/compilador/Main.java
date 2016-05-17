/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.FileReader;

/**
 *
 * @author nemea
 */
public class Main {
    Main() {
            String path;
            parser ThisParser;
            Yylex ThisScanner;
            path="entrada.cpp";
        try
            { 
                ThisScanner= new Yylex (new FileReader (path));

                ThisParser=new parser (ThisScanner);
                ThisParser.parse ();

                Interfaz.setTexto2("FIN DEL ESCANEO");
            }catch(Exception e)
                {Interfaz.setTexto2("SE TRUNCO EL PROCESO "+e.toString());}
        }
    public static void main(String[] args) {
        new Interfaz().setVisible(true);
    }
    
}

