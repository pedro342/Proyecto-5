/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author pedri
 */
public class animales {

    public animales() {
    }
    protected String tipo, color, nombreCientifico;
    protected int tamanio;

    public animales(String tipo, String nombreCientifico, String color, int tamanio) {
        this.tipo = tipo;
        this.nombreCientifico = nombreCientifico;
        this.color = color;
        this.tamanio = tamanio;
    }
}
