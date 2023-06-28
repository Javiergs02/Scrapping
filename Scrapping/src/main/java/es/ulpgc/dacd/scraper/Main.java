package es.ulpgc.dacd.scraper;

import es.ulpgc.dacd.scraper.API.Api;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String html = "https://www.booking.com/searchresults.es.html?ss=Gran+Canaria&ssne=Gran+Canaria&ssne_untouched=Gran+Canaria&label=gog235jc-1DCAEoggI46AdIClgDaEaIAQGYAQq4ARfIAQzYAQPoAQH4AQKIAgGoAgO4Ase-7psGwAIB0gIkYzQ2NTNiOWItOWQxYi00NzNjLWFiZDAtNDM3NmFiYjk5NDRi2AIE4AIB&sid=3ad47ddc19a55ad679fee7ce9077eb3e&aid=397594&lang=es&sb=1&src_elem=sb&src=searchresults&dest_id=754&dest_type=region&checkin=2023-09-02&checkout=2023-09-07&group_adults=2&no_rooms=1&group_children=0";
        Api api = new Api(html);
    }
}