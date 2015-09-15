package com.dany.pruebaws;


import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	private static final String NAMESPACE = "http://tempuri.org/";
	private static final String URL = "http://192.168.0.10:8074/Service.asmx";
	private static final String ACTIONLOGIN = "http://tempuri.org/ProductList";
	private static final String LOGINMETHOD = "ProductList";
	
	TextView tv;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView1);
        new Login().execute();
      //  tv.setText("lll");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public class Login extends AsyncTask<Void, Void, SoapObject>
    {

		@Override
		protected SoapObject doInBackground(Void... params) {
			// TODO Auto-generated method stub
			try{
    SoapObject request  = new SoapObject(NAMESPACE, LOGINMETHOD);
  //  request.addProperty("id",1);
    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
    envelope.dotNet=true;
    envelope.setOutputSoapObject(request);
    
    
    HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
    
  
    
    SoapObject resultRequestSOAP = new SoapObject(NAMESPACE, LOGINMETHOD);
    androidHttpTransport.call(ACTIONLOGIN, envelope);
    resultRequestSOAP = (SoapObject) envelope.bodyIn;
    
  
    	return resultRequestSOAP;
    	
    //	tv.setText();
    }catch(Exception e){
    	e.printStackTrace();
    }
    return null;
    
}
protected void onPostExecute(SoapObject obj){
	if(obj!= null)
	{
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setText("sss");
		//tv.setText(obj.getProperty(0).toString());
		
		
	}
	else {
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setText("GOKu");
	}
}
public void loggearse() 
{
	
	
	
	
}
} //cierra clase login
    
     




             
}
