package es.ulpgc.dacd.scraper.API;

import es.ulpgc.dacd.scraper.scraping.Scraper;

import java.io.IOException;

import static spark.Spark.get;

public class Api {
    public Api(String html) throws IOException {
       Scraper scrapper = new Scraper(html);
        get("/hotels", (req, res) -> scrapper.returnHotelsName());

        get("/hotels/:name", (req, res) -> {
            String name = req.params(":name");
            return scrapper.returnUbi(name);
        });

        get("/hotels/:name/services", (req, res) -> {
            String name = req.params(":name");
            return scrapper.returnServices(name);
        });

        get("/hotels/:name/comments", (req, res) -> {
            String name = req.params(":name");
            return scrapper.returnComments(name);
        });

        get("/hotels/:name/ratings", (req, res) -> {
            String name = req.params(":name");
            return scrapper.returnRatings(name);
        });
    }
}
