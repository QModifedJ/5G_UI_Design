package com.myapplication.UIDesign.Overview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.myapplication.UIDesign.R;

public class OverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        this.setTitle(getClass().getSimpleName());//修改标题为类名

        //点击Area按钮跳转Area界面
        ImageButton AreaButton=(ImageButton)findViewById(R.id.AreaButton);
        AreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.myapplication.UIDesign.Area.AreaActivity");
                startActivity(intent);
            }
        });

        //点击Equipment按钮跳转Equipment界面
        ImageButton EquipmentButton=(ImageButton)findViewById(R.id.EquipmentButton);
        EquipmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.myapplication.UIDesign.Equipment.EquipmentActivity");
                startActivity(intent);
            }
        });

        //点击BaseStation按钮跳转BaseStation界面
        ImageButton BaseStationButton=(ImageButton)findViewById(R.id.BaseStationButton);
        BaseStationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.myapplication.UIDesign.BaseStation.BaseStationActivity");
                startActivity(intent);
            }
        });
    }
}