package exercici1;

public class Exercici1 {

    public static void main(String[] args) {
        Element e = new Element();
        InfoElement info = new InfoElement(e);
        
        
        System.out.println(info.nomSuperClase());
        System.out.println(info.nomClaseComplet());
        System.out.println(info.nomesNomClase());
        System.out.println(info.arrayAtributs());
        System.out.println(info.arrayMetodes());
        System.out.println(info.arrayNomAtributs());
        System.out.println(info.nomMetodes());
    }
    
}
