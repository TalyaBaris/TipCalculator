package il.ac.huji.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class TipCalculatorActivity extends Activity {
	


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       final Button btn=(Button)findViewById(R.id.btnCalculate);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText et=(EditText)findViewById(R.id.edtBillAmount);
				float amount=Float.parseFloat(et.getText().toString());
				
				float tip=((float)12/100)*amount;
				Log.i("T_DEBUG","tip is: "+tip);
				CheckBox cb=(CheckBox)findViewById(R.id.chkRound);
				TextView tv = (TextView)findViewById(R.id.txtTipResult);
				if (cb.isChecked()){                             
					tv.setText("Tip: $"+Math.round(tip));
				}
				else{
				//	tip=String.format("%.2f", tip);
					tv.setText("Tip: $"+String.format("%.2f", tip));
				}
				
		    	
			}
		});
        
    }
    
   
}