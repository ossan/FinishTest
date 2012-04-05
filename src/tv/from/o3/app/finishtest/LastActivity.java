package tv.from.o3.app.finishtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LastActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final Button buttonOneFinish = (Button) this.findViewById(R.id.buttonOneFinish);
		buttonOneFinish.setVisibility(View.VISIBLE);
		buttonOneFinish.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent();
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		});

		final Button buttonExit = (Button) this.findViewById(R.id.buttonExit);
		buttonExit.setVisibility(View.VISIBLE);
		buttonExit.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.putExtra(FINISH_NAME, FINISH_VALUE);
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		});
	}
}
