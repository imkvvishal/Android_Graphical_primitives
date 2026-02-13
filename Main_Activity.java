ackage com.example.ex3_091;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView ig;

    Paint p,k;
    Bitmap bg;
    Canvas c;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            b=(Button)findViewById(R.id.button);
            ig=(ImageView) findViewById(R.id.imageView);
            bg=Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
            c=new Canvas(bg);
            p=new Paint();
            Paint p1=new Paint();
            Paint p2=new Paint();
            Paint p3=new Paint();
            Paint p4=new Paint();
            p1.setColor(Color.RED);
            p2.setColor(Color.GREEN);
            p3.setColor(Color.YELLOW);
            p4.setColor(Color.BLACK);
            p.setColor(Color.BLUE);
            p.setTextSize(20);
            ig.setBackgroundDrawable(new BitmapDrawable(bg));
                    c.drawCircle(650,500,95,p2);
                    c.drawRect(400,530,650,850,p3);
                    c.drawText("Rectangle",420,150,p4);
                    c.drawRect(170,720,420,1000,p);
                    c.drawCircle(120,1000,90,p1);


            return insets;
        });
    }
}
