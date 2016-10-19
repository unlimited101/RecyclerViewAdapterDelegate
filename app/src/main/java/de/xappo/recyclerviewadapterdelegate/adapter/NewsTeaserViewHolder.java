package de.xappo.recyclerviewadapterdelegate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import de.xappo.recyclerviewadapterdelegate.R;

/**
 * Created by knoppik on 19.10.16.
 */
public class NewsTeaserViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView text;

    public NewsTeaserViewHolder(final View inflate) {
        super(inflate);
        title = (TextView) inflate.findViewById(R.id.tv_title);
        text = (TextView) inflate.findViewById(R.id.tv_text);

    }
}
