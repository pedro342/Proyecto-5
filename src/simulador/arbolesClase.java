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
public class arbolesClase {

    String tipo, color;
    int tamanio, IDR;

    public arbolesClase(String tipo, String color, int tamanio, int IDR) {
        this.tipo = tipo;
        this.color = color;
        this.tamanio = tamanio;
        this.IDR = IDR;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIDR() {
        return IDR;
    }

    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIDR(int IDR) {
        this.IDR = IDR;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    String caracteristicas;

    public String caracteristicas(String caracteristicas) {
        caracteristicas = this.tipo + "\n" + this.color;
        return caracteristicas;
    }
}
