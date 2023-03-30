package com.devedroy.mydoc.views.homepage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devedroy.mydoc.R;
import com.devedroy.mydoc.data.local.Hospital;

import java.util.ArrayList;
import java.util.List;

public class RecyclerHospitalAdapter extends RecyclerView.Adapter<RecyclerHospitalAdapter.ViewHolder> {
    List<Hospital> mDemoData;
    Context context;

    public RecyclerHospitalAdapter(Context context, List<Hospital> myListData) {
        this.mDemoData = myListData;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerHospitalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View myView = inflater.inflate(R.layout.item_view_hsptl, parent, false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHospitalAdapter.ViewHolder holder, int position) {
        holder.nameTextView.setText(mDemoData.get(position).getName());
        holder.nameloc.setText(mDemoData.get(position).getAddress());
        String rating = String.valueOf(mDemoData.get(position).getRating());
        holder.rating.setText(rating);
    }

    @Override
    public int getItemCount() {
        return mDemoData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView, nameloc;
        public TextView rating;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.tvHospital);
            nameloc = itemView.findViewById(R.id.Location);
            rating = itemView.findViewById(R.id.Rating);
        }
    }
}
