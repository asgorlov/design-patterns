package org.novaworld.creational.builder;

public class Director {
    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder websiteBuilder) {
        this.builder = websiteBuilder;
    }

    public Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }
}