package de.mpi.webproxy.downloader;

import de.mpi.webproxy.dao.HtmlPageQueueObj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by MPi on 04.11.2014.
 */
public class HtmlPageDownloader {
    public HtmlPageQueueObj downloadAndPutInObj(URL url) {
        StringBuffer htmlContent = new StringBuffer();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                htmlContent.append(inputLine);
            in.close();
        } catch (IOException e) {
            //todo System.err gegen log tauschen
            System.err.println("Error: " + e.getMessage());
        }


        return new HtmlPageQueueObj(url.toString(), htmlContent.toString());
    }
}
