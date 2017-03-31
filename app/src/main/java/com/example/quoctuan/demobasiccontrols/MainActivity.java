package com.example.quoctuan.demobasiccontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNamAm;

    EditText editNamDuong;

    Button btnChuyenDoi;

    int can;
    String chi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {

        txtNamAm = (TextView) findViewById(R.id.txtNamAm);

        editNamDuong = (EditText) findViewById(R.id.editNamDuong);

        btnChuyenDoi = (Button) findViewById(R.id.btnChuyenDoi);

    }

    private void addEvents() {

        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int s = Integer.parseInt(editNamDuong.getText().toString());

                if (s >= 1){

                    switch (s%10){
                        case 0 : txtNamAm.setText("Canh");
                            break;
                        case 1 : txtNamAm.setText("Tân");
                            break;
                        case 2 : txtNamAm.setText("Nhâm");
                            break;
                        case 3 : txtNamAm.setText("Quý");
                            break;
                        case 4 : txtNamAm.setText("Giáp");
                            break;
                        case 5 : txtNamAm.setText("Ất");
                            break;
                        case 6 : txtNamAm.setText("Bính");
                            break;
                        case 7 : txtNamAm.setText("Đinh");
                            break;
                        case 8 : txtNamAm.setText("Mậu");
                            break;
                        case 9 : txtNamAm.setText("Kỷ");
                            break;
                    }
                    switch (s%12){

                        case 0 : txtNamAm.setText(txtNamAm.getText()+" Thân");
                            break;
                        case 1 : txtNamAm.setText(txtNamAm.getText()+" Dậu");
                            break;
                        case 2 : txtNamAm.setText(txtNamAm.getText()+" Tuất");
                            break;
                        case 3 : txtNamAm.setText(txtNamAm.getText()+" Hợi");
                            break;
                        case 4 : txtNamAm.setText(txtNamAm.getText()+" Tý");
                            break;
                        case 5 : txtNamAm.setText(txtNamAm.getText()+" Sửu");
                            break;
                        case 6 : txtNamAm.setText(txtNamAm.getText()+" Dần");
                            break;
                        case 7 : txtNamAm.setText(txtNamAm.getText()+" Mẹo");
                            break;
                        case 8 : txtNamAm.setText(txtNamAm.getText()+" Thìn");
                            break;
                        case 9 : txtNamAm.setText(txtNamAm.getText()+" Tỵ");
                            break;
                        case 10 : txtNamAm.setText(txtNamAm.getText()+" Ngọ");
                            break;
                        case 11 : txtNamAm.setText(txtNamAm.getText()+" Mùi");
                            break;

                    }

                }else {
                    Toast.makeText(MainActivity.this,
                            "Nhập sai mời bạn nhập lại(năm dương >= 1900)",
                            Toast.LENGTH_SHORT).show();
                    editNamDuong.setText("");
                    txtNamAm.setText("");
                }
            }
        });

    }


}
