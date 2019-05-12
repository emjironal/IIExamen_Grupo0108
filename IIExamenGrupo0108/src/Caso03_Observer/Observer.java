/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso03_Observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Observer
{
    public static void main(String[] args)
    {
        //Observables
        DataBase db = new DataBase();
        LogFile log = new LogFile();
        OSProcess process = new OSProcess();
        //Monitors
        DBaseMonitor dbMonitor = new DBaseMonitor();
        FileMonitor fileMonitor = new FileMonitor();
        ProcessMonitor processMonitor = new ProcessMonitor();
        dbMonitor.setVisible(true);
        fileMonitor.setVisible(true);
        processMonitor.setVisible(true);
        //Añadir los observer a los observables
        db.addObserver(dbMonitor);
        log.addObserver(fileMonitor);
        process.addObserver(processMonitor);
        //Añadir objetos en los observables
        //Agrego las columnas
        ArrayList<String> columns = new ArrayList<>();
        columns.add("Nombre");
        columns.add("Apellido");
        columns.add("User");
        db.setColumns(columns);
        //Agrego las filas
        ArrayList<String> fila = new ArrayList<>();
        fila.add("Eduardo");
        fila.add("Jirón");
        fila.add("ejiron");
        db.addFila(fila);
        ArrayList<String> fila2 = new ArrayList<>();
        fila2.add("Nicole");
        fila2.add("Carvajal");
        fila2.add("ncarvajal");
        db.addFila(fila2);
        //Agrego los logs
        Date date = Calendar.getInstance().getTime();
        String file = date.toString() + ".log";
        log.addLog(file);
        //Agrego los procesos
        String proceso = "proceso 1";
        String proceso2 = "proceso 2";
        process.addProcess(proceso);
        process.addProcess(proceso2);
    }
}
