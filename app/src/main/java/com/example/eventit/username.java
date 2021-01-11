package com.example.eventit;

import android.view.View;

public class username implements View.OnClickListener {
    private String username;

    public username(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void onClick(View v) {

    }
}
