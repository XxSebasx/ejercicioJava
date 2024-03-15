package Herencia.Objetos;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
        this("red", false);
    }

    abstract public String getColor();

    abstract public void setColor(String color);

    abstract public boolean isFilled();

    abstract public void setFilled(boolean filled);

    

    
}
