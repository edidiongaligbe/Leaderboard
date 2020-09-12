package com.example.androidleadersboard;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class LearnersFragment extends Fragment {
    private LearnersData[] Learner = {new LearnersData("apple", "R.drawable.lighthouse"), new LearnersData("banana", "R.drawable.lighthouse"), new LearnersData("mango", "R.drawable.lighthouse")};
    private List<LearnersData> learnersList = new ArrayList<>();
    private RecyclerView recyclerView;


    public LearnersFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_learners, container, false);

        View view = inflater.inflate(R.layout.fragment_learners, container, false);
        recyclerView = view.findViewById(R.id.rvLearners);
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
        LearnersAdapter learnersAdapter = new LearnersAdapter(learnersList);
        recyclerView.setAdapter(learnersAdapter);
    }

    private void initFruits() {
        learnersList.clear();
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int index = random.nextInt(Learner.length);
            learnersList.add(Learner[index]);
        }
    }
}