package com.example.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView cantante, nacionalidad;
        ImageView fotoCantante;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cantante = (TextView) itemView.findViewById(R.id.tvCantante);
            nacionalidad = (TextView) itemView.findViewById(R.id.tvNacionalidad);
            fotoCantante = (ImageView) itemView.findViewById(R.id.imgCantante);
        }
    }

    public List<Cantante> cantantelista;

    public RecyclerViewAdapter(List<Cantante> cantantelista) {
        this.cantantelista = cantantelista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cantante,parent,false);
        ViewHolder viewHolder  = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cantante.setText(cantantelista.get(position).getCantante());
        holder.nacionalidad.setText(cantantelista.get(position).getNacionalidad());
        holder.fotoCantante.setImageResource(cantantelista.get(position).getImgCantante());
    }

    @Override
    public int getItemCount() {
        return cantantelista.size();
    }
}
