package classes.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000, 45, 1985);
        double tax = employee.tax();
        int bonus = employee.bonus();

        double totalSalary = employee.salary + bonus - tax;

        System.out.println("Adı: " + employee.name);
        System.out.println("Maaşı: " + employee.salary);

        System.out.println("Çalışma Saati: " + employee.workHours);
        System.out.println("Başlangıç Yılı: " + employee.hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);

        employee.raiseSalary();

        System.out.println("Maaş Artışı: " + (employee.salary - 2000));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary);
        System.out.println("Toplam Maaş: " + (totalSalary + tax));
    }


}
