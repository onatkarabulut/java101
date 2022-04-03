public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String _name, String _code, String _prefix){
        name=_name;
        code=_code;
        prefix=_prefix;
        note=0;

    }
    void addTeacher(Teacher _teacher){
        teacher=_teacher;
    }



    void printTeacher(){
        System.out.printf("%-50s: %s\n%-50s: %s\n%-50s: %s","Adınız", teacher.name,"Telefon Numaranız", teacher.mobilPhoneNumber, "Branş", teacher.branch);
    }

}
