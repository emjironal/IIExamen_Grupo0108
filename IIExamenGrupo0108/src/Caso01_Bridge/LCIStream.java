/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso01_Bridge;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Nicole
 */
public class LCIStream extends AbstractImplementador{
    
    public LCIStream(String filePath) throws FileNotFoundException{
        fileInputStream = new FIStream(filePath);
    }
    
    public void lowercase() throws IOException{
        System.out.println(fileInputStream.readAllFile().toLowerCase());
    }
}
