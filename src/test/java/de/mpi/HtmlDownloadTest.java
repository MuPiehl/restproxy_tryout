package de.mpi;

import de.mpi.webproxy.downloader.HtmlPageDownloader;
import de.mpi.webproxy.producer.HtmlPageProducer;
import junit.framework.TestCase;

/**
 * Created by MPi on 04.11.2014.
 */
public class HtmlDownloadTest extends TestCase {
    public void testMalformedUrl(){
        HtmlPageProducer htmlPageProducer = new HtmlPageProducer();
        htmlPageProducer.run();

        /*
        HtmlPageDownloader htmlPageDownloader = new HtmlPageDownloader();
        htmlPageDownloader.downloadAndPutInObj);

          */
    }
}
