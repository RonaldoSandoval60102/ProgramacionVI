package prototype;

public abstract class Shape implements Cloneable{
    
    protected String name;

    public abstract void draw();

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
