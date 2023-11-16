package edu.utsa.cs3443.threaddemoapplication;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.threaddemoapplication.controller.MainController;

import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect buttons to MainController
        MainController mainController = new MainController( this );
        Button click = findViewById( R.id.click_button );
        Button status = findViewById( R.id.status_button );
        click.setOnClickListener( mainController );
        status.setOnClickListener( mainController );
    }
}