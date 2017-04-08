package com.itant.leaf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatLeafLayout mLeafLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeafLayout = getView(R.id.fl);

        getView(R.id.bt_play_leaf).setOnClickListener(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLeafLayout.onDestroy();
    }

    @SuppressWarnings("unchecked")
    private <T extends View> T getView(int id) {
        return (T) findViewById(id);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_play_leaf:
                // 添加一堆落叶
                mLeafLayout.addLeaf();
                break;
            default:
        }
    }
}
