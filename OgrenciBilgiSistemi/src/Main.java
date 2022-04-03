public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher( "Emre Hoca", "905380000000", "MAT");
        Teacher t2=new Teacher( "Hasan Hoca", "905380000000", "MAT");
        Teacher t3=new Teacher( "ayşe Hoca", "905380000000", "MAT");

        Course mat=new Course("Matematik","101","MAT");
        Course fiz=new Course("fen","102","fiz");
        Course kim=new Course("kimya","103","kim");

        mat.addTeacher(t1);
        fiz.addTeacher(t2);
        kim.addTeacher(t3);

        Student ogrenci=new Student("Emre",01012016,mat,fiz,kim);
        ogrenci.addBulkExamNote(100,20,80);

        ogrenci.NotGir(mat,20);

    }
}
