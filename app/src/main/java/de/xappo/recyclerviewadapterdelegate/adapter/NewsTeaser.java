package de.xappo.recyclerviewadapterdelegate.adapter;

/**
 * Created by knoppik on 19.10.16.
 */
public class NewsTeaser {
    private String title;
    private String text;

    public NewsTeaser(final String title, final String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
