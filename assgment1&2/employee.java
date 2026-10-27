package Assigment;


    class FullTimeEmployee extends employee {
        private double allowance;

        public FullTimeEmployee(String employeeId, String name,
                                String department, double basicSalary, double allowance) {
            super(employeeId, name, department, basicSalary);
            this.allowance = allowance;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + allowance;
        }

        @Override
        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Category: Full-Time Employee");
            System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
        }
    }

    class PartTimeEmployee extends employee {
        private double hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(String employeeId, String name,
                                String department, double hoursWorked, double hourlyRate) {
            super(employeeId, name, department, 0);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }

        @Override
        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Category: Part-Time Employee");
            System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
        }
    }

    class Manager extends employee {
        private double bonus;

        public Manager(String employeeId, String name,
                       String department, double basicSalary, double bonus) {
            super(employeeId, name, department, basicSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + bonus;
        }

        @Override
        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Category: Manager");
            System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
        }
    }

    public class employee {
        protected String employeeId;
        protected String name;
        protected String department;
        protected double basicSalary;

        public employee(String employeeId, String name,
                        String department, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.basicSalary = basicSalary;
        }

        public double calculateSalary() {
            return basicSalary;
        }

        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
        }

        public static void main(String[] args) {
            employee[] employees = {
                    new FullTimeEmployee("EMP001", "Ahmed Ali", "IT", 500, 150),
                    new PartTimeEmployee("EMP002", "Fatima Hassan", "Laboratory", 30, 8),
                    new Manager("EMP003", "Mohamed Omar", "Administration", 1000, 200)
            };

            System.out.println("===== EMPLOYEE SALARY REPORT =====");
            System.out.println();

            for (employee emp : employees) {
                emp.displayInfo();
                System.out.println();
            }
        }
    }



