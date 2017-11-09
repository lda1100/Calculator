package com.example.lda.calculator;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = new Intent();

        switch (item.getItemId()){
            case R.id.b10:
                intent.setClass(Main4Activity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.b11:
                intent.setClass(Main4Activity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.b12:
                intent.setClass(Main4Activity.this,Main3Activity.class);
                startActivity(intent);
                break;
            default:

        }
        return true;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.four,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        final EditText A1 = (EditText) findViewById(R.id.eT1);
        final EditText B1 = (EditText) findViewById(R.id.eT2);
        final EditText C1 = (EditText) findViewById(R.id.eT3);
        final EditText D1 = (EditText) findViewById(R.id.eT4);

        Button but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String a = A1.getText().toString();
                int a1 = Integer.parseInt(a);
                B1.setText(a1/10);
                C1.setText(a1/100);
                D1.setText(a1/1000);

            }

        });

        Button but2 = (Button) findViewById(R.id.but2);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String b = B1.getText().toString();
                int b1 = Integer.parseInt(b);
                A1.setText(b1*10);
                C1.setText(b1/10);
                D1.setText(b1/100);
            }

        });

        Button but3 = (Button) findViewById(R.id.but3);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String c = C1.getText().toString();
                int c1 = Integer.parseInt(c);
                A1.setText(c1*100);
                B1.setText(c1*10);
                D1.setText(c1/1000);
                String d = A1.getText().toString();
                int d1 = Integer.parseInt(d);
                A1.setText(d1*1000);
                B1.setText(d1*100);
                C1.setText(d1*10);
            }

        });
        Button but4 = (Button) findViewById(R.id.but4);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String d = D1.getText().toString();
                int d1 = Integer.parseInt(d);
                A1.setText(d1*1000);
                B1.setText(d1*100);
                C1.setText(d1*10);
            }

        });



        Button but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final TextView A = (TextView) findViewById(R.id.T1);
                final TextView B = (TextView) findViewById(R.id.T2);
                final TextView C = (TextView) findViewById(R.id.T3);
                final TextView D = (TextView) findViewById(R.id.T4);
                A.setText("cm^2");
                B.setText("dm^2");
                C.setText("m^2");
                D.setText("km^2");

                final EditText A1 = (EditText) findViewById(R.id.eT1);
                final EditText B1 = (EditText) findViewById(R.id.eT2);
                final EditText C1 = (EditText) findViewById(R.id.eT3);
                final EditText D1 = (EditText) findViewById(R.id.eT4);

                Button but1 = (Button) findViewById(R.id.but1);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String a = A1.getText().toString();
                        int a1 = Integer.parseInt(a);
                        B1.setText(a1/100);
                        C1.setText(a1/10000);
                        D1.setText(a1/1000000);

                    }

                });

                Button but2 = (Button) findViewById(R.id.but2);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String b = B1.getText().toString();
                        int b1 = Integer.parseInt(b);
                        A1.setText(b1*100);
                        C1.setText(b1/100);
                        D1.setText(b1/10000);
                    }

                });

                Button but3 = (Button) findViewById(R.id.but3);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String c = C1.getText().toString();
                        int c1 = Integer.parseInt(c);
                        A1.setText(c1*10000);
                        B1.setText(c1*100);
                        D1.setText(c1/100);

                    }

                });
                Button but4 = (Button) findViewById(R.id.but4);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String d = D1.getText().toString();
                        int d1 = Integer.parseInt(d);
                        A1.setText(d1*1000000);
                        B1.setText(d1*10000);
                        C1.setText(d1*100);
                    }

                });
            }
        });


        Button but6 = (Button) findViewById(R.id.but6);
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final TextView A = (TextView) findViewById(R.id.T1);
                final TextView B = (TextView) findViewById(R.id.T2);
                final TextView C = (TextView) findViewById(R.id.T3);
                final TextView D = (TextView) findViewById(R.id.T4);
                A.setText("cm^3");
                B.setText("dm^3");
                C.setText("m^3");
                D.setText("km^3");

                final EditText A1 = (EditText) findViewById(R.id.eT1);
                final EditText B1 = (EditText) findViewById(R.id.eT2);
                final EditText C1 = (EditText) findViewById(R.id.eT3);
                final EditText D1 = (EditText) findViewById(R.id.eT4);

                Button but1 = (Button) findViewById(R.id.but1);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String a = A1.getText().toString();
                        int a1 = Integer.parseInt(a);
                        B1.setText(a1/1000);
                        C1.setText(a1/1000000);
                        D1.setText(a1/1000000000);

                    }

                });

                Button but2 = (Button) findViewById(R.id.but2);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String b = B1.getText().toString();
                        int b1 = Integer.parseInt(b);
                        A1.setText(b1*1000);
                        C1.setText(b1/1000);
                        D1.setText(b1/1000000);
                    }

                });

                Button but3 = (Button) findViewById(R.id.but3);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String c = C1.getText().toString();
                        int c1 = Integer.parseInt(c);
                        A1.setText(c1*1000000);
                        B1.setText(c1*1000);
                        D1.setText(c1/1000);

                    }

                });
                Button but4 = (Button) findViewById(R.id.but4);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String d = D1.getText().toString();
                        int d1 = Integer.parseInt(d);
                        A1.setText(d1*1000000000);
                        B1.setText(d1*1000000);
                        C1.setText(d1*1000);
                    }

                });
            }
        });

        Button but7 = (Button) findViewById(R.id.but7);
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final TextView A = (TextView) findViewById(R.id.T1);
                final TextView B = (TextView) findViewById(R.id.T2);
                final TextView C = (TextView) findViewById(R.id.T3);
                final TextView D = (TextView) findViewById(R.id.T4);
                A.setText("g");
                B.setText("kg");
                C.setText("t");
                D.setText("oz");

                final EditText A1 = (EditText) findViewById(R.id.eT1);
                final EditText B1 = (EditText) findViewById(R.id.eT2);
                final EditText C1 = (EditText) findViewById(R.id.eT3);
                final EditText D1 = (EditText) findViewById(R.id.eT4);

                Button but1 = (Button) findViewById(R.id.but1);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String a = A1.getText().toString();
                        int a1 = Integer.parseInt(a);
                        B1.setText(a1/1000);
                        C1.setText(a1/1000000);
                        D1.setText(String.valueOf(a1*28.3495231));

                    }

                });

                Button but2 = (Button) findViewById(R.id.but2);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String b = B1.getText().toString();
                        int b1 = Integer.parseInt(b);
                        A1.setText(b1*1000);
                        C1.setText(b1/1000);
                        D1.setText(String.valueOf(b1*28.3495231));
                    }

                });

                Button but3 = (Button) findViewById(R.id.but3);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String c = C1.getText().toString();
                        int c1 = Integer.parseInt(c);
                        A1.setText(c1*1000000);
                        B1.setText(c1*1000);
                        D1.setText(String.valueOf(c1*28.3495231));

                    }

                });
                Button but4 = (Button) findViewById(R.id.but4);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String d = D1.getText().toString();

                        int d1 = Integer.parseInt(d);
                        A1.setText(String.valueOf(d1*0.035274));
                        B1.setText(String.valueOf(d1*35.2739619));
                        C1.setText(String.valueOf(d1*35273.9619496));
                    }

                });
            }
        });

        Button but8 = (Button) findViewById(R.id.but8);
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final TextView A = (TextView) findViewById(R.id.T1);
                final TextView B = (TextView) findViewById(R.id.T2);
                final TextView C = (TextView) findViewById(R.id.T3);
                final TextView D = (TextView) findViewById(R.id.T4);
                A.setText("s");
                B.setText("min");
                C.setText("hour");
                D.setText("day");

                final EditText A1 = (EditText) findViewById(R.id.eT1);
                final EditText B1 = (EditText) findViewById(R.id.eT2);
                final EditText C1 = (EditText) findViewById(R.id.eT3);
                final EditText D1 = (EditText) findViewById(R.id.eT4);

                Button but1 = (Button) findViewById(R.id.but1);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String a = A1.getText().toString();
                        int a1 = Integer.parseInt(a);
                        B1.setText(a1/60);
                        C1.setText(a1/3600);
                        D1.setText(a1/86400);

                    }

                });

                Button but2 = (Button) findViewById(R.id.but2);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String b = B1.getText().toString();
                        int b1 = Integer.parseInt(b);
                        A1.setText(b1*60);
                        C1.setText(b1/60);
                        D1.setText(b1/1440);
                    }

                });

                Button but3 = (Button) findViewById(R.id.but3);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String c = C1.getText().toString();
                        int c1 = Integer.parseInt(c);
                        A1.setText(c1*3600);
                        B1.setText(c1*60);
                        D1.setText(c1/24);

                    }

                });
                Button but4 = (Button) findViewById(R.id.but4);
                but1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        String d = D1.getText().toString();
                        int d1 = Integer.parseInt(d);
                        A1.setText(d1*86400);
                        B1.setText(d1*1440);
                        C1.setText(d1*24);
                    }

                });
            }
        });
        Button but9 = (Button) findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final TextView A = (TextView) findViewById(R.id.T1);
                final TextView B = (TextView) findViewById(R.id.T2);
                final TextView C = (TextView) findViewById(R.id.T3);
                final TextView D = (TextView) findViewById(R.id.T4);
                A.setText("");
                B.setText("");
                C.setText("");
                D.setText("");
            }

        });


    }

}





