package com.aem.training.core.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestServletTest {
	
	@Mock
	private ResourceResolver resolver;
	
	@Mock
	private SlingHttpServletRequest req;
	
	@Mock
	private SlingHttpServletResponse resp;
	
	@Mock 
    private Resource resource;
	
	@Mock
	private PrintWriter writer;
	
	@InjectMocks
	private TestServlet testServlet;  
	
	@Before
	public void setup() throws IOException {
		MockitoAnnotations.initMocks(this);
		Mockito.when(req.getParameter("path")).thenReturn("/content/training");
		Mockito.when(req.getResourceResolver()).thenReturn(resolver);
		Mockito.when(resolver.getResource("/content/training")).thenReturn(resource);
		Mockito.doNothing().when(resp).setContentType("text/plain");
		Mockito.when(resp.getWriter()).thenReturn(writer);
		Mockito.when(resource.getName()).thenReturn("training");
		Mockito.doNothing().when(writer).write("Title = training");
		
		
		
		
	}
	
	@Test
	public void doGetTest() throws ServletException, IOException {
		testServlet.doGet(req,resp);
		
		
		
	}
	
	
	
	

}
