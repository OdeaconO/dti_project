package com.example.pointsbin;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LeaderBoardFragment extends Fragment {

    private TextView totalUsersTV, myImgTextTV, myScoreTV, myRankTV;
    private RecyclerView usersView;

    public LeaderBoardFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_leader_board,container,false);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("LeaderBoard");

        initViews(view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        usersView.setLayoutManager(layoutManager);

        totalUsersTV.setText("Total Users : " );

        return view;
    }


    private void initViews(View view){
        totalUsersTV = view.findViewById(R.id.total_users);
        myImgTextTV = view.findViewById(R.id.img_text);
        myScoreTV = view.findViewById(R.id.total_score);
        myRankTV = view.findViewById(R.id.rank);
        usersView = view.findViewById(R.id.users_view);
    }
}
