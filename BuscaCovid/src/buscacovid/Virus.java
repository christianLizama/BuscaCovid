/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscacovid;

import javafx.scene.image.Image;

/**
 *
 * @author Ryuk
 */
public class Virus {
    private int i,j;
    private int index;

    public Virus(int i, int j, int index) {
        this.i = i;
        this.j = j;
        this.index = index;
    }
    
    public Virus(int index) {
        this.index = index;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
