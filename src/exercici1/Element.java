package exercici1;

public class Element implements Cloneable {

    private int num;
    protected String cad;

    public Element(int num, String cad) {
        this.num = num;
        this.cad = cad;
    }

    public Element() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }
}
