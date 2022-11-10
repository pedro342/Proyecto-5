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
public class floresClase {

    String color, tamanio, petalos, extra, tipo;
    int IDF;

    public floresClase(String color, String tamanio, String petalos, String extra, String tipo, int IDF) {
        this.color = color;
        this.tamanio = tamanio;
        this.petalos = petalos;
        this.extra = extra;
        this.tipo = tipo;
        this.IDF = IDF;
    }

    public String getColor() {
        return color;
    }

    public int getIDF() {
        return IDF;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getPetalos() {
        return petalos;
    }

    public String getExtra() {
        return extra;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setIDF(int IDF) {
        this.IDF = IDF;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPetalos(String petalos) {
        this.petalos = petalos;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    String caracteristicas;

    public String caracteristicas(String caracteristicas) {
        caracteristicas = this.tipo + "\n" + this.color + "\n" + this.extra;
        return caracteristicas;
    }
}
