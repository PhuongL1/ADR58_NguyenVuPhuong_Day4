package com.devpro.adr58_nguyenvuphuong_day4;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView tvDescriptionDetail;
    private boolean isExpanded = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDescriptionDetail = findViewById(R.id.tv_description_detail);
        tvDescriptionDetail.setOnClickListener(v -> {
            if (!isExpanded) {
                tvDescriptionDetail.setText(R.string.full_description);
                isExpanded = true;
            } else {
                tvDescriptionDetail.setText(R.string.decription_detail);
                isExpanded = false;
            }

        });

    }
}