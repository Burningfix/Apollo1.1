package jianqiang.com.activityhook1;

import android.app.Activity;
import android.widget.TextView;

/**
 * @author weishu
 * @date 16/3/29
 */
public class StubActivity extends Activity {
    // dummy

    @Override
    protected void onResume() {
        super.onResume();

        TextView t = new TextView(this);
        t.setText("StubActivity 内容....");

        setContentView(t);
    }
}
