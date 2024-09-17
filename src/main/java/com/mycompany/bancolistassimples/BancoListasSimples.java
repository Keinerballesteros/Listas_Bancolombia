/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancolistassimples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class BancoListasSimples {
    Nodo inicio;
    BancoListasSimples(){
        inicio = null;
    }
    
    public void darElTurno(String nombre, String id, String fechaDeNacimiento, int saldo){
        Nodo nuevo = new Nodo(nombre, id, fechaDeNacimiento, saldo);
        int edad = calcularEdad(fechaDeNacimiento);
        String mensaje = "Turno dado con éxito";
       
        if(nuevo.getSaldo()>1000){
             insertarAlInicio(nuevo);
             JOptionPane.showMessageDialog(null, mensaje);
        }
        else if(edad>=65){
           insertarAlInicio(nuevo);
           JOptionPane.showMessageDialog(null, mensaje);
        }
        else{
            insertarAlFinal(nuevo);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
     public static int calcularEdad(String fechaNacimiento) {
        try {
            // Crear un objeto LocalDate a partir de la fecha de nacimiento
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);

            // Calcular la diferencia en años entre la fecha de nacimiento y la fecha actual
            LocalDate fechaActual = LocalDate.now();
            long años = ChronoUnit.YEARS.between(fechaNac, fechaActual);

            return (int) años;
        } catch (Exception e) {
            System.err.println("Error al calcular la edad: " + e.getMessage());
            return -1; // Valor negativo para indicar un error
        }
    }
     public void insertarAlInicio(Nodo nuevo){
         if(inicio==null){
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
     }
     public void insertarAlFinal(Nodo nuevo){
        
         if(inicio==null){
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
         else{
              Nodo temporal = inicio;
              while(temporal.getEnlace()!= null){
                  temporal = temporal.getEnlace();
              }
              temporal.setEnlace(nuevo);
         }
     }
     public void mostrar(){
         Nodo temporal = inicio;
         if(inicio == null){
             JOptionPane.showMessageDialog(null, "La Lista esta vacía");
         }
         else{
             while(temporal.getEnlace()!= null){
             JOptionPane.showMessageDialog(null, temporal.toString());
             temporal = temporal.getEnlace();
         }
         }
     }
     public void buscar(String nombre){
         Nodo temporal = inicio;
         int contador = 1;
         boolean encontrado = false;
         if(inicio == null){
             JOptionPane.showMessageDialog(null, "La Lista esta vacía");
         }
         else{
             while(temporal.getEnlace()!= null){
                 if(nombre.equalsIgnoreCase(temporal.getNombre())){
                     JOptionPane.showMessageDialog(null, "El usuario tiene el turno "+contador);
                     encontrado = true;
                     break;
                 }
             contador++;
             temporal = temporal.getEnlace();
         }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "El usuario no está en la lista");
            }
        }
         
     }
     
}

