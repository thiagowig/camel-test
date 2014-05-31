package br.com.zaul.integration.camel;

import org.junit.Test;

public class FileIntegrationTest {

	private FileIntegrator fileIntegrator = new FileIntegrator();
	
	@Test
	public void testFiles() {
		fileIntegrator.integrate();
	}
}
