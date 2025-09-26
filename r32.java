class Std {

    String name;
    int no;

    Std() {
        this.name = "unknown";
        this.no = 0;
    }

    Std(String name, int no) {
        this.name = name;
        this.no = no;
    }


    Std(Std s) {
        this.name = s.name;
        this.no = s.no;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + no);
    }
}

// Main class
public class r32 {

    public static void main(String[] args) {
        Std s1 = new Std();               
        Std s2 = new Std("Teena", 22);  
        Std s3 = new Std(s2);           

        s1.display();
        s2.display();
        s3.display();
    }
}
