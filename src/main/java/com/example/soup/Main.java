package com.example.soup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class Main {
    @Autowired
    RestTemplate restTemplate;

    @Scheduled(fixedRate = 30000)
    public void getElements() throws IOException {
        Document doc = Jsoup.connect("https://www.w3schools.com/xml/xpath_syntax.asp").get();
        Elements paragraphs = doc.select(".w3-bar-item.w3-button:not(.topnav-icons)");
        for (Element link : paragraphs) {
            System.out.println("Link: " + link.attr("href"));
            System.out.println("Text: " + link.text());
            System.out.println("Title: " + link.attr("title"));
        }
    }

}


//<a class="w3-bar-item w3-button" href="/html/default.asp" title="HTML Tutorial">HTML</a>