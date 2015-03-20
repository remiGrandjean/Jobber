package rest;
import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import bdd.InitBDD;

public class ServeurREST {
	public static void main(String[] args) {
		InitBDD.getInstance();
		URI baseUri = UriBuilder.fromUri("http://localhost/").port(9876)
				.build();
		ResourceConfig config = new ResourceConfig(jobberREST.class);
		JdkHttpServerFactory.createHttpServer(baseUri, config, true);
		System.out.println("Server started");
	}

}
