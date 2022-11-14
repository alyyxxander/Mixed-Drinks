package dev.slyyx.mixeddrinks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SpiritsExplainedActivity extends AppCompatActivity {
	
	//====================================== VARIABLES
	TextView brandyDesc, cordialsDesc, ginDesc, rumDesc, tequilaDesc, vodkaDesc, whiskeyDesc;
	boolean brandyDescVisible, cordialsDescVisible, ginDescVisible, rumDescVisible, tequilaDescVisible, vodkaDescVisible, whiskeyDescVisible;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spirits_explained);
		
		//create a reference to each button on the page
		Button brandyButton = findViewById(R.id.btn_spirits_explained_brandy);
		Button cordialsButton = findViewById(R.id.btn_spirits_explained_cordials);
		Button ginButton = findViewById(R.id.btn_spirits_explained_gin);
		Button rumButton = findViewById(R.id.btn_spirits_explained_rum);
		Button tequilaButton = findViewById(R.id.btn_spirits_explained_tequila);
		Button vodkaButton = findViewById(R.id.btn_spirits_explained_vodka);
		Button whiskeyButton = findViewById(R.id.btn_spirits_explained_whiskey);
		
		//set the onClickListeners for each button
		brandyButton.setOnClickListener(this::toggleDescriptionInfo);
		cordialsButton.setOnClickListener(this::toggleDescriptionInfo);
		ginButton.setOnClickListener(this::toggleDescriptionInfo);
		rumButton.setOnClickListener(this::toggleDescriptionInfo);
		tequilaButton.setOnClickListener(this::toggleDescriptionInfo);
		vodkaButton.setOnClickListener(this::toggleDescriptionInfo);
		whiskeyButton.setOnClickListener(this::toggleDescriptionInfo);
		
		//create a reference to each text
		brandyDesc = (TextView) findViewById(R.id.txt_spirits_explained_brandy_desc);
		cordialsDesc = (TextView) findViewById(R.id.txt_spirits_explained_cordials_desc);
		ginDesc = (TextView) findViewById(R.id.txt_spirits_explained_gin_desc);
		rumDesc = (TextView) findViewById(R.id.txt_spirits_explained_rum_desc);
		tequilaDesc = (TextView) findViewById(R.id.txt_spirits_explained_tequila_desc);
		vodkaDesc = (TextView) findViewById(R.id.txt_spirits_explained_vodka_desc);
		whiskeyDesc = (TextView) findViewById(R.id.txt_spirits_explained_whiskey_desc);
		
		//set each of the descriptions to be invisible by default
		brandyDesc.setVisibility(View.GONE);
		cordialsDesc.setVisibility(View.GONE);
		ginDesc.setVisibility(View.GONE);
		rumDesc.setVisibility(View.GONE);
		tequilaDesc.setVisibility(View.GONE);
		vodkaDesc.setVisibility(View.GONE);
		whiskeyDesc.setVisibility(View.GONE);
	}
	
	
	/**
	 * Toggles visibility of the description for whichever type of spirit was pressed.
	 */
	private void toggleDescriptionInfo(View view) {
		switch (view.getId()) {
			
			case (R.id.btn_spirits_explained_brandy):
				if (brandyDescVisible) brandyDesc.setVisibility(View.GONE);
				else  brandyDesc.setVisibility(View.VISIBLE);
				brandyDescVisible = !brandyDescVisible;
				break;
			
			case (R.id.btn_spirits_explained_cordials):
				if (cordialsDescVisible) cordialsDesc.setVisibility(View.GONE);
				else  cordialsDesc.setVisibility(View.VISIBLE);
				cordialsDescVisible = !cordialsDescVisible;
				break;
			
			case (R.id.btn_spirits_explained_gin):
				if (ginDescVisible) ginDesc.setVisibility(View.GONE);
				else  ginDesc.setVisibility(View.VISIBLE);
				ginDescVisible = !ginDescVisible;
				break;
			
			case (R.id.btn_spirits_explained_rum):
				if (rumDescVisible) rumDesc.setVisibility(View.GONE);
				else  rumDesc.setVisibility(View.VISIBLE);
				rumDescVisible = !rumDescVisible;
				break;
			
			case (R.id.btn_spirits_explained_tequila):
				if (tequilaDescVisible) tequilaDesc.setVisibility(View.GONE);
				else  tequilaDesc.setVisibility(View.VISIBLE);
				tequilaDescVisible = !tequilaDescVisible;
				break;
			
			case (R.id.btn_spirits_explained_vodka):
				if (vodkaDescVisible) vodkaDesc.setVisibility(View.GONE);
				else  vodkaDesc.setVisibility(View.VISIBLE);
				vodkaDescVisible = !vodkaDescVisible;
				break;
			
			case (R.id.btn_spirits_explained_whiskey):
				if (whiskeyDescVisible) whiskeyDesc.setVisibility(View.GONE);
				else  whiskeyDesc.setVisibility(View.VISIBLE);
				whiskeyDescVisible = !whiskeyDescVisible;
				break;
				
			default:
				//TODO: add a default case
				break;
		}
	}
	
	
}