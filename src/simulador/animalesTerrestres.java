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
public class animalesTerrestres extends animales {

    private int cantidadDePatas;
    private int IDT;

    public animalesTerrestres(String tipo, String nombreCientifico, String color, int tamanio, int cantidadDePatas, int IDT) {
        super(tipo, nombreCientifico, color, tamanio);
        this.cantidadDePatas = cantidadDePatas;
        this.IDT = IDT;
    }

    public int getCantidadDePatas() {
        return cantidadDePatas;
    }

    public int getIDT() {
        return IDT;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setCantidadDePatas(int cantidadDePatas) {
        this.cantidadDePatas = cantidadDePatas;
    }

    public void setIDT(int IDT) {
        this.IDT = IDT;
    }

    public void setnombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String capacidades(String mensaje) {
        mensaje = this.tipo + "\n" + this.nombreCientifico + "\n" + this.color + "\n" + "Miden entre " + this.tamanio + " metros" + "\n" + "Poseen" + cantidadDePatas + " patas";
        return mensaje;
    }

}
