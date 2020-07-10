package org.novaworld.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        getWebsite().setName("Enterprise website");
    }

    @Override
    void buildCms() {
        getWebsite().setCsm(Csm.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        getWebsite().setPrice(10000);
    }
}