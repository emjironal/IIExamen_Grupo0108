/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso01_Bridge;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicole
 */
public class Context {
    
    public static void main(String[] args)
    {
        
        try {
            System.out.println("Declarando una instancia de Buffered Input Stream----------");
            BIStream a = new BIStream("C:\\Users\\nicol\\Documents\\prueba.txt");
            System.out.println("Accede a la función readLine de FileInputStream base:------");
            System.out.println(a.fileInputStream.readAllFile());
            System.out.println("Accede a la nueva función que aporta Bufferen Input Stream---");
            a.readLine();
            System.out.println("Accede a la nueva función que aporta LCIStream---");
            LCIStream l = new LCIStream("C:\\Users\\nicol\\Documents\\prueba.txt");
            l.lowercase();
            System.out.println("Accede a la nueva función que aporta LNIStream---");
            LNIStream lne = new LNIStream("C:\\Users\\nicol\\Documents\\prueba.txt");
            int largo = lne.countLines();
            System.out.println(largo);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
