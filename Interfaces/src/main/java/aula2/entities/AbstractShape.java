package aula2.entities;

import aula2.enums.Color;
import aula2.service.ShapeService;


public abstract class AbstractShape implements ShapeService {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
