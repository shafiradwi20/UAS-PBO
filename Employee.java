/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package employee;
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("Employee " + name + " is working.");
    }

    public static void main(String[] args) {
        // Contoh penggunaan Employee di dalam metode main
        Employee employee = new Employee("John");
        employee.work();
    }
}

