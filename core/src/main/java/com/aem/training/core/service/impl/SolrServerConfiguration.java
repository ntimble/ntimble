package com.aem.training.core.service.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import com.aem.training.core.configuration.SolrConfig;

@Component(service=SolrServerConfiguration.class)
@Designate(ocd=SolrConfig.class)
public class SolrServerConfiguration {
	
	private SolrConfig config;
    
    private String solrProtocol;
     
    private String solrServerName ;
 
    private String solrServerPort ;
 
    private String solrCoreName ;
     	
    private String contentPagePath ;
    
    @Activate
    public void activate(SolrConfig config) {
    	this.config = config;
    	
    	this.solrProtocol = config.protocolValue();
        this.solrServerName = config.serverName();
        this.solrServerPort = config.serverPort(); 
        this.solrCoreName = config.serverCollection(); 
        this.contentPagePath = config.serverPath(); 
    }
    
    public String getSolrProtocol() {
        return this.solrProtocol;
    }
     
    public String getSolrServerName() {
        return this.solrServerName;
    }
 
    public String getSolrServerPort() {
        return this.solrServerPort;
    }
 
    public String getSolrCoreName() {
        return this.solrCoreName;
    }
     
    public String getContentPagePath() {
        return this.contentPagePath;
    }
	

}
