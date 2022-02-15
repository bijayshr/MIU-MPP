package Lab8.Exercise6;

import java.util.function.*;

public class Examples {
    //(Employee e) -> e.getName()
    Function<Employee, String> func = (Employee e) -> e.getName();
    Function<Employee, String> func2 = Employee::getName;
    //Method reference type: Class::instanceMethod

    //(Employee e,String s) -> e.setName(s)
    BiConsumer<Employee, String> bc = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> bc2 = Employee::setName;
    //Method reference type: Class::instanceMethod

    //(String s1,String s2) -> s1.compareTo(s2)
    ToIntBiFunction<String, String> bif = (String s1,String s2) -> s1.compareTo(s2);
    ToIntBiFunction<String, String> bif2 = String::compareTo;
    //Method reference type: Class::instanceMethod

    //(Integer x,Integer y) -> Math.pow(x,y)
    ToDoubleBiFunction<Integer, Integer> dbf = (Integer x,Integer y) -> Math.pow(x,y);
    ToDoubleBiFunction<Integer, Integer> dbf2 = Math::pow;
    //Method reference type: Class::staticMethod

    //(Apple a) -> a.getWeight()
    Function<Apple, Double> apfunc = (Apple a) -> a.getWeight();
    Function<Apple, Double> apfunc2 = Apple::getWeight;
    //Method reference type: Class::instanceMethod

    //(String x) -> Integer.parseInt(x);
    Function<String, Integer> intfunc = (String x) -> Integer.parseInt(x);
    Function<String, Integer> intfunc2 = Integer::parseInt;
    //Method reference type: Class::staticMethod

    EmployeeNameComparator comp = new EmployeeNameComparator();
    Supplier<EmployeeNameComparator > supp = () -> new EmployeeNameComparator();
    Supplier<EmployeeNameComparator > supp2 = EmployeeNameComparator::new;
    //Method reference type: Class::new

    //(Employee e1, Employee e2) -> comp.compare(e1,e2)
    ToIntBiFunction<Employee, Employee> empbif = (Employee e1, Employee e2) -> comp.compare(e1,e2);
    ToIntBiFunction<Employee, Employee> empbif2 = comp::compare;
    //Method reference type: object::instanceMethod

    void evaluator() {
        Employee employee1 = new Employee("Ricardo");
        Employee employee2 = new Employee("Sherlock");
        Apple apple = new Apple(3.0);

        System.out.println(func2.apply(employee1));
        bc2.accept(employee1, "Bruce Wayne");
        System.out.println(bif2.applyAsInt("Apple", "Banana"));
        System.out.println(dbf2.applyAsDouble(3, 5));
        System.out.println(apfunc2.apply(apple));
        System.out.println(intfunc2.apply("32"));
        System.out.println(supp2.get().getClass().getSimpleName());
        System.out.println(empbif2.applyAsInt(employee1, employee2));
    }

    public static void main(String[] args) {
        Examples examples = new Examples();
        examples.evaluator();
    }

}
