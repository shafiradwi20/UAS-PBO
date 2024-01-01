/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package employee;
public class Manager extends employee1 {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing the team.");
    }
}
