package br.com.zaul.integration.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileIntegrator {

	public void integrate() {
		try {
			CamelContext context = new DefaultCamelContext();
			context.addRoutes(this.createBuilder());
			
			context.start();
			Thread.sleep(1000);
			context.stop();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private RouteBuilder createBuilder() {
		return new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("file:C:\\Users\\thiago\\Documents\\files\\in?noop=true").
				to("file:C:\\Users\\thiago\\Documents\\files\\out");
			}
		};
	}
}
