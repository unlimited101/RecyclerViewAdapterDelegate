package de.xappo.recyclerviewadapterdelegate.adapter;

/**
 * Created by knoppik on 19.10.16.
 */
public class PetFoodTip {
    private int count;
    private String text;

    public PetFoodTip(final int count, final String text) {
        this.count = count;
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
