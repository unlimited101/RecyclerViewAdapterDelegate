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

public class NewsTeaserAdapterDelegate {

    private int viewType;
    private final Context context;
    private final LayoutInflater inflater;

    public NewsTeaserAdapterDelegate(int viewType, final Context context){
        this.viewType = viewType;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public int getViewType(){
        return viewType;
    }

    public boolean isForViewType(List items, int position) {
        return  items.get(position) instanceof NewsTeaser;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new NewsTeaserViewHolder(inflater.inflate(R.layout.item_news_teaser, parent, false));
    }

    public void onBindViewHolder(List items, int position, RecyclerView.ViewHolder holder) {
        NewsTeaser teaser = (NewsTeaser) items.get(position);
        NewsTeaserViewHolder vh = (NewsTeaserViewHolder) holder;

        vh.title.setText(teaser.getTitle());
        vh.text.setText(teaser.getText());
    }
}