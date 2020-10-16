package com.example.th_andoird_tikilayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_above extends Fragment {
    Button btnGiam;
    Button btnTang;
    TextView txtSoLuong;
    int soLuong = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View above_view = inflater.inflate(R.layout.fragment_above, container,false);
        btnGiam = above_view.findViewById(R.id.btnGiam);
        btnGiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soLuong --;
                txtSoLuong = above_view.findViewById(R.id.txtSoLuong);
                txtSoLuong.setText(soLuong+"");
            }
        });
        btnTang = above_view.findViewById(R.id.btnTang);
        btnTang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soLuong++;
                txtSoLuong = above_view.findViewById(R.id.txtSoLuong);
                txtSoLuong.setText(soLuong+"");

            }
        });
        return above_view;
    }

}
