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
public class animalesAcuaticos extends animales {

    private int IDN;

    public animalesAcuaticos(String tipo, String nombreCientifico, String color, int tamanio, int IDN) {
        super(tipo, nombreCientifico, color, tamanio);
        this.IDN = IDN;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getIDN() {
        return IDN;
    }

    public String getnombreCientifico() {
        return nombreCientifico;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIDN(int IDN) {
        this.IDN = IDN;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setnombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String capacidades(String mensaje) {
        mensaje = this.tipo + "\n" + this.nombreCientifico + "\n" + this.color + "\n" + this.tamanio;
        return mensaje;
    }
}
