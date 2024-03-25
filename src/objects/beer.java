package objects;

public class beer {
    String name;
    boolean typ;

    public beer(String name, boolean typ){
        this.name = name;
        this.typ = typ;
    }
    @Override
    public String toString() {
        return name + ", " + typ;
    }
}
