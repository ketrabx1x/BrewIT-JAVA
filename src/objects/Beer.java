package objects;

public class Beer {
    String name;
    boolean typ;

    public Beer(String name, boolean typ){
        this.name = name;
        this.typ = typ;
    }
    @Override
    public String toString() {
        return name + ", " + typ;
    }
}