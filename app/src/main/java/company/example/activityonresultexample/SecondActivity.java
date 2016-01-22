package company.example.activityonresultexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("name");
        Toast.makeText(this,id+" "+name,Toast.LENGTH_LONG).show();
        callFirstActivity();
    }

    private void callFirstActivity() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result","This is a message second activity");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
