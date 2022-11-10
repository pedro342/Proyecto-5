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
public class animalesAereos extends animales {

    private int IDA;

    public animalesAereos(String tipo, String nombreCientifico, String color, int tamanio, int IDA) {
        super(tipo, nombreCientifico, color, tamanio);
        this.IDA = IDA;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getIDA() {
        return IDA;
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

    public void setIDA(int IDA) {
        this.IDA = IDA;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSexo(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String capacidades(String mensaje) {
        mensaje = this.tipo + "\n" + this.nombreCientifico + "\n" + this.color;
        return mensaje;
    }
}
