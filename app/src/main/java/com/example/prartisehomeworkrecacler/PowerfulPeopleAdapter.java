package com.example.prartisehomeworkrecacler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PowerfulPeopleAdapter extends RecyclerView.Adapter<PowerfulPeopleViewHolder> {

    private List<PowerfulPerson> mPowerfulPeople;

    public PowerfulPeopleAdapter(List<PowerfulPerson> mPowerfulPeople) {
        this.mPowerfulPeople = mPowerfulPeople;
    }

    @NonNull
    @Override
    public PowerfulPeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_powerful_people,parent,false);
        return new PowerfulPeopleViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull PowerfulPeopleViewHolder holder, int position) {
        PowerfulPerson person = mPowerfulPeople.get(position);
        holder.onBind(person);

    }
    @Override
    public int getItemCount() {
        return mPowerfulPeople.size();
    }
}
