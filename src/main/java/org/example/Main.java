package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("King",
                new Wall("x"),
                new Wall("y"),
                new Wall("z"),
                new Wall("t"),
                new Ceiling(200, PaintColor.RED),
                new Bed("L", 2, 50, 1, 4),
                new Lamp(LampType.NORMAL, true, 20),
                new Wardrobe(10, 10, 10),
                new Carpet(20, 20, PaintColor.GREEN)
                );
        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getWall1().create();
        System.out.println(bedroom);
    }
}