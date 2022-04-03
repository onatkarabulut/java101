public class Teacher {
    String name;
    String mobilPhoneNumber;
    String branch;

    Teacher(String _name, String _mobilPhoneNumber, String _branch){
        name=_name;
        mobilPhoneNumber=_mobilPhoneNumber;
        branch=_branch;
    }

    void print(){
        System.out.printf("%-50s: %s\n%-50s: %s\n%-50s: %s","Adınız", name,"Telefon Numaranız", mobilPhoneNumber, "Branş", branch);
    }
}
