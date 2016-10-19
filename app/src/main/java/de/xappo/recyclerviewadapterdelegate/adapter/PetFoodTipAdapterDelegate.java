package de.xappo.recyclerviewadapterdelegate.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import de.xappo.recyclerviewadapterdelegate.R;

/**
 * Created by knoppik on 19.10.16.
 */

public class PetFoodTipAdapterDelegate {

    private int viewType;
    private final Context context;
    private final LayoutInflater inflater;

    public PetFoodTipAdapterDelegate(int viewType, final Context context){
        this.viewType = viewType;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public int getViewType(){
        return viewType;
    }

    public boolean isForViewType(List items, int position) {
        return  items.get(position) instanceof PetFoodTip;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new PetFoodTipViewHolder(inflater.inflate(R.layout.item_pet_food, parent, false));
    }

    public void onBindViewHolder(List items, int position, RecyclerView.ViewHolder holder) {
        PetFoodTip tip = (PetFoodTip) items.get(position);
        PetFoodTipViewHolder vh = (PetFoodTipViewHolder) holder;

        vh.button.setText("" + tip.getCount());
        vh.text.setText(tip.getText());
    }
}