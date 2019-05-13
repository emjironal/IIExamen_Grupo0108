/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso04_Prototype;

/**
 *
 * @author eduardo
 */
public class Contrato implements Documento
{
    @Override
    public Documento clone()
    {
        return new Contrato();
    }
}
