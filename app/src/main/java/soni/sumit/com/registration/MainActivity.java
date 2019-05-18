package soni.sumit.com.registration;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;
    TextView new_user;

    Activity main=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        new_user=findViewById(R.id.new_reg);



        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(username.getText().toString().trim().length()>0 && password.getText().toString().trim().length()>0)
                {
                    login.setBackgroundColor(getResources().getColor(R.color.active));
                }
                else{
                    login.setBackgroundColor(getResources().getColor(R.color.light_blue));
                }

            }
        };

        password.addTextChangedListener(watcher);
        username.addTextChangedListener(watcher);

        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Register_Page.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                //startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(main).toBundle());
            }
        });

    }
}
