public class BuilderPattern {
    static class Employee {
        private String name;
        private String email;

        private int age;
        private String department;
        private double salary;
        private String phone;

        private Employee(Builder builder) {
            this.name       = builder.name;
            this.email      = builder.email;
            this.age        = builder.age;
            this.department = builder.department;
            this.salary     = builder.salary;
            this.phone      = builder.phone;
        }

        public String toString() {
            return "Employee{name=" + name +
                    ", email=" + email +
                    ", age=" + age +
                    ", dept=" + department +
                    ", salary=" + salary +
                    ", phone=" + phone + "}";
        }

        static class Builder {
            private String name;
            private String email;
            private int age;
            private String department;
            private double salary;
            private String phone;

            Builder(String name, String email) {
                this.name  = name;
                this.email = email;
            }

            Builder age(int age) { this.age = age; return this; }
            Builder department(String dept) { this.department = dept; return this; }
            Builder salary(double salary) { this.salary = salary; return this; }
            Builder phone(String phone) { this.phone = phone; return this; }

            Employee build() { return new Employee(this); }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee.Builder("Sumiran", "sumiran@gmail.com")
                .age(21)
                .department("Engineering")
                .salary(50000)
                .phone("9876543210")
                .build();

        Employee emp2 = new Employee.Builder("Rahul", "rahul@gmail.com")
                .age(25)
                .department("Marketing")
                .build();

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
