package de.mpi.webproxy.dao;

import java.net.URL;

/**
 * Created by MPi on 04.11.2014.
 */
public class HtmlPageQueueObj {
    public String url;
    public String htmlContent;

    public HtmlPageQueueObj(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }
}
