/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso04_Prototype;

import java.util.List;

/**
 *
 * @author eduardo
 */
public class Prototype
{
    public static void main(String[] args)
    {
        AgenteRRHH agente = new AgenteRRHH();
        List<Documento> docs = agente.obtenerDocumentos();
        for(Documento doc : docs)
        {
            System.out.println(doc.getClass().getName());
        }
    }
}
