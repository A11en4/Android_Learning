package com.taifua.androidlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.taifua.androidlearning.gridview.GridViewActivity;
import com.taifua.androidlearning.listview.ListViewActivity;
import com.taifua.androidlearning.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity
{

    private Button mBtnLinearlayout;
    private Button mBtnRelativelayout;
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRatioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnScrollView;
    private Button mBtnRecycleView;
    private Button mBtnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLinearlayout = findViewById(R.id.btn_linearlayout);
        mBtnRelativelayout = findViewById(R.id.btn_relativelayout);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRatioButton = findViewById(R.id.btn_ratiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_image_view);
        mBtnListView = findViewById(R.id.btn_list_view);
        mBtnGridView = findViewById(R.id.btn_grid_view);
        mBtnScrollView = findViewById(R.id.btn_scroll_view);
        mBtnRecycleView = findViewById(R.id.btn_recycle_view);
        mBtnWebView = findViewById(R.id.btn_web_view);

        setListeners();
    }

    // 监听器方法
    private void setListeners()
    {
        OnClick onClick = new OnClick();
        mBtnLinearlayout.setOnClickListener(onClick);
        mBtnRelativelayout.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRatioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnScrollView.setOnClickListener(onClick);
        mBtnRecycleView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
    }

    // 实现监听器接口
    private class OnClick implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Intent intent = null;
            switch (view.getId())
            {
                // 跳转到LinearLayout演示页面
                case R.id.btn_linearlayout:
                    intent = new Intent(MainActivity.this, LinearlayoutActivity.class);
                    break;
                // 跳转到RelativeLayout演示页面
                case R.id.btn_relativelayout:
                    intent = new Intent(MainActivity.this, RelativelayoutActivity.class);
                    break;
                // 跳转到TextView演示页面
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                // 跳转到Button演示页面
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                // 跳转到EditText演示页面
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                // 跳转到RatioButton演示页面
                case R.id.btn_ratiobutton:
                    intent = new Intent(MainActivity.this, RatioButtonActivity.class);
                    break;
                // 跳转到CheckBox演示页面
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                // 跳转到ImageView演示页面
                case R.id.btn_image_view:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                // 跳转到ListView演示页面
                case R.id.btn_list_view:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                // 跳转到GridView演示页面
                case R.id.btn_grid_view:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                // 跳转到ScrollView演示页面
                case R.id.btn_scroll_view:
                    intent = new Intent(MainActivity.this, ScrollViewActivity.class);
                    break;
                // 跳转到RecycleView演示页面
                case R.id.btn_recycle_view:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
                // 跳转到WebView演示页面
                case R.id.btn_web_view:
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}


