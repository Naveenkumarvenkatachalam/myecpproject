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

public class Resrust {
	
	public void getmemet() throws IOException
	{
		URL url = new URL("	http://dummy.restapiexample.com/api/v1/employees");
		URLConnection  conneurl=url.openConnection();

		((HttpURLConnection) conneurl).setRequestMethod("GET");
		conneurl.connect();
		int cod=((HttpURLConnection) conneurl).getResponseCode();
		System.out.println("the status code is: "+cod);
		String msg=((HttpURLConnection) conneurl).getResponseMessage();
		System.out.println("the status message is: "+msg);
		
		InputStream in=conneurl.getInputStream();
		InputStreamReader rea = new InputStreamReader(in);
		BufferedReader burea = new BufferedReader(rea);
		StringBuffer stbuf = new StringBuffer();
		String linw;
		while((linw=burea.readLine())!=null)
		{
			stbuf.append(linw);
		}
		System.out.println(stbuf);
	}
	public void posmeth() throws IOException
	{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		URLConnection ciut= url.openConnection();
		
		((HttpURLConnection) ciut).setRequestMethod("POST");
		ciut.setRequestProperty("Content-Type","application/json");
		ciut.setDoOutput(true);
		ciut.connect();
		String jfile="{\"name\":\"naveenkumar\",\"salary\":\"25000\",\"age\":\"27\"}";
		byte[] b =jfile.getBytes();
		OutputStream ouwr=ciut.getOutputStream();
		ouwr.write(b);
		int sizz=((HttpURLConnection) ciut).getResponseCode();
		System.out.println("the sts code is"+sizz);
		String mmmsg=((HttpURLConnection) ciut).getResponseMessage();
		System.out.println("the msg sts is"+mmmsg);
		
		InputStream  in=ciut.getInputStream();
		InputStreamReader re = new InputStreamReader(in);
		BufferedReader bure = new BufferedReader(re);
		StringBuffer buff = new StringBuffer();
		String ll;
		while((ll=bure.readLine())!=null)
		{
			buff.append(ll);
		}
		System.out.println(buff);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     Resrust obj = new Resrust();
     obj.posmeth();
	}

}
