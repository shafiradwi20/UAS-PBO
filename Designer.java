/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package employee;
public class Designer extends employee1 {
    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer " + getName() + " is designing.");
    }
}
    
