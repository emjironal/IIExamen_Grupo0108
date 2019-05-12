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
public class Observable
{
    protected ArrayList<Monitor> observerCollection;

    public Observable()
    {
        observerCollection = new ArrayList<>();
    }

    public void addObserver(Monitor monitor)
    {
        observerCollection.add(monitor);
    }

    public void eliminateObserver(Monitor monitor)
    {
        observerCollection.remove(monitor);
    }

    public void notifyObservers()
    {
        observerCollection.forEach((monitor) ->
        {
            monitor.notificar(this);
        });
    }
}
