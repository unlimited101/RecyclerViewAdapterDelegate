package de.xappo.recyclerviewadapterdelegate.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by knoppik on 19.10.16.
 */

public class NewsTipAdapter extends RecyclerView.Adapter{

    final int VIEW_TYP_NEWS_TEASER = 0;
    final int VIEW_TYP_FOOD_TIP = 1;

    NewsTeaserAdapterDelegate newsTeaserDelegate;
    PetFoodTipAdapterDelegate foodTipDelegate;

    public List items;

    public NewsTipAdapter(final Context context) {
        newsTeaserDelegate = new NewsTeaserAdapterDelegate(VIEW_TYP_NEWS_TEASER, context);
        foodTipDelegate = new PetFoodTipAdapterDelegate(VIEW_TYP_FOOD_TIP, context);
    }

    @Override public int getItemViewType(int position) {
        if (newsTeaserDelegate.isForViewType(items, position)){
            return newsTeaserDelegate.getViewType();
        }
        else if (foodTipDelegate.isForViewType(items, position)){
            return foodTipDelegate.getViewType();
        }

        throw new IllegalArgumentException("No delegate found");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (newsTeaserDelegate.getViewType() == viewType){
            return newsTeaserDelegate.onCreateViewHolder(parent);
        }
        else if (foodTipDelegate.getViewType() == viewType){
            return foodTipDelegate.onCreateViewHolder(parent);
        }

        throw new IllegalArgumentException("No delegate found");
    }


    @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        int viewType = holder.getItemViewType();
        if (newsTeaserDelegate.getViewType() == viewType){
            newsTeaserDelegate.onBindViewHolder(items, position, holder);
        }
        else if (foodTipDelegate.getViewType() == viewType){
            foodTipDelegate.onBindViewHolder(items, position, holder);
        }
    }
}