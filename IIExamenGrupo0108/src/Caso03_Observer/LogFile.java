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
public class LogFile extends Observable
{
    private ArrayList<String> logs;

    public LogFile()
    {
        super();
        logs = new ArrayList<>();
    }

    public void addLog(String log)
    {
        logs.add(log);
        super.notifyObservers();
    }

    /**
     * @return the logs
     */
    public ArrayList<String> getLogs() {
        return logs;
    }

    /**
     * @param logs the logs to set
     */
    public void setLogs(ArrayList<String> logs) {
        this.logs = logs;
        super.notifyObservers();
    }
}
