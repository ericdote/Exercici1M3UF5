package exercici1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Eric
 */
public class InfoElement {

    private Element e;

    public InfoElement(Element e) {
        this.e = e;
    }

    public String nomSuperClase() {
        return e.getClass().getSuperclass().getName();
    }

    public String nomClaseComplet() {
        return e.getClass().getCanonicalName();
    }

    public String nomesNomClase() {
        return e.getClass().getSimpleName();
    }

    public Field[] arrayAtributs() {
        return e.getClass().getDeclaredFields();
    }

    public Method[] arrayMetodes() {
        return e.getClass().getDeclaredMethods();
    }

    public String[] arrayNomAtributs() {
        String[] nomAtributs = new String[arrayAtributs().length];
        Field[] att = arrayAtributs();
        for (int i = 0; i < nomAtributs.length; i++) {
            nomAtributs[i] = att[i].getName();
        }
        return nomAtributs;
    }

    public String[] nomMetodes() {
        String[] nomMetodes = new String[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = meth[i].getName();
        }
        return nomMetodes;
    }

    public int[] modAtribut() {
        int[] modAtribut = new int[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < modAtribut.length; i++) {
            modAtribut[i] = meth[i].getModifiers();
        }
        return modAtribut;
    }

    public int[] modMetode() {
        int[] modModificador = new int[arrayAtributs().length];
        Field[] field = arrayAtributs();
        for (int i = 0; i < modModificador.length; i++) {
            modModificador[i] = field[i].getModifiers();
        }
        return modModificador;
    }

    public void modificarAttr(Field atribut, Object nouValor) throws IllegalArgumentException, IllegalAccessException{
        atribut.setAccessible(true);
        atribut.set(e, nouValor);
    }
    
    public void executarMetode(){
        e.getCad();
    }
    
    public void instanciaElement(){
        Element element = new Element(1, "1");
    }
    
    @Override
    public Element clone() throws CloneNotSupportedException {
        return new Element(e.getNum(), e.getCad());
    }

}
