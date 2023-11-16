package edu.utsa.cs3443.threaddemoapplication.controller;

import android.app.Activity;
import android.view.*;
import android.widget.*;

import edu.utsa.cs3443.threaddemoapplication.R;

public class MainController implements View.OnClickListener, Runnable {

    private Activity activity;
    private Thread thread;

    public MainController(Activity activity) {
        this.activity = activity;
        this.thread = new Thread( this );
    }

    @Override
    public void onClick(View view) {

        TextView textView = activity.findViewById(R.id.text_view);

        // take a while..
        if (view.getId() == R.id.click_button) {
            this.thread.start();
        }

        if (view.getId() == R.id.status_button) {
            textView.setText( this.thread.getState().toString() );
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
}

