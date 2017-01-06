package day2of100days.app.abdccassiano.com.day2of100days;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_a extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPass;
    private Button btnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        etEmail = (EditText)findViewById(R.id.etEmail);
        etPass = (EditText)findViewById(R.id.etPass);

        btnA = (Button)findViewById(R.id.btnA);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validated for empty or null value before submitting to Activity B
                String newEmail = etEmail.getText().toString();
                String newPass = etPass.getText().toString();

                boolean arroba = validEmail(newEmail);
                //Toast.makeText(getApplication(),"msg "+ arroba,Toast.LENGTH_SHORT).show();

                if ((newEmail.equals("") || newEmail.equals(null))
                        || newPass.equals("") || newPass.equals(null) || arroba == false){
                    Toast.makeText(getApplication(),"Acces Denied" + newEmail,Toast.LENGTH_SHORT).show();

                }else{

                    if (newEmail.equals("abdccassiano@hotmail.com") && newPass.equals("123")) {
                        //Toast.makeText(getApplication(),"Into!",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Activity_a.this, Activity_b.class);
                        intent.putExtra("email", newEmail);
                        intent.putExtra("pass", newPass);
                        Activity_a.this.startActivity(intent);
                    }else{
                        Toast.makeText(getApplication(),"Email/Password Incorrects!", Toast.LENGTH_SHORT).show();
                    }
                }
                //Toast.makeText(getApplication(),"contenido "+ newEmail + " "+ newPass,Toast.LENGTH_SHORT).show();
            }
        });

    }

    public static boolean validEmail(String email){

        if (email.contains("@")){
            return true;
        }else {
            return false;
        }

    }
}
