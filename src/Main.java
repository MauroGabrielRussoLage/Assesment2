import model.AdultPatient;
import model.PediatricPatient;
import model.interfaces.Patient;

import java.util.Scanner;


/* Pilares implementados:
    - Polimorfismo: Se implementa al usar una referencia de la clase abstracta `Paciente`, pero instanciando objetos de sus clases concretas. Esto permite que el comportamiento de los métodos varíe según el tipo específico de objeto.
    - Herencia: Los métodos y atributos de la clase abstracta `Paciente` son heredados por sus clases hijas, como `PacienteAdulto` y `PacientePediatrico`. Esto permite la reutilización de código y facilita la extensión de la funcionalidad.
    - Encapsulamiento: Se asegura la protección de los atributos de los objetos mediante el uso de getters y setters. Los datos de los pacientes no son accesibles directamente desde fuera de la clase, sino a través de métodos que permiten controlarlos y validarlos antes de modificarlos.
    - Abstracción: El método `toString()` es un ejemplo de abstracción. La clase `Main` puede llamar a este método para obtener una representación del objeto sin conocer cómo se genera internamente, solo viendo el resultado final.
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