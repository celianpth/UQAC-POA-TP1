package Reflexivite;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        // Création d'une instance de SecretClass
        SecretClass secretInstance = new SecretClass();

        // Affichage de la valeur initiale
        System.out.println("Valeur initiale : " + secretInstance.getSecret());

        // Accès à l'attribut privé 'secret' à l'aide de la réflexivité
        Field secretField = SecretClass.class.getDeclaredField("secret");
        secretField.setAccessible(true); // Permet d'accéder à l'attribut privé

        // Modification de la valeur de l'attribut 'secret'
        secretField.set(secretInstance, "Nouveau Secret Révélé");

        // Affichage de la nouvelle valeur
        System.out.println("Nouvelle valeur : " + secretInstance.getSecret());
    }
}
