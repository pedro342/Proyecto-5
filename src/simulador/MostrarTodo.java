/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import java.util.ArrayList;

/**
 *
 * @author pedri
 */
public class MostrarTodo {

    public void MostrarTodo() {

    }
    private javax.swing.JTextArea jTextArea1;
    String caracteristicas;
    String mensaje;
    private int rda = (int) (Math.random() * 9);
    private ArrayList<animalesTerrestres> Tierrita = new ArrayList<animalesTerrestres>();
    private ArrayList<animalesAereos> Cielito = new ArrayList<animalesAereos>();
    private ArrayList<animalesAcuaticos> Aguita = new ArrayList<animalesAcuaticos>();
    ArrayList<arbolesClase> Bosquecito = new ArrayList<arbolesClase>();
    ArrayList<floresClase> Florecita = new ArrayList<floresClase>();

    int bandera = 0;

    public int setBandera(int valor) {
        bandera = valor;
        return bandera;
    }

    public int getBandera() {
        return bandera;
    }

    public void animalAcuatico(animalesAcuaticos animal) {
        this.Aguita.add(animal);
    }

    public void animalTerrestre(animalesTerrestres animal) {
        this.Tierrita.add(animal);
    }

    public void animalAereos(animalesAereos animal) {
        this.Cielito.add(animal);
    }

    public void arboles(arbolesClase arbol) {
        this.Bosquecito.add(arbol);
    }

    public void flores(floresClase flor) {
        this.Florecita.add(flor);
    }

    public void calculo() {

        switch (getBandera()) {
            case 1:
                for (int i = 0; i < Cielito.size(); i++) {
                    if (rda == Cielito.get(i).getIDA()) {
                        System.out.println(Cielito.get(i).capacidades(mensaje));
                    }
                }
                break;
            case 2:
                for (int i = 0; i < Tierrita.size(); i++) {
                    if (rda == Tierrita.get(i).getIDT()) {
                        System.out.println(Tierrita.get(i).capacidades(mensaje));
                    }
                }
                break;
            case 3:
                for (int i = 0; i < Aguita.size(); i++) {
                    if (rda == Aguita.get(i).getIDN()) {
                        System.out.println(Aguita.get(i).capacidades(mensaje));
                    }
                }
                break;
            case 4:
                for (int i = 0; i < Bosquecito.size(); i++) {
                    if (rda == Bosquecito.get(i).getIDR()) {
                        System.out.println(Bosquecito.get(i).caracteristicas(caracteristicas));
                    }
                }
                break;
            case 5:
                for (int i = 0; i < Florecita.size(); i++) {
                    if (rda == Florecita.get(i).getIDF()) {
                        System.out.println(Florecita.get(i).caracteristicas(caracteristicas));
                    }
                }
                break;
        }
    }
}
