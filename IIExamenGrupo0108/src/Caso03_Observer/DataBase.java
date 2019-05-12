/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso03_Observer;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class DataBase extends Observable
{
    private ArrayList<String> columns;
    private ArrayList<ArrayList<String>> filas;

    public DataBase()
    {
        super();
        columns = new ArrayList<>();
        filas = new ArrayList<>();
    }

    public void addFila(ArrayList<String> fila)
    {
        filas.add(fila);
        super.notifyObservers();
    }

    public ArrayList<String> getFila(int position)
    {
        return filas.get(position);
    }

    /**
     * @return the columns
     */
    public ArrayList<String> getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(ArrayList<String> columns) {
        this.columns = columns;
        super.notifyObservers();
    }

    /**
     * @return the filas
     */
    public ArrayList<ArrayList<String>> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(ArrayList<ArrayList<String>> filas) {
        this.filas = filas;
        super.notifyObservers();
    }
}
