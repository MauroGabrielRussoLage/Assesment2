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
        System.out.println("Enter the patient's age");
        int age = in.nextInt();
        System.out.println("Enter the patient's ID");
        long id = in.nextLong();
        System.out.println("Enter the patient's name");
        String skipNextLine = in.nextLine();
        String name = in.nextLine();
        Patient currentPatient = age < 18 ? new PediatricPatient(name,age,id): new AdultPatient(name,age,id);
        if (currentPatient instanceof PediatricPatient) {
            System.out.println("Enter the patient's gestational age");
            int gestationalAge = in.nextInt();
            System.out.println("Enter the patient's birth weight");
            double birthWeight = in.nextDouble();
            System.out.println("Enter the patient's immunization status");
            boolean immunization = in.nextBoolean();
            ((PediatricPatient) currentPatient).setGestationalAge(gestationalAge);
            ((PediatricPatient) currentPatient).setBirthWeight(birthWeight);
            ((PediatricPatient) currentPatient).setImmunization(immunization);
        } else {
            System.out.println("Enter the patient's employment status");
            boolean isWorking = in.nextBoolean();
            System.out.println("Enter the patient's smoking habit");
            boolean isSmoker = in.nextBoolean();
            System.out.println("Enter the patient's alcohol use status");
            boolean hasAlcoholism = in.nextBoolean();
            ((AdultPatient) currentPatient).setWorking(isWorking);
            ((AdultPatient) currentPatient).setSmoker(isSmoker);
            ((AdultPatient) currentPatient).setAlcoholism(hasAlcoholism);
        }
        System.out.println(currentPatient);
    }
}