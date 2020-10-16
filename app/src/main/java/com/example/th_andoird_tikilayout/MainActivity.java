package com.example.th_andoird_tikilayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_above fragment_above = new Fragment_above();
        getSupportFragmentManager().beginTransaction().add(R.id.container_above, fragment_above).commit();
        Fragment_below fragment_below = new Fragment_below();
        getSupportFragmentManager().beginTransaction().add(R.id.container_above,fragment_below).commit();

    }
//    Button btnMuaHang;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        setContentView(R.layout.activity_main);
//        btnMuaHang = findViewById(R.id.btn_MuaHang);
//        btnMuaHang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment_below fragment_below = new Fragment_below();
//                getSupportFragmentManager().beginTransaction().add(R.id.container_below,fragment_below).commit();
//            }
//        });
//}
}