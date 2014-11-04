package de.mpi.webproxy.producer;

import de.mpi.webproxy.dao.HtmlPageQueueObj;
import de.mpi.webproxy.downloader.HtmlPageDownloader;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by MPi on 04.11.2014.
 */
public class HtmlPageProducer implements Runnable {
    private Category log = Logger.getInstance(HtmlPageProducer.class);

    @Override
    public void run() {
        try {
            //todo    http://www.oracle.com/ Example tauschen
            URL oracle = new URL("http://www.oracle.com/");
               log.debug(oracle.toString());

            HtmlPageQueueObj htmlPageQueueObj = new HtmlPageDownloader().downloadAndPutInObj(oracle);
            log.debug(htmlPageQueueObj.htmlContent);

        } catch (MalformedURLException mue) {
            log.error(mue.getMessage());
        }
    }
}
