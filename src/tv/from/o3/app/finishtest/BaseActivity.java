package tv.from.o3.app.finishtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class BaseActivity extends Activity {

	public static final int FINISH_CODE   = 1;
	public static final String FINISH_NAME    = "IS_ALL_FINISH";
	public static final String FINISH_VALUE   = "YES_ALL_FINISH";
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == Activity.RESULT_OK) {
			if (requestCode == FINISH_CODE) {
				Bundle extras = data.getExtras();
				if (extras != null) {
					String text = extras.getString(FINISH_NAME);
					if (FINISH_VALUE.equals(text)) {
						Intent intent = new Intent();
						intent.putExtra(FINISH_NAME, FINISH_VALUE);
						setResult(Activity.RESULT_OK, intent);
						finish();
					}
				}
			}
		}

	}

}
