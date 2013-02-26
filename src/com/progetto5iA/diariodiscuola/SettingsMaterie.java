package com.progetto5iA.diariodiscuola;

import java.util.ArrayList;
import java.util.Vector;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class SettingsMaterie extends Activity {
	
	private Button inserisci;
	private EditText materia;
	private ListView listaMaterie;
	private ArrayList<String> mat=new ArrayList<String>();
	private ArrayList<Object> immagini=new ArrayList<Object>();
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_materie);
        inserisci= (Button) findViewById(R.id.button1);
        materia= (EditText) findViewById(R.id.editText1);
        listaMaterie= (ListView) findViewById(R.id.listView1);
        
         ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mat);
         listaMaterie= (ListView)findViewById(R.id.listView1);
         listaMaterie.setAdapter(adapter);

        
        inserisci.setOnClickListener(new View.OnClickListener() {
        	  public void onClick(View view) { 
        		  mat.add(materia.getText().toString());
        	    materia.setText("");
        	  }
        	});
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
     // Create an ArrayAdapter using the string array and a default spinner layout
     ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
             R.array.colors, android.R.layout.simple_spinner_item);
     // Specify the layout to use when the list of choices appears
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     // Apply the adapter to the spinner
     spinner.setAdapter(adapter1);
        
        
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_settings_materie, menu);
        return true;
    }
   
    
    
}
