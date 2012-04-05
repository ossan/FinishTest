package tv.from.o3.app.finishtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends BaseActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final Button buttonMiddle = (Button) this.findViewById(R.id.buttonMiddle);
		buttonMiddle.setVisibility(View.VISIBLE);
		buttonMiddle.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(FirstActivity.this, MiddleActivity.class);
				startActivityForResult(intent, FINISH_CODE);
			}
		});
		
		final Button buttonLast = (Button) this.findViewById(R.id.buttonLast);
		buttonLast.setVisibility(View.VISIBLE);
		buttonLast.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(FirstActivity.this, LastActivity.class);
				startActivityForResult(intent, FINISH_CODE);
			}
		});
	}
	
}