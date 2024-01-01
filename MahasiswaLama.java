/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : UAS PBO
*/
package mahasiswa;
public class MahasiswaLama extends Mahasiswa {
    private final int angkatan;

    public MahasiswaLama(String nim, String nama, int umur, int angkatan) {
        super(nim, nama, umur);
        this.angkatan = angkatan;
    }

    // Getter dan Setter untuk angkatan
}
