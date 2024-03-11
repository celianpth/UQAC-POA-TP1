package SOLID;

// Classe principale pour tester les principes SOLID
public class Main {
    public static void main(String[] args) {
        // Test du principe Open-Closed
        Developer developer = new Developer("Alice", 5000);
        developer.giveBonus(1000);

        // Test du principe Single Responsibility
        Manager manager = new Manager("Bob", 7000);
        manager.giveBonus(1500);

        // Test du principe Liskov Substitution
        Employee employee = new Developer("Charlie", 6000);
        System.out.println(employee.getName() + " gagne " + employee.getSalary());

        // Test du principe Interface Segregation
        Developer anotherDeveloper = new Developer("Eve", 5500);
        anotherDeveloper.giveBonus(1200);

        // Test du principe Dependency Inversion
        Manager anotherManager = new Manager("David", 7500);
        anotherManager.giveBonus(2000);
    }
}