package exercici1;

public class Exercici1 {

    public static void main(String[] args) {
        Element e = new Element();
        InfoElement info = new InfoElement(e);
        
        
        System.out.println("1. nom de la superclasse: " + info.nomSuperClase());
        System.out.println("2. nom de la classe complet: " + info.nomClaseComplet());
        System.out.println("3. només el nom de la classe: " + info.nomesNomClase());
        System.out.println("4. array d'atributs (Field): " + info.arrayAtributs());
        System.out.println("5. array de mètodes (Method): " + info.arrayMetodes());
        System.out.println("6. array dels noms dels atributs: " + info.arrayNomAtributs());
        System.out.println("7. array dels noms dels mètodes: " + info.nomMetodes());
    }
    
}
