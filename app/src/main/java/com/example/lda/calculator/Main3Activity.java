package com.example.lda.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main3Activity extends AppCompatActivity {




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = new Intent();

        switch (item.getItemId()){
            case R.id.b5:
                intent.setClass(Main3Activity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.b6:
                intent.setClass(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.b9:
                intent.setClass(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
                break;
            default:

        }
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.three,menu);
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final EditText A = (EditText) findViewById(R.id.eT1);
                final EditText B = (EditText) findViewById(R.id.eT2);
                final EditText C = (EditText) findViewById(R.id.eT3);
                final EditText D = (EditText) findViewById(R.id.eT4);

                //二进制->八进制
                String a = A.getText().toString();
                String  a1;
                a = Integer.valueOf(a,2).toString();
                int a2 = Integer.parseInt(a);
                a1 = Integer.toOctalString(a2);
                B.setText(a1);
                //二进制->十进制
                String b = A.getText().toString();
                String b1;
                b1 = Integer.valueOf(b,2).toString();
                C.setText(b1);
                //二进制->十六进制
                String c = A.getText().toString();
                String  c1;
                c = Integer.valueOf(c,2).toString();
                int c2 = Integer.parseInt(c);
                c1 = Integer.toHexString(c2);
                D.setText(c1);


            }

        });
        Button but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final EditText A = (EditText) findViewById(R.id.eT1);
                final EditText B = (EditText) findViewById(R.id.eT2);
                final EditText C = (EditText) findViewById(R.id.eT3);
                final EditText D = (EditText) findViewById(R.id.eT4);

                //八进制->二进制
                String a = B.getText().toString();
                String  a1;
                a = Integer.valueOf(a,8).toString();
                int a2 = Integer.parseInt(a);
                a1 = Integer.toBinaryString(a2);
                A.setText(a1);
                //八进制->十进制
                String b = B.getText().toString();
                String b1;
                b1 = Integer.valueOf(b,8).toString();
                C.setText(b1);
                //八进制->十六进制
                String c = B.getText().toString();
                String  c1;
                c = Integer.valueOf(c,8).toString();
                int c2 = Integer.parseInt(c);
                c1 = Integer.toHexString(c2);
                D.setText(c1);


            }

        });
        Button but3 = (Button) findViewById(R.id.but3);
        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final EditText A = (EditText) findViewById(R.id.eT1);
                final EditText B = (EditText) findViewById(R.id.eT2);
                final EditText C = (EditText) findViewById(R.id.eT3);
                final EditText D = (EditText) findViewById(R.id.eT4);

                //十进制->二进制
                String a = C.getText().toString();
                String  a1;
                int a2 = Integer.parseInt(a);
                a1 = Integer.toBinaryString(a2);
                A.setText(a1);
                //十进制->八进制
                String b = C.getText().toString();
                String b1;
                int b2 = Integer.parseInt(a);
                b1 = Integer.toOctalString(b2);
                B.setText(b1);
                //十进制->十六进制
                String c = C.getText().toString();
                String  c1;
                int c2 = Integer.parseInt(c);
                c1 = Integer.toHexString(c2);
                D.setText(c1);

            }

        });
        Button but4 = (Button) findViewById(R.id.but4);
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final EditText A = (EditText) findViewById(R.id.eT1);
                final EditText B = (EditText) findViewById(R.id.eT2);
                final EditText C = (EditText) findViewById(R.id.eT3);
                final EditText D = (EditText) findViewById(R.id.eT4);

                //十六进制->二进制
                String a = B.getText().toString();
                String  a1;
                a = Integer.valueOf(a,16).toString();
                int a2 = Integer.parseInt(a);
                a1 = Integer.toBinaryString(a2);
                A.setText(a1);
                //十六进制->八进制
                String b = B.getText().toString();
                String b1;
                b = Integer.valueOf(b,16).toString();
                int b2  = Integer.parseInt(b);
                b1 = Integer.toOctalString(b2);
                B.setText(b1);
                //十六进制->十进制
                String c = B.getText().toString();
                String c1;
                c1 = Integer.valueOf(c,8).toString();
                C.setText(c1);

            }

        });

        Button but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final EditText A = (EditText) findViewById(R.id.eT1);
                final EditText B = (EditText) findViewById(R.id.eT2);
                final EditText C = (EditText) findViewById(R.id.eT3);
                final EditText D = (EditText) findViewById(R.id.eT4);
                A.setText("");
                B.setText("");
                C.setText("");
                D.setText("");
            }

        });







    }

}

