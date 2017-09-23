package co.youngdeveloper.probability;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String N_MESSAGE = "com.example.myfirstapp.N_MESSAGE";
    public static final String M_MESSAGE = "com.example.myfirstapp.M_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText value_of_n = (EditText) findViewById(R.id.editValueOfN);
        EditText value_of_m = (EditText) findViewById(R.id.editValueOfM);
        String n_message = value_of_n.getText().toString();
        String m_message = value_of_m.getText().toString();

        intent.putExtra(N_MESSAGE, n_message);
        intent.putExtra(M_MESSAGE, m_message);
        startActivity(intent);
    }

    public void openCalculator(View view) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }

}
