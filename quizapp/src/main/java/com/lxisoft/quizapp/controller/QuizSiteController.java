package com.lxisoft.quizapp.controller;

import java.util.List;

import com.lxisoft.quizapp.model.Site;
import com.lxisoft.quizapp.repository.SqlRepository;


public class QuizSiteController {

    private SqlRepository<Site> siteTable;

    public QuizSiteController() {

        try {

            this.siteTable = new SqlRepository<>(Site.class);

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void setName(String name) {

        Site site = new Site();
        
        site.setName(name);
        
        if(this.siteTable.retrieve().size() == 0) {

            this.siteTable.create(site);
        }
        else {

            Site siteUpdate = this.siteTable.retrieve().get(0);
            siteUpdate.setName(name);;
            this.siteTable.update(siteUpdate);
        }
    }

    public void setHelp(String help) {

        Site site = new Site();
        
        site.setHelp(help);
        
        if(this.siteTable.retrieve().size() == 0) {

            this.siteTable.create(site);
        }
        else {

            Site siteUpdate = this.siteTable.retrieve().get(0);
            siteUpdate.setHelp(help);
            this.siteTable.update(siteUpdate);
        }

    }

    public void setAbout(String about) {

        Site site = new Site();

        site.setAbout(about);
        
        if(this.siteTable.retrieve().size() == 0) {

            this.siteTable.create(site);
        }
        else {

            Site siteUpdate = this.siteTable.retrieve().get(0);
            siteUpdate.setAbout(about);    
            this.siteTable.update(siteUpdate);
        }

    }

    public String getName() {

        List<Site> site = this.siteTable.retrieve();

        return site.get(0).getName();
    }

    public String getHelp() {

        List<Site> site = this.siteTable.retrieve();

        return site.get(0).getHelp();
    }

    public String getAbout() {

        List<Site> site = this.siteTable.retrieve();

        return site.get(0).getAbout();
    }
}