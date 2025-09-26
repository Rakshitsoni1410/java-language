class Teacher {
    void teach() {
        System.out.println("teches to student ");
    }
}
// hiearachical inheritance 
class student extends Teacher {
    void stu(){
        System.out.println(" study at class");
    }
}
class pricicpal extends Teacher{
    void show(){
        System.out.println("show the wokr of the teacher ");
    }
}
public class r35 {
 public static void main(String[] args) {
    pricicpal p =new pricicpal();
    p.show();
 // p.stu();
    p.teach();
 }
}
