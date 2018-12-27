package com.example.halex.rinkmanager.model;

public class Rink
{
    private int id;
    private String imageURL;
    private String location;
    private String companyName;
    private String schedule;
    private String price;

    public Rink(int id, String location, String companyName, String schedule, String price)
    {
        this.id = id;
        this.location = location;
        this.companyName = companyName;
        this.schedule = schedule;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getSchedule()
    {
        return schedule;
    }

    public void setSchedule(String schedule)
    {
        this.schedule = schedule;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    }
}
