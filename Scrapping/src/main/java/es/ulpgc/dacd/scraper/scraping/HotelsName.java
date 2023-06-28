package es.ulpgc.dacd.scraper.scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class HotelsName {

    private Document doc;
    Map<String, String> map = new HashMap<>();


    public HotelsName(String html) throws IOException {
        Hotels hotels = new Hotels();
        doc = Jsoup.connect(html).userAgent("Chrome5.0").get();
        Elements id = doc.getElementsByClass("a4225678b2");
        for(Element e:id){
            hotels.setName(e.getElementsByClass("fcab3ed991 a23c043802").text(),
                    e.getElementsByTag("a").attr("href"));
            map.put(hotels.getName(), hotels.getHtml());
        }
    }
    public Map<String, String> getHotelsName() {
        return map;
    }
}
