package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Manusia mns;

        Mahasiswa mhs = new Mahasiswa();
        mns = mhs;
        mns.setNama("Mamonaka Alyssa");
        System.out.println(mns.getNama());

        Karyawan kar = new Karyawan();
        mns = kar;
        mns.setNama("Miyama Kaito");
        System.out.println(mns.getNama());

    }
}
