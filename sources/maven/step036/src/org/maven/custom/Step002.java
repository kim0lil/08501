package org.maven.custom;

import java.io.IOException;
import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.*;

/**
 * defaultPhase : phase
 * name : goal
 * @phase=validate
 * @goal=hello
 */
@Mojo(defaultPhase=LifecyclePhase.VALIDATE, name="hello")
public class Step002 extends AbstractMojo {

    @Parameter( property = "environment", defaultValue = "dev" )
    private String environment;
    
    public void execute() throws MojoExecutionException {

        Properties props = new Properties();
		 
        try {

           props.load(ClassLoader.getSystemClassLoader().getResourceAsStream("org/prop_"+environment+"/application.properties"));

       } catch (IOException e) {
           e.printStackTrace();
       }
        
        getLog().info( "Hello Custom Mojo Maven Plugin - "+props.getProperty("myName"));	 
    }

}