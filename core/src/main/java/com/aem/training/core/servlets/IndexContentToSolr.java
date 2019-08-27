package com.aem.training.core.servlets;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;



@Component(service=Servlet.class,
property= {Constants.SERVICE_DESCRIPTION +"=Solr Index Servlet",
"sling.servlet.methods="+ HttpConstants.METHOD_GET,
"sling.servlet.paths="+ "/bin/solr/push/pages"})
public class IndexContentToSolr extends SlingSafeMethodsServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(SlingHttpServletRequest req,SlingHttpServletResponse resp) {
		
	}

	 
}
