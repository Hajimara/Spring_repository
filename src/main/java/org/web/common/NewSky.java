package org.web.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NewSky {
//
//	public String newSky(String x,String y){
//		try {
//			StringBuilder urlBuilder = new StringBuilder("http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastVersionCheck"); /*URL*/
//		    urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=����Ű"); /*Service Key*/
//		    urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("TEST_SERVICE_KEY", "UTF-8")); /*���� ����*/
//		    urlBuilder.append("&" + URLEncoder.encode("ftype","UTF-8") + "=" + URLEncoder.encode("ODAM", "UTF-8")); /*���ϱ��� -ODAM: ���׿�����Ȳ -VSRT: ���׿����ʴܱ� -SHRT: ���׿����ܱ�*/
//		    urlBuilder.append("&" + URLEncoder.encode("basedatetime","UTF-8") + "=" + URLEncoder.encode("2015112030800", "UTF-8")); /*������ base_time �� �˻� �����ڷ� ����*/
//		    URL url = new URL(urlBuilder.toString());
//		    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//		    conn.setRequestMethod("GET");
//		    conn.setRequestProperty("Content-type", "application/json");
//		    System.out.println("Response code: " + conn.getResponseCode());
//		    BufferedReader rd;
//		    if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//		        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//		    } else {
//		        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//		    }
//		    StringBuilder sb = new StringBuilder();
//		    String line;
//		    while ((line = rd.readLine()) != null) {
//		        sb.append(line);
//		    }
//		    rd.close();
//		    conn.disconnect();
//		    System.out.println(sb.toString());
//			
//		}catch(Exception e) {
//		
//	}
//		return "";
}
