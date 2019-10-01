package org.maven.custom;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.*;

/**
 * defaultPhase : phase
 * name : goal
 */
@Mojo(defaultPhase=LifecyclePhase.VALIDATE, name="hello")
public class Step003 extends AbstractMojo {
    
    public void execute() throws MojoExecutionException {

        getLog().info( "Hello Custom Mojo Maven Plugin" );
    }
}