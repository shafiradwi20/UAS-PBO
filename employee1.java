/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package employee;
public class employee1 {
    private String name;

    public employee1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("Employee " + name + " is working.");
    }
}
