package co.youngdeveloper.probability;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String n_value = intent.getStringExtra(MainActivity.N_MESSAGE);
        String m_value = intent.getStringExtra(MainActivity.M_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.textView);

        int n_int = Integer.parseInt(n_value);
        int m_int = Integer.parseInt(m_value);

        long res = 1;

        if(n_int>=m_int)
        {
            res=getFact(n_int)/getFact(n_int-m_int);
            textView.setText(String.valueOf(res));
        }
        else System.out.println("m cannot be greater than n");

    }

    public static long getFact(int n) {
        long f=1;

        for(int i=n; i>=1; i--)
            f *= i;

        return f;
    }
}
