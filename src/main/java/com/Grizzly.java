package com;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.servlet.WebappContext;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletRegistration;

public class Grizzly {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.createSimpleServer("/", 8080);
        WebappContext ctx = new WebappContext("app");
        ServletRegistration jerseyServlet = ctx.addServlet("jersey", ServletContainer.class);
        jerseyServlet.addMapping("/app/*");
        jerseyServlet.setInitParameter("javax.ws.rs.Application", "com.Application");
        jerseyServlet.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
        ctx.deploy(server);
        try {
            server.start();
            System.out.println("Press any key to stop the server");
            System.in.read();
        } finally {
            server.shutdownNow();
        }
    }
}

