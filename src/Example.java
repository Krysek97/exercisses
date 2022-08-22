import java.util.ArrayList;
import java.util.List;

public class Example {
    List<Employee> employees = new ArrayList<>();

    public void setEmployees(){
        Employee employee1 = new Employee("name1", "last1", 32,List.of("JavaScript", "Phyton", "Java"));
        Employee employee2 = new Employee("name2","last2", 42, List.of("C#"));
        Employee employee3 = new Employee("name3", "last3", 22, List.of("Java","Haskell", "Scala"));
        Employee employee4 = new Employee("name4", "last4", 34, List.of("PHP", "JavaScript", "React", "Angular"));
        Employee employee5 = new Employee("name5", "last5", 48, List.of("Java", "Scala"));
        Employee employee6 = new Employee("name6", "last6", 33, List.of("C" , "C++"));
        Employee employee7 = new Employee("name7", "last7", 43, List.of("Rust", "Python"));
        Employee employee8 = new Employee("name8", "last8", 51, List.of("Java", "Spring", "Hibernate", "JavaScript"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        employees
                .forEach(employee -> System.out.println(employee.getFirstName()) );

    }



}
