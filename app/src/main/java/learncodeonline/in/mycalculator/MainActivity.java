package learncodeonline.in.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    TextView answer;

    Button clearAll,divide,seven,eight,nine,multiply,four,five,six,subtract,one,two,three,add,zero,dot,equalToSymbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer=findViewById(R.id.answer);
        clearAll=findViewById(R.id.clearAll);
        divide=findViewById(R.id.divide);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        multiply=findViewById(R.id.multiply);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        subtract=findViewById(R.id.subtract);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        add=findViewById(R.id.add);
        zero=findViewById(R.id.zero);
        dot=findViewById(R.id.dot);
        equalToSymbol=findViewById(R.id.equalToSymbol);

        answer.setMovementMethod(new ScrollingMovementMethod());

        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setTextColor(Color.WHITE);
                answer.setText("");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"/";
                answer.setText(buffer);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"*";
                answer.setText(buffer);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"+";
                answer.setText(buffer);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"-";
                answer.setText(buffer);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"0";
                answer.setText(buffer);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"1";
                answer.setText(buffer);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"2";
                answer.setText(buffer);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"3";
                answer.setText(buffer);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"4";
                answer.setText(buffer);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"5";
                answer.setText(buffer);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"6";
                answer.setText(buffer);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"7";
                answer.setText(buffer);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"8";
                answer.setText(buffer);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+"9";
                answer.setText(buffer);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();
                buffer=buffer+".";
                answer.setText(buffer);
            }
        });

        equalToSymbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buffer=answer.getText().toString();

                String result = null;

                    Expression e = new Expression(buffer);
                    result = String.valueOf(e.calculate());

                    if(result.equals("NaN")){
                        answer.setTextColor(Color.RED);
                        answer.setText("Please provide valid input!!!");
                        return;
                    }
                answer.setText(result);
            }
        });
    }
}

