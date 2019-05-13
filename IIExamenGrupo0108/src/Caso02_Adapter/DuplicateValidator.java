/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicole
 */
public class DuplicateValidator implements Validator{

    @Override
    public List<String> validate(Object T) {
        Usuario usr =  (Usuario) T;
        Duplicate dup = new Duplicate();
        List<String> errors = new ArrayList<>();
        if(dup.validateDuplicates(usr)){
            errors.add("Error: Usuario ya existe");
        }
        return errors;
    }
    
}
