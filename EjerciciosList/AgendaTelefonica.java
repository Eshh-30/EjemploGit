package EjerciciosList;

import java.util.HashMap;
import java.util.Set;

public class AgendaTelefonica {
    public static void main(String[] args) {
        
        // Nombre -> Telefono
        HashMap<String, Integer> contactos = new HashMap<>();

        putContact("Juan", 44812323, contactos);
        
        System.out.println(findContact("Juan", contactos));
        printAllContacts(contactos);
    }

    // Declarar funcion para agregar contactos
    public static void putContact(String name, Integer phone, HashMap<String, Integer> map) {
        map.put(name, phone);
    }

    // Delcarar funcion que busque un contacto por nombre y regrese su numero telefonico
    public static Integer findContact(String name, HashMap<String, Integer> map) {
        return map.get(name);
    }

    // Declarar una funcion que imprima todos los contactos
    public static void printAllContacts(HashMap<String, Integer> map) {
        System.out.println(map);
    }
}