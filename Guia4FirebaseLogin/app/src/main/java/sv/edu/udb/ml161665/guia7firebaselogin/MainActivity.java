package sv.edu.udb.ml161665.guia7firebaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SignUp(View v)
    {
        Intent open = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(open);
    }

    public void Login(View v)
    {
        Intent open = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(open);
    }
}