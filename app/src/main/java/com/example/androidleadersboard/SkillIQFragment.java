package com.example.androidleadersboard;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SkillIQFragment extends Fragment {
    private SkillData[] Skill = {new SkillData("skill", "R.drawable.lighthouse"), new SkillData("skill", "R.drawable.lighthouse"), new SkillData("skill", "R.drawable.lighthouse")};
    private List<SkillData> skillList = new ArrayList<>();
    private RecyclerView recyclerView;



    public SkillIQFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_skill_i_q, container, false);

        View view = inflater.inflate(R.layout.fragment_skill_i_q, container, false);
        recyclerView = view.findViewById(R.id.rvSkillIQ);
        initView();
        return view;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFruits();
    }

    private void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());//Parameter: context, number of columns
        recyclerView.setLayoutManager(layoutManager);
        SkillIQAdapter skillAdapter = new SkillIQAdapter(skillList);
        recyclerView.setAdapter(skillAdapter);
    }

    private void initFruits() {
        skillList.clear();
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int index = random.nextInt(Skill.length);
            skillList.add(Skill[index]);
        }
    }
}