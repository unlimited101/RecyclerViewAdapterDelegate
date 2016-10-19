package de.xappo.recyclerviewadapterdelegate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import de.xappo.recyclerviewadapterdelegate.R;

/**
 * Created by knoppik on 19.10.16.
 */
public class PetFoodTipViewHolder extends RecyclerView.ViewHolder {

    Button button;
    TextView text;

    public PetFoodTipViewHolder(final View inflate) {
        super(inflate);

        button = (Button) inflate.findViewById(R.id.button);
        text = (TextView) inflate.findViewById(R.id.tv_text);

    }
}
