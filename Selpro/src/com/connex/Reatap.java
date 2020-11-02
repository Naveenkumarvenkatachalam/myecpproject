package com.connex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Reatap {
	
	public void maiopen() throws IOException
	{
		URL ur = new URL("	http://dummy.restapiexample.com/api/v1/employees");
		URLConnection  conecti=  ur.openConnection();
	   ((HttpURLConnection) conecti).setRequestMethod("GET");
	   conecti.connect();
	   int siz=((HttpURLConnection) conecti).getResponseCode();
	   System.out.println("this code is"+siz);
	   String sizz= ((HttpURLConnection) conecti).getResponseMessage();
	   System.out.println("this status is"+sizz);
	   InputStream iput=((HttpURLConnection) conecti).getInputStream();	
	   InputStreamReader readone = new InputStreamReader(iput);
	   BufferedReader readbuf = new BufferedReader(readone);
	   StringBuffer box= new StringBuffer();
	   String conten;
	  while((conten=readbuf.readLine())!=null)
	  {
		  box.append(conten);
		  System.out.println();
	  }
	  System.out.println(box);
	}
	
     public void puutmet() throws IOException
     {
    	 URL ur = new URL("	http://dummy.restapiexample.com/api/v1/create");
    	HttpURLConnection connect= (HttpURLConnection) ur.openConnection();
    	connect.setRequestMethod("POST");
    	connect.setRequestProperty("Content-Type", "application/json");
    	connect.setDoOutput(true);
    	
    	String jso =" {\"name\":\"naveenkumar\",\"salary\":\"25000\",\"age\":\"27\"}";
    	byte[] a =jso.getBytes();
    	
    	OutputStream ouou=  connect.getOutputStream();
    	ouou.write(a);
    	
    	int cood=connect.getResponseCode();
    	System.out.println("the code is : "+cood);
    	String sts=connect.getResponseMessage();
    	System.out.println("the status is :"+sts);
    	
    	InputStream in=connect.getInputStream();
    	InputStreamReader inn= new InputStreamReader(in);
    	BufferedReader readbuf = new BufferedReader(inn);
    	StringBuffer buf = new StringBuffer();
    	String lin;
    	while((lin=readbuf.readLine())!=null)
    	{
    		buf.append(lin);
    	}
    	System.out.println(buf);
     }
	
	public void upda() throws IOException
	{
		 URL ur = new URL("http://dummy.restapiexample.com/api/v1/update/26068");
	    	HttpURLConnection connect= (HttpURLConnection) ur.openConnection();
	    	connect.setRequestMethod("PUT");
	    	connect.setRequestProperty("Content-Type", "application/json");
	    	connect.setDoOutput(true);
	    	
	    	String jso =" {\"name\":\"naveenkumar\",\"salary\":\"25000\",\"age\":\"30\"}";
	    	byte[] a =jso.getBytes();
	    	
	    	OutputStream ouou=  connect.getOutputStream();
	    	ouou.write(a);
	    	
	    	int cood=connect.getResponseCode();
	    	System.out.println("the code is : "+cood);
	    	String sts=connect.getResponseMessage();
	    	System.out.println("the status is :"+sts);
	    	
	    	InputStream in=connect.getInputStream();
	    	InputStreamReader inn= new InputStreamReader(in);
	    	BufferedReader readbuf = new BufferedReader(inn);
	    	StringBuffer buf = new StringBuffer();
	    	String lin;
	    	while((lin=readbuf.readLine())!=null)
	    	{
	    		buf.append(lin);
	    	}
	    	System.out.println(buf);
	     }	

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Reatap aprest = new Reatap();
       aprest. puutmet();
       aprest.upda();
    	   
    	  
	}

}
