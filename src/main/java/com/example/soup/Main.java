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
//        Document doc = Jsoup.connect("https://www.w3schools.com/xml/xpath_syntax.asp").get();
//        Elements paragraphs = doc.select(".w3-bar.w3-left > .w3-bar-item.w3-button:not(.topnav-icons)");

        Document doc = Jsoup.connect("https://reporter-ua.com/world-news").get();
       // System.out.println(doc.select(".e-news-item-title > a"));
//        System.out.println(doc.select(".e-news-item-text"));
//        System.out.println(doc.select(".post-date"));
//        System.out.println(doc.select(".e-news-item-img > a > img"));
  //     System.out.println(doc.select(".field-item > p:nth-child(1) > strong:nth-child(1) > a:nth-child(1)"));
   //     System.out.println(doc.select(".field-items"));
        System.out.println(doc.select(".pager-item > a"));
//




//        for (Element link : paragraphs) {
//            System.out.println("Link: " + link.attr("href"));
//            System.out.println("Text: " + link.text());
//            System.out.println("Title: " + link.attr("title"));
        }
    }




//<a class="w3-bar-item w3-button" href="/html/default.asp" title="HTML Tutorial">HTML</a>
//
//https://reporter-ua.com/world-news
//
//        .pager-item > a странички номера
//        https://reporter-ua.com/world-news?page=
//        .e-news-item-title > a    все ссылки на articles
