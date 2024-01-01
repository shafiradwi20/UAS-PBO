/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package employee;
public class Developer extends employee1 {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding.");
    }
}
