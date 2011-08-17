package de.VibratorTest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class VibratorTestActivity extends Activity {
    private TextView tv;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Get instance of Vibrator from current Context
        final Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
         
        // Vibrate for 300 milliseconds
        v.vibrate(300);
        
		//---VorraeteVerwaltenActivity aufrufen
        this.tv = (TextView)this.findViewById(R.id.maintextview);
		this.tv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View tv) {
		        v.vibrate(300);
			}
		});
    }
}