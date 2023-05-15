package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryAfterTaxes = 0;
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        } else if (salary <= 10000) {
            salaryAfterTaxes = salary - (salary * 0.15);
        } else if (salary > 10000 && salary <= 20000) {
            salaryAfterTaxes = salary - (salary * 0.18);
        } else {
            salaryAfterTaxes = salary - (salary * 0.20);
        }
        System.out.println(salaryAfterTaxes);
    }
}
