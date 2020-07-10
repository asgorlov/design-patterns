package org.novaworld.creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        getWebsite().setName("Visit card website");
    }

    @Override
    void buildCms() {
        getWebsite().setCsm(Csm.WORDPRESS);
    }

    @Override
    void buildPrice() {
        getWebsite().setPrice(500);
    }
}