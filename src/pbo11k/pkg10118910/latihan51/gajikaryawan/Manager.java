/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan51.gajikaryawan;
/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menghtung Gaji karyawan dengan konsep pewarisan class
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        this.tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan) {
        if (jabatan.toUpperCase().equals("MANAGER"))
            this.tunjanganJabatan = 2000000;
        else if (jabatan.toUpperCase().equals("KABAG"))
            this.tunjanganJabatan = 1000000;
        else 
            this.tunjanganJabatan = 0;
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan) {
        if (golongan == 1) 
            tunjanganGolongan = 500000;
        else if (golongan == 2)
            tunjanganGolongan = 1000000;
        else if (golongan == 3)
            tunjanganGolongan = 1500000;
        else
            tunjanganGolongan = 0;
        return tunjanganGolongan;
    }
    public float gajiTotal() {
        return tunjanganKehadiran + tunjanganGolongan + tunjanganJabatan;
    }
}
