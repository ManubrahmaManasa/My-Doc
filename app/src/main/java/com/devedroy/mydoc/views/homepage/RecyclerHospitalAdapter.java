package com.devedroy.mydoc.views.homepage;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devedroy.mydoc.R;
import com.devedroy.mydoc.data.local.Hospital;
import com.devedroy.mydoc.databinding.ItemViewHospitalBinding;

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
        ItemViewHospitalBinding binding = ItemViewHospitalBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHospitalAdapter.ViewHolder holder, int position) {
        holder.bind(mDemoData.get(position));
    }

    @Override
    public int getItemCount() {
        return mDemoData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemViewHospitalBinding binding;

        public ViewHolder(ItemViewHospitalBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Hospital hospital) {
            binding.tvHospital.setText(hospital.getName());
            binding.tvLocation.setText(hospital.getAddress());
            String rating = String.valueOf(hospital.getRating());
            binding.tvRating.setText(rating);
            binding.getRoot().setOnClickListener(view -> {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog_layout);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                TextView test = dialog.findViewById(R.id.dialog_text);
                test.setOnClickListener(view1 -> {
                    Toast.makeText(context, "clicked on dialog text view", Toast.LENGTH_SHORT).show();
                });
                dialog.show();
            });
        }
    }
}
