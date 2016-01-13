package com.siziksu.build_variants.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.siziksu.build_variants.Injection;
import com.siziksu.build_variants.R;
import com.siziksu.build_variants.data.Repository;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Repository repository = Injection.provideRepository();
        ((TextView) findViewById(R.id.textInjected)).setText(repository.getText());
    }
}
