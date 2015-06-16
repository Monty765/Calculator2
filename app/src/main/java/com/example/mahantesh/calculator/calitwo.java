package com.example.mahantesh.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calitwo extends ActionBarActivity {
    Button sin,cos,tan,i,ln,log,pi,e,mod,not,sqrt,pow,lb,rb,beq,clear,more;
    EditText et;
    TextView equation;
    float val1,val2;
    boolean add,sub,div,mul,equals=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calitwo);

        sin=(Button) findViewById(R.id.sin);
        cos=(Button) findViewById(R.id.cos);
        tan=(Button) findViewById(R.id.tan);
        i=(Button) findViewById(R.id.i);
        ln=(Button) findViewById(R.id.ln);
        log=(Button) findViewById(R.id.log);
        pi=(Button) findViewById(R.id.pi);
        e=(Button) findViewById(R.id.expo);
        lb=(Button) findViewById(R.id.lbrac);
        mod=(Button) findViewById(R.id.mod);
        rb=(Button) findViewById(R.id.rbrac);
        not=(Button) findViewById(R.id.not);
        sqrt=(Button) findViewById(R.id.sqrt);
        pow=(Button) findViewById(R.id.pow);
        et=(EditText) findViewById(R.id.display1);
        equation=(TextView) findViewById(R.id.equation1);
        clear=(Button)findViewById(R.id.clear);
        Intent inten = getIntent();
        String id = inten.getStringExtra("equation");
        equation.setText(id);
        more = (Button) findViewById(R.id.next);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence equ=equation.getText();
                Intent intent = new Intent(calitwo.this,calione.class);
                intent.putExtra("equation",equ);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                equation.setText("");
                et.setText("");
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"sin ");
                equation.append("sin ");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"cos ");
                equation.append("cos ");

            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"tan ");
                equation.append("tan");
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"i");
                equation.append("i");
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"ln ");
                equation.append("ln ");
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"log ");
                equation.append("log ");
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"PI ");
                equation.append("PI ");
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+" sqrt ");
                equation.append(" sqrt ");


            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"pow");
                equation.append("pow");
            }
        });
        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"(");
                equation.append("(");
            }
        });
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+")");
                equation.append(")");
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
