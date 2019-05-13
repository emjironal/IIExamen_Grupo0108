/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso04_Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class AgenteRRHH
{
    public List<Documento> obtenerDocumentos()
    {
        CacheDocumento cacheDocumento = new CacheDocumento();
        ArrayList<Documento> docs = new ArrayList<>();
        docs.add(cacheDocumento.getMachoteAcuerdo());
        docs.add(cacheDocumento.getMachoteContrato());
        return docs;
    }
}
