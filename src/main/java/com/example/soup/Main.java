package com.example.soup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
    public void getElements(){
      //  System.out.println(restTemplate.getForObject("https://www.w3schools.com/xml/xpath_syntax.asp", String.class));
        try {
            Document doc = Jsoup.connect("https://www.w3schools.com/xml/xpath_syntax.asp").get();
           // System.out.println("TITLE OF THE DOCUMENT: "+doc.attr("data-original-title"));
          //  System.out.println("TITLE OF THE DOCUMENT: "+doc.select("div p"));
         //   System.out.println(doc.select(".w3-bar-item.w3-button:not(.topnav-icons)"));
        //    System.out.println(doc.select(".left:nth-of-type(4) ~ a"));
            System.out.println(doc.select("#topnavbtn_tutorials"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
//"/python/default.asp"
//        Learn Python
//<a class="w3-bar-item w3-button" id="topnavbtn_tutorials" href="javascript:void(0);" onclick="w3_open_nav(&quot;tutorials&quot;)" title="Tutorials">MORE <i class="fa fa-caret-down" style="display: inline;"></i><i class="fa fa-caret-up" style="display:none"></i></a>