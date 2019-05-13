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
public class OSProcess extends Observable
{
    private ArrayList<String> processes;

    public OSProcess()
    {
        super();
        processes = new ArrayList<>();
    }

    public void addProcess(String process)
    {
        processes.add(process);
        super.notifyObservers();
    }

    /**
     * @return the processes
     */
    public ArrayList<String> getProcesses() {
        return processes;
    }

    /**
     * @param processes the processes to set
     */
    public void setProcesses(ArrayList<String> processes) {
        this.processes = processes;
        super.notifyObservers();
    }
}
