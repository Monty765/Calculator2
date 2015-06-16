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

public class calione extends ActionBarActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,clear,more;
    EditText et;
    TextView equation;
    float val1,val2;
    boolean add,sub,div,mul,equals=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calione);

        b1=(Button) findViewById(R.id.one);
        b2=(Button) findViewById(R.id.two);
        b3=(Button) findViewById(R.id.three);
        b4=(Button) findViewById(R.id.four);
        b5=(Button) findViewById(R.id.five);
        b6=(Button) findViewById(R.id.six);
        b7=(Button) findViewById(R.id.seven);
        b8=(Button) findViewById(R.id.eight);
        b9=(Button) findViewById(R.id.nine);
        b0=(Button) findViewById(R.id.zero);
        bdot=(Button) findViewById(R.id.cancel);
        badd=(Button) findViewById(R.id.add);
        bsub=(Button) findViewById(R.id.sub);
        bmul=(Button) findViewById(R.id.mul);
        bdiv=(Button) findViewById(R.id.div);
        beq=(Button) findViewById(R.id.equal);
        et=(EditText) findViewById(R.id.display);
        equation=(TextView) findViewById(R.id.equation);
        clear=(Button)findViewById(R.id.clear);
        more = (Button) findViewById(R.id.next1);
        Intent intent2 = getIntent();
        String id = intent2.getStringExtra("equation");
        equation.setText(id);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(calione.this,calitwo.class);
                intent.putExtra("equation",equation.getText());
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

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"1");
                equation.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"2");
                equation.append("2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"3");
                equation.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"4");
                equation.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"5");
                equation.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"6");
                equation.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"7");
                equation.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"8");
                equation.append("8");


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"9");
                equation.append("9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"0");
                equation.append("0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+".");
                equation.append(".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                add=true;
                et.setText(null);
                equation.append("+");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                sub=true;
                et.setText(null);
                equation.append("-");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                div=true;
                et.setText(null);
                equation.append("/");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                mul=true;
                et.setText(null);
                equation.append("*");
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                equation.append("=");
                float solution=0;
                val2=Integer.parseInt(et.getText()+"");
                if (add==true) {
                    solution=val1+val2;
                    et.setText(solution+"");
                    add=false;
                }
                if (sub==true) {
                    solution=val1-val2;
                    et.setText(solution+"");
                    sub=false;
                }
                if (mul==true) {
                    solution=val1*val2;
                    et.setText(solution+"");
                    mul=false;
                }
                if (div==true) {
                    solution=val1/val2;
                    et.setText(solution+"");
                    div=false;
                }
                equation.append(solution+"");
                equals=true;
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
