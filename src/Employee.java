public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.hireYear = hireYear;
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;

    }


    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus += (this.workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    double raiseSalary() {
        int fark = 2021 - this.hireYear;
        if ((fark) < 10) {
            return this.salary += this.salary * 0.05;
        } else if (fark > 9 && fark < 20) {
            return this.salary += this.salary * 0.10;
        } else if (fark > 19) {
            return this.salary += this.salary * 0.15;
        }
        return 0.0;
    }

    public String toString() {
        System.out.println("Adı :" + this.name + "\nÇalışma Saati :" + this.workHours + "\nBaşlangıç Yılı :" + this.hireYear + "\nVergi :" + tax() + "\nBonus :" + bonus() +
                "\nMaaş Artışı :" + raiseSalary() + "\nVergi ve Bonuslar ile Birlikte Maaş :" + (this.salary + bonus() - tax()) + "\nToplam Maaş :" + (this.salary + bonus() - tax() + raiseSalary()));
        System.out.println("/////////////////////////////");

        return "bitti";


    }

}


