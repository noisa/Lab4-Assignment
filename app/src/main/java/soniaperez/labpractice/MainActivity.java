package soniaperez.labpractice;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Access TextView defined in layout XML
        //and set its test
        mainTextView=(TextView) findViewById(R.id.main_textview);
        mainTextView.setText(":)");


        //Access the Button defined in layout XML
        mainButton=(Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);

        //Access the EditText
        mainEditText=(EditText) findViewById(R.id.main_edittext);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        mainTextView.setText(mainEditText.getText().toString() + " is trying to pass this class.");
    }
}
