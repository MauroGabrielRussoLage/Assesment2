import model.AdultPatient;
import model.PediatricPatient;
import model.interfaces.Patient;

import java.util.Scanner;


/* Pilares implementados:
    - Polimorfismo: En el uso de la referencia a la clase abstracta de paciente pero instanciando su implementación
    - Herencia: En los metodos y atributos originales de la clase abstracta de paciente heredadas por sus extenciones
    - Encapsulamiento: La protección de los atributos de los objetos mediante getters y setters
    - Abstracción: Mediante el llamado del metodo toString, que la clase main no sabe que hace internamente, pero si el resultado
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Set your age");
        Integer age = in.nextInt();
        System.out.println("Set your ID");
        Long id = in.nextLong();
        System.out.println("Set your name");
        String pausa = in.nextLine();
        String name = in.nextLine();
        Patient currentPatient = age < 18 ? new PediatricPatient(name,age,id): new AdultPatient(name,age,id);
        System.out.println(currentPatient.toString());
    }
}