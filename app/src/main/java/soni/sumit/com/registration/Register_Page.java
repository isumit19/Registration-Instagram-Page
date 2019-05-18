package soni.sumit.com.registration;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telecom.Call;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register_Page extends AppCompatActivity {

    EditText username,email,password;
    Button register;
    TextView old_user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);

        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        register=findViewById(R.id.Register);
        old_user=findViewById(R.id.old_user);

        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(username.getText().toString().trim().length()>0 && password.getText().toString().trim().length()>0 && email.getText().toString().trim().length()>0)
                {
                    register.setBackgroundColor(getResources().getColor(R.color.active));
                }
                else{
                    register.setBackgroundColor(getResources().getColor(R.color.light_blue));
                }

            }
        };

        password.addTextChangedListener(watcher);
        username.addTextChangedListener(watcher);
        email.addTextChangedListener(watcher);

        old_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register_Page.this.finish();
                Register_Page.this.overridePendingTransition(0,0);
            }
        });





    }
}
