public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary>1000){
            return this.salary*0.03;
        }
        System.out.println("Maaş 1000 den düşük olduğu için vergi uygulanmadı.");
        return 0.0;
    }

    public double bonus(){
        return (this.workHours>40)?(this.workHours-40)*30:0;
    }

    public double raiseSalary(){
        if ( (2021-this.hireYear) < 10 ) {
            return this.salary*0.05;
        } else if ( (2021-this.hireYear) >= 10 && (2021-this.hireYear) <19) {
            return this.salary*0.10;
        } else if ( (2021-this.hireYear) >=19 ) {
            return this.salary*0.15;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        double totalMaas=this.salary+raiseSalary()+bonus();
        double netMaas=totalMaas-tax();
        return "Adı=" + name + '\n' +
                "Maaşı=" + salary + '\n' +
                "Çalışma Saati=" + workHours + '\n' +
                "Başlangıç Yılı=" + hireYear + '\n' +
                "Vergi=" + tax() + '\n' +
                "Bonus=" + bonus() + '\n' +
                "Maaş Artışı=" + raiseSalary() + '\n' +
                "Toplam Maaş=" + totalMaas +  '\n' +
                "Net Maaş=" + netMaas +'\n' +
                '}';
    }
}
