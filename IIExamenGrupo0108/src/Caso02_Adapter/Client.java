/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nicole
 */
public class Client {
    
    public Client(){}
    
    public static void login(String login, String password){
        Validator v = new CredentialValidator();
        Usuario usr = new Usuario();
        usr.setLogin(login);
        usr.setPassword(password);
        List<String> errors = v.validate(usr);
        
        if (errors.isEmpty()){
            System.out.println("Login exitoso");
        }else{
            for (String error : errors){
                System.out.println(error);
            }
        }
    }
    
    public static void signin(Usuario usr){
        List<String> errors = new ArrayList<>();
        Validator v = new DuplicateValidator();
        errors.addAll(v.validate(usr));
        v = new PhoneFormatValidator();
        errors.addAll(v.validate(usr.getPhone()));
        v = new BirthdayValidator();
        errors.addAll(v.validate(usr.getBirthday()));
        v = new EmailFormatValidator();
        errors.addAll(v.validate(usr.getEmail()));
        v = new SurnameValidator();
        errors.addAll(v.validate(usr));
        
        if (errors.isEmpty()){
            RegisteredUsersList.getInstance().addUser(usr);
            System.out.println("Usuario registrado exitosamente");
        }else{
            for (String error : errors){
                System.out.println(error);
            }
        }
        
    }
    
    public static void main(String[] args)
    {
        Date date = new Date();
        Usuario usr1 = new Usuario();
        usr1.setName("Juan");
        usr1.setLogin("Juan123");
        usr1.setPassword("123");
        usr1.setSurname1("Flores");
        usr1.setBirthday(date);
        usr1.setAddress("Costa Rica");
        usr1.setEmail("juangmail.com");
        usr1.setPhone("aaa888");
        
        System.out.println("\nIntenta registrar usuario Juan:---------------------");
        signin(usr1);
        
        date.setYear(1990);
        
        usr1.setName("Juan");
        usr1.setLogin("Juan123");
        usr1.setPassword("123");
        usr1.setSurname1("Flores");
        usr1.setSurname2("Salazar");
        usr1.setBirthday(date);
        usr1.setAddress("Costa Rica");
        usr1.setEmail("juan@gmail.com");
        usr1.setPhone("88888888");
        
        System.out.println("\nRegistra al usuario Juan:--------------------------");
        signin(usr1);
        System.out.println("\nIntenta hacer login con credenciales malas:--------");
        login("Juan123", "12");
        System.out.println("\nHace login:-------------------------------------------");
        login("Juan123", "123");
        System.out.println("\nIntenta registrarlo otra vez:-------------------------");
        signin(usr1);
                
        
    }
    
}
