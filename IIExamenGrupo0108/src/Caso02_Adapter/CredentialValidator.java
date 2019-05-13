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
public class CredentialValidator implements Validator {

    @Override
    public List<String> validate(Object T) {
        Usuario usr = (Usuario) T;
        List<String> errors = new ArrayList<>();
        Credential c = new Credential();
        if (!c.validateCredencial(usr.getLogin(), usr.getPassword()))
            errors.add("Error: credenciales incorrectas");
        return errors;
    }
    
    
    
}
