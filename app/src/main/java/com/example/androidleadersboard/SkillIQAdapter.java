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

public class SkillIQAdapter extends RecyclerView.Adapter<SkillIQAdapter.ViewHolder> {
    private List<SkillData> skillData;

    public SkillIQAdapter(List<SkillData> lData) {
        skillData = lData;
    }
    @NonNull
    @Override
    public SkillIQAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View skillView = inflater.inflate(R.layout.skilliq_row, parent, false);

        // Return a new holder instance
        SkillIQAdapter.ViewHolder viewHolder = new SkillIQAdapter.ViewHolder(skillView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SkillIQAdapter.ViewHolder holder, int position) {
        SkillData learner = skillData.get(position);

        // Set item views based on your views and data model
        TextView tvSName = holder.tvSName;
        tvSName.setText(learner.getName());
        TextView tvSInfo = holder.tvSInfo;
        tvSInfo.setText(learner.getName());
    }

    @Override
    public int getItemCount() {
        return skillData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvSName;
        public  TextView tvSInfo;

        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            tvSName = (TextView) itemView.findViewById(R.id.tvSName);
            tvSInfo = (TextView) itemView.findViewById(R.id.tvSInfo);
        }
    }
}
