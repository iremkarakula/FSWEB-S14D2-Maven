package org.example.model;

public class Bedroom extends Room {

    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;



    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling,
                   Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, ceiling, carpet);
        this.lamp = lamp;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }




    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString(){
        return  super.toString() + "BEDROOM: " + bed + lamp + wardrobe;
    }


}
