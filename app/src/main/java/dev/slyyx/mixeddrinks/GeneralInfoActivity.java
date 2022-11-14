package dev.slyyx.mixeddrinks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeneralInfoActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_general_info);
		
		// set up listeners for all buttons
		Button spiritsExplained = findViewById(R.id.btn_spirits_explained);
		spiritsExplained.setOnClickListener(this::goToSpiritsExplainedPage);
		
		
		
	}
	
	/**
	 * Launch the Spirits Explained Activity.
	 */
	private void goToSpiritsExplainedPage(View view) {
		Intent intent = new Intent(this, SpiritsExplainedActivity.class);
		startActivity(intent);
	}
}