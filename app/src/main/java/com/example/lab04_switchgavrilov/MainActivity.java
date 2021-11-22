package com.example.lab04_switchgavrilov;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

//393 Gavrilov Switch
public class MainActivity extends AppCompatActivity
{
    CheckBox chk[] = new CheckBox[4];
    EditText amount[] = new EditText[4];
    EditText price[] = new EditText[4];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk[0] = findViewById(R.id.chb_Apple);
        chk[1] = findViewById(R.id.chb_Carrot);
        chk[2] = findViewById(R.id.chb_Tomato);
        chk[3] = findViewById(R.id.chb_Potato);

        amount[0] = findViewById(R.id.apple_Amount);
        amount[1] = findViewById(R.id.carrot_Amount);
        amount[2] = findViewById(R.id.tomato_Amount);
        amount[3] = findViewById(R.id.potato_Amount);

        price[0] = findViewById(R.id.apple_Price);
        price[1] = findViewById(R.id.carrot_Price);
        price[2] = findViewById(R.id.tomato_Price);
        price[3] = findViewById(R.id.potato_Price);
    }

    public void onButton_Click(View v)
    {
        int count = 0;
        float sum = 0, cost = 0;
        String s = "";

        for (int i = 0; i < 4; i++)
        {
            if (chk[i].isChecked())
            {
                try
                {
                    count = Integer.parseInt(amount[i].getText().toString());
                    cost = Integer.parseInt(price[i].getText().toString());
                }
                catch (Exception ex)
                {
                    Toast.makeText(this, String.format("Empty or incorrect values in %s", chk[i].getText().toString()), Toast.LENGTH_SHORT);
                    return;
                }
                s += chk[i].getText().toString() + "Cost = " + cost + "/n";
                sum += count * cost;
            }
        }

        Toast.makeText(this, s, Toast.LENGTH_SHORT);
    }

    public void onCheckBox_Click(View v)
    {
        switch (v.getTag().toString())
        {
            case "1":
                if (chk[0].isChecked())
                {
                    amount[0].setVisibility(View.INVISIBLE);
                    price[0].setVisibility(View.INVISIBLE);
                }
                else
                {
                    amount[0].setVisibility(View.VISIBLE);
                    price[0].setVisibility(View.VISIBLE);
                }
                break;
            case "2":
                if (chk[1].isChecked())
                {
                    amount[1].setVisibility(View.INVISIBLE);
                    price[1].setVisibility(View.INVISIBLE);
                }
                else
                {
                    amount[1].setVisibility(View.VISIBLE);
                    price[1].setVisibility(View.VISIBLE);
                }
                break;
            case "3":
                if (chk[2].isChecked())
                {
                    amount[2].setVisibility(View.INVISIBLE);
                    price[2].setVisibility(View.INVISIBLE);
                }
                else
                {
                    amount[2].setVisibility(View.VISIBLE);
                    price[2].setVisibility(View.VISIBLE);
                }
                break;
            case "4":
                if (chk[3].isChecked())
                {
                    amount[3].setVisibility(View.INVISIBLE);
                    price[3].setVisibility(View.INVISIBLE);
                }
                else
                {
                    amount[3].setVisibility(View.VISIBLE);
                    price[3].setVisibility(View.VISIBLE);
                }
                break;
        }
    }
}