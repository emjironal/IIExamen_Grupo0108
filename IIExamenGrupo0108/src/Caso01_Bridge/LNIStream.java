/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso01_Bridge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author Nicole
 */
public class LNIStream extends AbstractImplementador {
    
    private int currentLine;
    private LineNumberReader lnr;
    
    public LNIStream(String filePath) throws FileNotFoundException{
        currentLine = 0;
        fileInputStream = new FIStream(filePath);
        lnr = new LineNumberReader(new FileReader(filePath));
    }
    
    public int countLines() throws IOException{
        while (lnr.skip(Long.MAX_VALUE) > 0){}
        return lnr.getLineNumber() + 1;
    }
    
    public int getCurrentLine(){
        return lnr.getLineNumber();
    }
}
