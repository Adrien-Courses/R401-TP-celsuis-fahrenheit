import fr.adriencaubel.controller.HelloServlet;
import fr.adriencaubel.controller.TemperatureConverterServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8810);

        tomcat.getConnector(); // obligatoire

        // pointer vers ton dossier webapp
        String webappDir = "src/main/webapp";
        Context ctx = tomcat.addWebapp("", new File(webappDir).getAbsolutePath());

        Tomcat.addServlet(ctx, "hello", new HelloServlet());
        ctx.addServletMappingDecoded("/hello", "hello");

        Tomcat.addServlet(ctx, "convert", new TemperatureConverterServlet());
        ctx.addServletMappingDecoded("/convert", "convert");


        System.out.println("App running at: http://localhost:8810/");

        tomcat.start();
        tomcat.getServer().await();
    }
}
