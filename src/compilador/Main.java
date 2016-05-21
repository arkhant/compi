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
                Interfaz.setEstatusMensaje("FIN DE ESCANEO..", 2);
                
                 Interfaz.jlbl_stEscanear.setVisible(true);
                 Interfaz.jlbl_stEscanear.setText("OK");
                 Interfaz.jlbl_stEscanear.setBackground(java.awt.Color.green);
                 Interfaz.jlbl_stEscanear.setOpaque(true);
                 Interfaz.jlbl_stEscanear.setForeground(java.awt.Color.black);
                
            }catch(Exception e)
                {Interfaz.setTexto2("SE TRUNCO EL PROCESO "+e.toString());}
        Interfaz.setEstatusMensaje("algo no esta bien con el escaneo..", 1);
        
        Interfaz.jlbl_stEscanear.setVisible(true);
        Interfaz.jlbl_stEscanear.setText("ERROR");
        Interfaz.jlbl_stEscanear.setBackground(java.awt.Color.red);
        Interfaz.jlbl_stEscanear.setOpaque(true);
        Interfaz.jlbl_stEscanear.setForeground(java.awt.Color.white);
        
        
        }
       /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        new Interfaz().setVisible(true);
    }
    
}

