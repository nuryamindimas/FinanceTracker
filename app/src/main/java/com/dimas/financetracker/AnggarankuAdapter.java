package com.dimas.financetracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnggarankuAdapter extends RecyclerView.Adapter<AnggarankuAdapter.AnggarankuViewHolder> {
    private Context context;
    private ArrayList<Anggaranku> listAnggaran;

    AnggarankuAdapter(Context context){this.context=context;}

    void setListAnggaran(ArrayList<Anggaranku> list){
        this.listAnggaran=list;
    }

    private ArrayList<Anggaranku> getListAnggaran(){ return listAnggaran;}

    @NonNull
    @Override
    public AnggarankuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anggaranku_list, parent, false);
        return new AnggarankuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnggarankuViewHolder holder, int position) {
        holder.tvHari.setText(getListAnggaran().get(position).getHari());
        holder.tvTanggal.setText(getListAnggaran().get(position).getTanggal());
        holder.tvPendapatan.setText(String.valueOf(getListAnggaran().get(position).getPendapatan()));
        holder.tvPengeluaran.setText(String.valueOf(getListAnggaran().get(position).getPengeluaran()));
    }

    @Override
    public int getItemCount() {
        return listAnggaran.size();
    }

    public class AnggarankuViewHolder extends RecyclerView.ViewHolder {
        TextView tvHari, tvTanggal, tvPendapatan, tvPengeluaran;
        public AnggarankuViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHari=itemView.findViewById(R.id.tv_hari);
            tvTanggal=itemView.findViewById(R.id.tv_tanggal);
            tvPendapatan=itemView.findViewById(R.id.tv_pendapatan);
            tvPengeluaran=itemView.findViewById(R.id.tv_pengeluaran);
        }
    }
}
