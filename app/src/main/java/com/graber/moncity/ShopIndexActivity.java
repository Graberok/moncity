package com.graber.moncity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopIndexActivity extends AppCompatActivity {

    LinearLayout lapl;
    ImageButton imgb;
    TextView twtitle;
    ScrollView scv;
    ArrayList<ProductType> products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_index);
        lapl = findViewById(R.id.shopPlaceList);
        imgb = findViewById(R.id.imageButtonBack);
        twtitle = findViewById(R.id.textView9);
        scv = findViewById(R.id.ScrolViewPLace);
        products = new ArrayList<ProductType>();

        for(int i =0; i<15; i++){
            ProductType p=new ProductType();
            p.title = "Товар_"+i;
            p.description=""+i+"-"+p.description;
            p.price=12325*i;
            
            products.add(p);
        }


        imgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
