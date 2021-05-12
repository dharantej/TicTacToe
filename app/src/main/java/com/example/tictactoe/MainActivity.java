package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int game[][]=new int[4][4];
    TextView tv;
    Button rb;
    int p=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb=findViewById(R.id.reset);
//        ConnectivityManager cm= (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo=cm.getActiveNetworkInfo();
//        if(networkInfo.isConnected())
//            Toast.makeText(this,"Connected",Toast.LENGTH_SHORT).show();
//        else
//            Toast.makeText(this,"Disconnected",Toast.LENGTH_SHORT).show();
    }

    public void play1(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=1;y=1;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
        b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play2(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=1;y=2;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play3(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=1;y=3;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play4(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=2;y=1;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play5(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=2;y=2;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play6(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=2;y=3;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play7(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=3;y=1;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);

        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play8(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=3;y=2;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);
        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    public void play9(View view) {
        if(p==1)
        {
            Toast.makeText(this,"Game is over reset to play new game",Toast.LENGTH_SHORT).show();
            rb=findViewById(R.id.reset);
            rb.setVisibility(View.VISIBLE);
        }
        ImageView b=(ImageView) view;

        int x,y;
        x=3;y=3;
        tv=findViewById(R.id.turn);
        if(game[x][y]!=0)
        {
            Toast.makeText(this,"Select empty box ",Toast.LENGTH_SHORT).show();
            return;
        }
        int t;
        String tut=tv.getText().toString();
        if(tut.contains("X"))
        {
            t=1;
        }
        else
            t=2;
        game[x][y]=t;
        if(t==1)
            b.setImageResource(R.drawable.x_t);
        else
            b.setImageResource(R.drawable.o_t);

        int r=check();
        if(r==1)
        {
            rb.setVisibility(View.VISIBLE);
        }
        else
        {
            if(tut.contains("X"))
            {
                tv.setText("Player O turn");
            }
            else
                tv.setText("Player X turn");
        }
    }
    private int check() {
        //int p=0;
        int i,j;
        for(i=1;i<4;i++)
        {
            if(game[i][1]!=0&&game[i][1]==game[i][2]&&game[i][2]==game[i][3])
            {
                p=1;
                if(game[i][1]==1)
                tv.setText("Player X wins");
                else
                    tv.setText("Player O wins");
                //rb.setVisibility(View.VISIBLE);
                return 1;
            }
            if(game[1][i]!=0&&game[1][i]==game[2][i]&&game[2][i]==game[3][i])
            {
                p=1;
                if(game[1][i]==1)
                    tv.setText("Player X wins");
                else
                    tv.setText("Player O wins");
                //rb.setVisibility(View.VISIBLE);
                return 1;
            }
        }
        if(game[1][1]!=0&&game[1][1]==game[2][2]&&game[2][2]==game[3][3])
        {
            p=1;
            if(game[1][1]==1)
                tv.setText("Player X wins");
            else
                tv.setText("Player O wins");
            //rb.setVisibility(View.VISIBLE);
            return 1;
        }
        if(game[1][3]!=0&&game[1][3]==game[2][2]&&game[2][2]==game[3][1])
        {
            p=1;
            if(game[1][3]==1)
                tv.setText("Player X wins");
            else
                tv.setText("Player O wins");
            //rb.setVisibility(View.VISIBLE);
            return 1;
        }
        int count=0;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                if(game[i][j]!=0)
                    count++;
            }
        }
        if(count==9)
        {
            p=1;
            tv.setText("Game is drawn");
            //rb.setVisibility(View.VISIBLE);
            return 1;
        }
        return 0;
    }

    public void reset(View view) {
        game=new int[4][4];
        p=0;
        ImageView b1=findViewById(R.id.b1_1);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b1_2);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b1_3);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b2_1);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b2_2);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b2_3);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b3_1);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b3_2);
        b1.setImageResource(R.drawable.w_t);
        b1=findViewById(R.id.b3_3);
        b1.setImageResource(R.drawable.w_t);
        tv.setText("Player X turn");
        view.setVisibility(View.INVISIBLE);
    }
}