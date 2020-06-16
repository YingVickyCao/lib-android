package com.hades.example.java.lib;

import android.os.Parcel;

import java.io.Serializable;

/**
 * A dummy item representing a piece of content.
 */
public class DummyItem implements Serializable {
    public final int id;
    public final String colo2;
    public final int col3;

    public DummyItem(int _id, String content, int details) {
        this.id = _id;
        this.colo2 = content;
        this.col3 = details;
    }

    protected DummyItem(Parcel in) {
        id = in.readInt();
        colo2 = in.readString();
        col3 = in.readInt();
    }

    public int getId() {
        return id;
    }

    public String getColo2() {
        return colo2;
    }

    public int getCol3() {
        return col3;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", colo2='" + colo2 + '\'' +
                ", col3='" + col3 + '\'' +
                '}';
    }
}
