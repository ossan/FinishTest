package tv.from.o3.app.finishtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MiddleActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final Button buttonMiddle = (Button) this.findViewById(R.id.buttonMiddle);
		buttonMiddle.setVisibility(View.VISIBLE);
		buttonMiddle.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(MiddleActivity.this, MiddleActivity.class);
				startActivityForResult(intent, FINISH_CODE);
			}
		});
		
		final Button buttonLast = (Button) this.findViewById(R.id.buttonLast);
		buttonLast.setVisibility(View.VISIBLE);
		buttonLast.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(MiddleActivity.this, LastActivity.class);
				startActivityForResult(intent, FINISH_CODE);
			}
		});

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
