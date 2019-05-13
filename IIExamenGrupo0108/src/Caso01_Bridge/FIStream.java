/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso01_Bridge;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nicole
 */
public class FIStream {
    
    private FileInputStream fis;
    private File file;
    
    public FIStream(String filePath) throws FileNotFoundException{
        fis = new FileInputStream(filePath);
        file = new File(filePath);
    }
    
    public void readBytes(byte[] b) throws IOException{
        int c = fis.read(b);
        System.out.print((char)c);
        
    }
    
    public void readByte() throws IOException{
        int b = fis.read();
        System.out.print((char)b);
    }
    
    public String readAllFile() throws IOException{
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        String str = new String(data, "UTF-8");
        return str;
        
    }

    
    
    
}
