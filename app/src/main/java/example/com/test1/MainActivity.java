package example.com.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,result;
    EditText et;
    String s="";
    String a="";
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        result=(Button)findViewById(R.id.result);
        et=(EditText)findViewById(R.id.editText);
       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"button",Toast.LENGTH_SHORT).show();
                et.setText("1");
                a=1;
            }
        });*/
    }
    public void clear(View v){
        s="";
        a="";
        n=0;
        et.setText("");
    }
    public void add(View v){

        a=String.valueOf(et.getText());
        n=n+Integer.parseInt(a);
        et.setText(""+n);
        s="";
        //or Editable a = et.getText();
        Toast.makeText(getApplicationContext(),""+n,Toast.LENGTH_SHORT).show();

    }
    public void sub(View v){

        a=String.valueOf(et.getText());
        n=Integer.parseInt(a)-n;
        et.setText(""+n);
        s="";

        //or Editable a = et.getText();
        Toast.makeText(getApplicationContext(),""+n,Toast.LENGTH_SHORT).show();
    }
    public void show(View v) {

        String rs = v.getResources().getResourceName(v.getId());
        Button b=(Button)v;
        String s1=b.getText().toString();


            s = s.concat(s1);
           // Toast.makeText(getApplicationContext(), " " + s, Toast.LENGTH_SHORT).show();
            et.setText(s);


        //if (v == b2){
           // Toast.makeText(getApplicationContext(), "button2", Toast.LENGTH_SHORT).show();
      //  et.setText("2");
        //a=2;
    }

  /*  else if(v == b3)
        {Toast.makeText(getApplicationContext(),"button3",Toast.LENGTH_SHORT).show();
  //  et.setText("3");
    a=3;
    }
    else if(v == b4){
    //    et.setText("4");
        a=4;
        }
        else if(v == b5){
            et.setText("5");
            a=5;
        }
        else if(v == b6){
            et.setText("6");
            a=6;
        }
        else if(v == b7){
            et.setText("7");
            a=7;
        }
        else if(v == b8){
            et.setText("8");
            a=8;
        }
        else if(v == b9){
            et.setText("9");
            a=9;
        }
        else if(v == b0){
            et.setText("0");
            a=0;
        }
        else if(v == add){
            add();
        }
        else if (v==sub){
            sub();
        }
        else if (v==result){
            et.setText(+c);
        }*/
    //}

}
