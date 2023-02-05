/**
 * Example of a record class.
 * @author ashish
 */
public class Records6 {

    record Employee(String name, int age) {
        public Employee {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
    }
    public static void main(String[] args) {

        Employee e1 = new Employee("AJ", 25);
        Employee e2 = new Employee("Ari", 17);
        System.out.println(e1);
        System.out.println(e2);
    }
}
