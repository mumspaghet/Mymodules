package sg.edu.rp.c346.id20024313.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        Output = findViewById(R.id.textView6);

        Intent i = getIntent();
        String answer = i.getStringExtra("yes");
        String Checking = i.getStringExtra("no");
        if (Checking.equalsIgnoreCase("C346")) {
            Output.setText( "Module Code: C346" + "\nModule Name: Android Programming" + "\nAcademic Year: 2020" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: W66M");
        } else if (Checking.equalsIgnoreCase("C328")) {
            Output.setText("Module Code: C328" + "\nModule Name: Intelligent Network" + "\nAcademic Year:2020" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: W67M");
        } else if (Checking.equalsIgnoreCase("C203")) {
            Output.setText("Module Code: C203" + "\nModule Name: Web AppIn Development in php" + "\nAcademic Year:2020" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: W65M");
        } else if (Checking.equalsIgnoreCase("C331")) {
            Output.setText("Module Code: C331" + "\nModule Name: Digital Forensics and Security" + "\nAcademic Year:2020" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: W69M");
        } else if (Checking.equalsIgnoreCase("C228")) {
            Output.setText("Module Code: C228" + "\nModule Name: Operating System Security" + "\nAcademic Year:2020" + "\nSemester: 1" + "\nModule Credit: 4" + "\nVenue: W68M");
        }
    }
}
