package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;

public class HttpHelper {
	public static String HttpUserReg(String urlStr, JsonObject jsonObj, String operation)
			throws Exception {
		// String URLStr = "http://einstein.sv.cmu.edu:9000/addContestUser";

        if (operation.equals("post")) {
            System.out.println("Reached inside post");
            return httpPost(urlStr, jsonObj.toString());
        }
        else if (operation.equals("get")) {
            System.out.println("Reached inside get");
            return httpGet(urlStr);
        } else if  (operation.equals("delete")) {
            System.out.println("Reached inside delete");
            return httpDelete(urlStr);
        }
        return null;
	}

	public static String httpPost(String urlStr,
                                  String jsonString) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");
        conn.setDoOutput(true);

        // Create the form content
        OutputStream out = conn.getOutputStream();
        Writer writer = new OutputStreamWriter(out, "UTF-8");

        writer.write(jsonString);

        writer.close();
        out.close();

        return getHttpResponse(conn, 200);
	}

    public static String httpPostText(String urlStr,
                                      String textString) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "text/plain");
        conn.setRequestProperty("Accept", "application/json");
        conn.setDoOutput(true);

        // Create the form content
        OutputStream out = conn.getOutputStream();
        Writer writer = new OutputStreamWriter(out, "UTF-8");

        writer.write(textString);

        writer.close();
        out.close();

        return getHttpResponse(conn, 200);
    }
	public static String httpDelete(String urlStr)
			throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        // conn.setRequestProperty("Content-Type", "application/json");
        // conn.setRequestProperty("Accept", "application/json");
        conn.setDoOutput(true);

        conn.connect();
        return getHttpResponse(conn, 201);
	}

    public static String httpGet(String urlStr)
            throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);

        conn.connect();

        return getHttpResponse(conn, 200);
    }

    private static String getHttpResponse(HttpURLConnection conn, int expectedReturnCode) throws IOException {
        System.out.println("response code:" + conn.getResponseMessage());
        if (conn.getResponseCode() != expectedReturnCode) {
            System.out.println("Custom Error:" + conn.getResponseCode());
            throw new IOException(conn.getResponseMessage());
        }

        // Buffer the result into a string
        BufferedReader rd = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();

        conn.disconnect();
        return sb.toString();
    }
}