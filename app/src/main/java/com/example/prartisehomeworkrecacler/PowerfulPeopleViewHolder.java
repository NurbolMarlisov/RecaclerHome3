package com.example.prartisehomeworkrecacler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PowerfulPeopleViewHolder extends RecyclerView.ViewHolder {
  private   ImageView mImageView;
    private TextView name;
    private TextView date;
    public PowerfulPeopleViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.imageView);
        name = itemView.findViewById(R.id.name);
        date = itemView.findViewById(R.id.date);
    }
    public void onBind(PowerfulPerson person){
        person.setImageResours(person.getImageResours());
        name.setText(person.getName());
        date.setText(person.getBithDate());

    }
}
