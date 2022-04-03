public class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Student(String _name, int _stuNo, Course c1, Course c2, Course c3){
        name=_name;
        stuNo=_stuNo;
        course1=c1;
        course2=c2;
        course3=c3;
        avarage=0;
        isPass=false;

    }
    void addBulkExamNote(int c1, int c2, int c3){
        course1.note=c1;
        course2.note=c2;
        course3.note=c3;
    }
    void NotGir(Course c1, int not1){
        System.out.println(c1.name + " dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.");
        System.out.println("Ders notunuz : " + (c1.note*0.8+not1*0.2) );
    }
    void printNot(){
        System.out.println("Ders : " + course1.name + " Not : "+ course1.note);
    }
}
