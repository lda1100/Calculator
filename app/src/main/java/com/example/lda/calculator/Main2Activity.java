package com.example.lda.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener{



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       Intent intent = new Intent();

        switch (item.getItemId()){
            case R.id.b4:
                intent.setClass(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                break;
             case R.id.b3:
                intent.setClass(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.b8:
                intent.setClass(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
                break;
            default:

        }
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second,menu);
        return true;
    }


    Button bt0,
            bt1,
            bt2,
            bt3,
            bt4,
            bt5,
            bt6,
            bt7,
            bt8,
            bt9,
            btpt;
    Button btsin,
            bttan,
            btcos,
            btnpow2,
            btnpow3;

    Button btclr,
            btdel,
            bteq;
    EditText etinput;


    boolean clrflag;    //判断et中是否清空


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main2);
        bt0= (Button) findViewById(R.id.bt0);
        bt1= (Button) findViewById(R.id.bt1);
        bt2= (Button) findViewById(R.id.bt2);
        bt3= (Button) findViewById(R.id.bt3);
        bt4= (Button) findViewById(R.id.bt4);
        bt5= (Button) findViewById(R.id.bt5);
        bt6= (Button) findViewById(R.id.bt6);
        bt7= (Button) findViewById(R.id.bt7);
        bt8= (Button) findViewById(R.id.bt8);
        bt9= (Button) findViewById(R.id.bt9);
        btpt= (Button) findViewById(R.id.btpt);
        bttan= (Button) findViewById(R.id.tan);
        btcos= (Button) findViewById(R.id.cos);
        btsin= (Button) findViewById(R.id.sin);
        btnpow2= (Button) findViewById(R.id.pow2);
        btnpow3= (Button) findViewById(R.id.pow3);
        btclr= (Button) findViewById(R.id.clr);
        btdel= (Button) findViewById(R.id.del);
        bteq= (Button) findViewById(R.id.eq);
        etinput= (EditText) findViewById(R.id.etinput);


        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btpt.setOnClickListener(this);
        bttan.setOnClickListener(this);
        btcos.setOnClickListener(this);
        btsin.setOnClickListener(this);
        btnpow2.setOnClickListener(this);
        btnpow3.setOnClickListener(this);
        btclr.setOnClickListener(this);
        btdel.setOnClickListener(this);
        bteq.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String str=etinput.getText().toString();
        switch (v.getId()){

            case   R.id.bt0:
            case   R.id.bt1:
            case   R.id.bt2:
            case   R.id.bt3:
            case   R.id.bt4:
            case   R.id.bt5:
            case   R.id.bt6:
            case   R.id.bt7:
            case   R.id.bt8:
            case   R.id.bt9:
            case   R.id.btpt:
                if(clrflag){
                    clrflag=false;
                    str="";
                    etinput.setText("");
                }
                etinput.setText(str+((Button)v).getText());
                break;



            case R.id.tan:
            case R.id.cos:
            case R.id.sin:
            case R.id.pow2:
            case R.id.pow3:
                if(clrflag){
                    clrflag=false;
                    str="";
                    etinput.setText("");
                }
                if(str.contains("sin")||str.contains("cos")||str.contains("tan")||str.contains("pow2")||str.contains("pow3")) {
                    str=str.substring(0,str.indexOf(" "));
                }
                etinput.setText(str+" "+((Button)v).getText()+" ");
                break;


            case R.id.clr:
                if(clrflag)
                    clrflag=false;
                str="";
                etinput.setText("");
                break;


            case R.id.bt_del: //判断是否为空，然后在进行删除
                if(clrflag){
                    clrflag=false;
                    str="";
                    etinput.setText("");
                }
                else if(str!=null&&!str.equals("")){
                    etinput.setText(str.substring(0,str.length()-1));
                }
            break;



            case R.id.eq: //单独运算最后结果
                getResult();
                break;
        }
    }



    private void getResult(){
        String exp=etinput.getText().toString();

        if(clrflag){
            clrflag=false;
            return;
        }
        clrflag=true;
        //截取运算符前面的字符串
        String s1=exp.substring(5,exp.length());
        Log.i("info",s1+"111");
        //截取的运算符
        String op=exp.substring(1,4);
        Log.i("info",op+"1222");
        //截取运算符后面的字符串
        /*String s2=exp.substring(exp.indexOf(" ")+3);*/
        double cnt=0;
        if(exp==null||exp.equals("")||s1==null||op==null) return ;
        //因为没有运算符所以不用运算
        if(!exp.contains(" ")){
            return ;
        }
            double d1=Double.parseDouble(s1);
            /*double d2=Double.parseDouble(s2);*/
            if(op.equals("sin")){
                cnt=Math.sin(d1);
            }
            if(op.equals("cos")){
                cnt=Math.cos(d1);
            }
            if(op.equals("tan")){
                cnt=Math.tan(d1);
            }
        if(op.equals("x^2")){
            cnt=Math.pow(d1,2.0);
        }
        if(op.equals("x^3")){
            cnt=Math.pow(d1,3.0);
        }




           /* if(op.equals("÷")){
                if(d2==0) cnt=0;
                else cnt=d1/d2;
            }*/


//            if(!s1.contains(".")&&/*!s2.contains(".")&&*/!op.equals("÷")) {
//                int res = (int) cnt;
//                etinput.setText(res+"");
//            }else {
        Log.i("info",cnt+"23232");
                etinput.setText(cnt+"");
//    }
//        }
        //s1不为空但s2为空
      /*  else if(!s1.equals("")&&s2.equals("")){
            double d1=Double.parseDouble(s1);
            if(op.equals("+")){
                cnt=d1;
            }
            if(op.equals("-")){
                cnt=d1;
            }
            if(op.equals("×")){
                cnt=0;
            }
            if(op.equals("÷")){
                cnt=0;
            }
            if(!s1.contains(".")) {
                int res = (int) cnt;
                et_input.setText(res+"");
            }else {
                et_input.setText(cnt+"");}
        }
        //s1是空但s2不是空
        else if(s1.equals("")&&!s2.equals("")){
            double d2=Double.parseDouble(s2);
            if(op.equals("+")){
                cnt=d2;
            }
            if(op.equals("-")){
                cnt=0-d2;
            }
            if(op.equals("×")){
                cnt=0;
            }
            if(op.equals("÷")){
                cnt=0;
            }
            if(!s2.contains(".")) {
                int res = (int) cnt;
                et_input.setText(res+"");
            }else {
                et_input.setText(cnt+"");}
        }
        else {
            et_input.setText("");
        }*/
    }
}


