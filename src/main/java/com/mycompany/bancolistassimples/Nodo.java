/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancolistassimples;

public class Nodo {
    String nombre;
    String id;
    String fechaDeNacimiento;
    int saldo;
    Nodo enlace;

    public Nodo(String nombre, String id, String fechaDeNacimiento, int saldo) {
        this.nombre = nombre;
        this.id = id;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", id=" + id + ", fechaDeNacimiento=" + fechaDeNacimiento + ", saldo=" + saldo + '}';
    }
    
    
}
