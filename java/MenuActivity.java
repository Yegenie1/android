package com.cookandroid.subway;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        final GridView gv = (GridView)findViewById(R.id.gridView1);
        MyGridAdapter gAdapter =new MyGridAdapter(this);
        gv.setAdapter(gAdapter);


        Button btnReturn =(Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public class MyGridAdapter extends BaseAdapter{
        Context context;

        public MyGridAdapter(Context c){
            context=c;
        }

        @Override
        public int getCount() {
            return menuID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        Integer[] menuID = {
                R.drawable.mn1,R.drawable.mn2,R.drawable.mn3
                ,R.drawable.mn4,R.drawable.mn5,R.drawable.mn6
                ,R.drawable.mn7,R.drawable.mn8,R.drawable.mn9
                ,R.drawable.mn10,R.drawable.mn11,R.drawable.mn12
                ,R.drawable.mn13,R.drawable.mn14,R.drawable.mn15
                ,R.drawable.mn16,R.drawable.mn17,R.drawable.mn18
                ,R.drawable.mn19,R.drawable.mn20
        };

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview =new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5,5,5,5);

            imageview.setImageResource(menuID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView =(View)View.inflate(MenuActivity.this,R.layout.dialog,null);
                    AlertDialog.Builder dlg =new AlertDialog.Builder(MenuActivity.this);
                    ImageView ivMenu =(ImageView) dialogView.findViewById(R.id.ivmenu);
                    ivMenu.setImageResource(menuID[pos]);
                    dlg.setTitle("상세메뉴");
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기",null);
                    dlg.show();
                }
            });

            return imageview;

        }


    }


}
