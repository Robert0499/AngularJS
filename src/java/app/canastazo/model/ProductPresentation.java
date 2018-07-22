/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.model;

/**
 *
 * @author stytr
 */
public class ProductPresentation {

    private int id;
    private String presentation;

    public ProductPresentation() {
    }

    public ProductPresentation(int id, String presentation) {
        this.id = id;
        this.presentation = presentation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    @Override
    public String toString() {
        return "ProductPresentation{" + "id=" + id + ", presentation=" + presentation + '}';
    }

    
    
}
