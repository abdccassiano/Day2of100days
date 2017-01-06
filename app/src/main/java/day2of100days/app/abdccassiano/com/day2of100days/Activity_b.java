package day2of100days.app.abdccassiano.com.day2of100days;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity_b extends AppCompatActivity {

    private TextView tvEmail;
    private TextView tvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvPass = (TextView)findViewById(R.id.tvPass);

        Intent getIntA = getIntent();
        String getEmail = getIntA.getStringExtra("email");
        String getPass = getIntA.getStringExtra("pass");

        String newEmail = tvEmail.getText().toString();
        String newPass = tvPass.getText().toString();

        tvEmail.setText(newEmail + " " + getEmail);
        tvPass.setText(newPass + " " + getPass);

    }
}
