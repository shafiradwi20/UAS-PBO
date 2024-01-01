/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package employee;
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John");
        Developer developer = new Developer("Alice");
        Designer designer = new Designer("Bob");

        manager.work();
        developer.work();
        designer.work();
    }
}

