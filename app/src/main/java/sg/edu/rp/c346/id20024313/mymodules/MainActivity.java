package sg.edu.rp.c346.id20024313.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView C346details;
TextView C328details;
TextView C203details;
TextView C331details;
TextView C228details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
C346details = findViewById(R.id.textView);
C328details = findViewById(R.id.textView2);
C203details = findViewById(R.id.textView3);
C331details = findViewById(R.id.textView4);
C228details = findViewById(R.id.textView5);
    C346details.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
            intent.putExtra("no","C346");
            intent.putExtra("yes","Module code: "+"\nModule Name: "+"\nAcademic Year: "+
                    "\nSemester: "+"\nModule Credit: "+"\nVenue: ");
            startActivity(intent);
        }
    });
    C328details.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
            intent.putExtra("no","C328");
            intent.putExtra("yes","Module code: "+"\nModule Name: "+"\nAcademic Year: "+
                    "\nSemester: "+"\nModule Credit: "+"\nVenue: ");
            startActivity(intent);
        }
    });
        C203details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("no","C203");
                intent.putExtra("yes","Module code: "+"\nModule Name: "+"\nAcademic Year: "+
                        "\nSemester: "+"\nModule Credit: "+"\nVenue: ");
                startActivity(intent);
            }
        });
        C331details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("no","C331");
                intent.putExtra("yes","Module code: "+"\nModule Name: "+"\nAcademic Year: "+
                        "\nSemester: "+"\nModule Credit: "+"\nVenue: ");
                startActivity(intent);
            }
        });
        C228details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("no","C228");
                intent.putExtra("yes","Module code: "+"\nModule Name: "+"\nAcademic Year: "+
                        "\nSemester: "+"\nModule Credit: "+"\nVenue: ");
                startActivity(intent);
            }
        });
}
}