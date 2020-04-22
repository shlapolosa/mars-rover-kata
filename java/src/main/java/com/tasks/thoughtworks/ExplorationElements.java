package com.tasks.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class ExplorationElements {
    private Plateau plateau = new Plateau("0 0 N");;
    private List<Rover> rovers = new ArrayList<Rover>();

    public void setPlateau(Plateau plateau) {

        this.plateau = plateau;
    }

    public Plateau getPlateau() {
        return this.plateau;
    }

    public void setRovers(List<Rover> rovers) {

        this.rovers = rovers;
    }

    public List<Rover> getRovers() {
        return this.rovers;
    }
}
