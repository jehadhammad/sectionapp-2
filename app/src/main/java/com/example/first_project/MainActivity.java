    package com.example.first_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Spinner i;
private Button btnshow;
private String msg;
private EditText edtname ;
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//hi
        // hhhhhhhhadasdhahdsahdsahddkjasdbfhjkds
        i=findViewById(R.id.spnpl);
edtname =findViewById(R.id.edtname);
btnshow=findViewById(R.id.ntmshow);
        text=findViewById(R.id.txt3);
        binedspinner();
        btnshow.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) { String name = edtname.getText().toString();
        if(!name.isEmpty()){
           msg= "welcom "+name  ;
           msg+= "      "+i.getSelectedItem().toString();

        }else
            msg="enter your name please";
    text.setText(msg);
    }
});
    }

    private void binedspinner() {
        String [] p=datapl.datap();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,p);
        i.setAdapter(adapter);
    }
}