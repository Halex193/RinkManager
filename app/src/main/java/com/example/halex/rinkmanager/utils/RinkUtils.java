package com.example.halex.rinkmanager.utils;

import com.example.halex.rinkmanager.model.Rink;

import java.util.ArrayList;
import java.util.List;

public class RinkUtils
{
    public static List<Rink> getRinks()
    {
        List<Rink> rinkList = new ArrayList<>(5);
        Rink imageRink = new Rink(
                0,
                "Centru",
                "Tursib",
                "În fiecare zi între orele 10-14",
                "10 RON"
        );
        imageRink.setImageURL("https://s3-eu-west-1.amazonaws.com/images.dailyinformation.co.uk/venue/d95e9cf5-b1a3-4040-89e8-fcebcf1c9070/3b4b8cc110e6a4979f280bba47eab4d9");
        rinkList.add(imageRink);
        Rink rink2 = new Rink(
                0,
                "Parc",
                "Tursib",
                "În fiecare zi între orele 11-15",
                "15 RON"
        );
        rink2.setImageURL("https://customicerinks.com/img/rinks/arena/standrew_spot.jpg");
        rinkList.add(rink2);
        return rinkList;
    }
}
