class Patient {
    private String name;
    static String hospital = "zydus";

    public Patient(String name) {
        this.name = name;
    }

    public static void patientInfo() {
        System.out.println("Hospital name: " + hospital);
    }

    public void display() {
        System.out.println(name + " admitted to " + hospital);
    }
}

public class r31 {
    public static void main(String[] args) {
        Patient p = new Patient("raju bhai");
        p.display();
        Patient.patientInfo();
    }
}
