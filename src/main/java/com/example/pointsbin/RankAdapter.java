package com.example.pointsbin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RankAdapter extends RecyclerView.Adapter<RankAdapter.ViewHolder> {

    private List<RankModel>userList;


    @NonNull
    @Override
    public RankAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rank_item_layout,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name = userList.get(position).getName();
        int score = userList.get(position).getScore();
        int rank = userList.get(position).getRank();

        holder.setData(name,score,rank);


    }

    @Override
    public int getItemCount() {

        if(userList.size()>10){
            return 10;
        }
        else{
            return userList.size();
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTV,rankTV,scoreTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.name);
            rankTV = itemView.findViewById(R.id.rank);
            scoreTV = itemView.findViewById(R.id.score);

        }
        private void setData(String name, int score, int rank){
            nameTV.setText(name);
            scoreTV.setText("Score : " + score);
            rankTV.setText("Rank : "  + rank);


        }
    }
}
