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
public class CacheDocumento
{
    private AcuerdoConfidencialidad machoteAcuerdo;
    private Contrato machoteContrato;

    public CacheDocumento()
    {
        machoteAcuerdo = new AcuerdoConfidencialidad();
        machoteContrato = new Contrato();
    }

    /**
     * @return the machoteAcuerdo
     */
    public AcuerdoConfidencialidad getMachoteAcuerdo() {
        return machoteAcuerdo;
    }

    /**
     * @return the machoteContrato
     */
    public Contrato getMachoteContrato() {
        return machoteContrato;
    }
}
