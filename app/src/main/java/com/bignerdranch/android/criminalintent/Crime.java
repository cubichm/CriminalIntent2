package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Hp on 9/28/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId=UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}