package com.example.eccomerce.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eccomerce.Interface.ItemClickListner;
import com.example.eccomerce.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtproductName, txtproductDescription, txtproductPrice;
    public ImageView imageView;
    public ItemClickListner listner;



    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=(ImageView) itemView.findViewById(R.id.product_image);
        txtproductName=(TextView) itemView.findViewById(R.id.product_name);
        txtproductDescription=(TextView)itemView.findViewById(R.id.product_description);
        txtproductPrice=(TextView)itemView.findViewById(R.id.product_price);
    }


    public void  setItemClickListner(ItemClickListner listner)
    {
        this.listner=listner;
    }

    @Override
    public void onClick(View view){
        listner.onClick(view, getAdapterPosition(),false);
    }
}
