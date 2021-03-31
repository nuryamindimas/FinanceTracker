package com.dimas.financetracker;

import android.os.Parcel;
import android.os.Parcelable;

public class Anggaranku implements Parcelable {
    private String hari;
    private String tanggal;
    private int pendapatan;
    private int pengeluaran;

    protected Anggaranku(Parcel in) {
        hari = in.readString();
        tanggal = in.readString();
        pendapatan = in.readInt();
        pengeluaran = in.readInt();
    }

    public Anggaranku(){

    }

    String getHari() { return hari; }

    void setHari(String hari) { this.hari = hari; }

    String getTanggal() { return tanggal; }

    void setTanggal(String tanggal) { this.tanggal = tanggal; }

    int getPendapatan() { return pendapatan; }

    void setPendapatan(int pendapatan) { this.pendapatan = pendapatan; }

    int getPengeluaran() { return pengeluaran; }

    void setPengeluaran(int pengeluaran) { this.pengeluaran = pengeluaran; }

    public static final Creator<Anggaranku> CREATOR = new Creator<Anggaranku>() {
        @Override
        public Anggaranku createFromParcel(Parcel in) {
            return new Anggaranku(in);
        }

        @Override
        public Anggaranku[] newArray(int size) {
            return new Anggaranku[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(hari);
        dest.writeString(tanggal);
        dest.writeInt(pendapatan);
        dest.writeInt(pengeluaran);
    }
}
