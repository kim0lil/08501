package org.maven.custom;

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

        getLog().info( "Hello Custom Mojo Maven Plugin - "+environment);	 
    }

}