package de.nitri.gaugedemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<DialGauge.Section> sectionsLocal = new ArrayList<>();
        sectionsLocal.add(new DialGauge.Section(-50F, -25F, Color.parseColor("#FF4500")));
        sectionsLocal.add(new DialGauge.Section(-25F, 6F, Color.parseColor("#e7b923")));
        sectionsLocal.add(new DialGauge.Section(6F, 15F, Color.parseColor("#4CBB17")));
        sectionsLocal.add(new DialGauge.Section(15F, 25F, Color.parseColor("#FFFF00")));
        sectionsLocal.add(new DialGauge.Section(25F, 50F, Color.parseColor("#FF4500")));
       // setSections(sectionsLocal);

        DialGauge dialGauge = (DialGauge) findViewById(R.id.dialGauge2);
        dialGauge.setSetUpValues(-50F, 50F, sectionsLocal, -15F);

    }

}
