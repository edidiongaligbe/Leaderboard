package com.example.androidleadersboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LearnersAdapter extends RecyclerView.Adapter<LearnersAdapter.ViewHolder> {

    private List<LearnersData> learnersData;

    // Pass in the contact array into the constructor
    public LearnersAdapter(List<LearnersData> lData) {
        learnersData = lData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View learnersView = inflater.inflate(R.layout.learners_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(learnersView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(LearnersAdapter.ViewHolder holder, int position) {
        LearnersData learner = learnersData.get(position);

        // Set item views based on your views and data model
        TextView tvName = holder.tvName;
        tvName.setText(learner.getName());
        TextView tvInfo = holder.tvInfo;
        tvInfo.setText(learner.getName());
    }

    @Override
    public int getItemCount() {
        return learnersData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvName;
        public  TextView tvInfo;

        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tvLName);
            tvInfo = (TextView) itemView.findViewById(R.id.tvLInfo);
        }
    }
}
