/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso01_Bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nicole
 */
public class BIStream extends AbstractImplementador{
    
    BufferedReader buffer;
    
    public BIStream(String filePath) throws FileNotFoundException{
        fileInputStream = new FIStream(filePath);
        buffer = new BufferedReader( new FileReader (filePath));
    }
    
    public void readLine() throws IOException{
        
        System.out.println(buffer.readLine());
    }
    
    
}
