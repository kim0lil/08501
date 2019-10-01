package org.maven.custom;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

public class Step002 extends AbstractMojo {
    
    public void execute() throws MojoExecutionException {

        getLog().info( "Hello Custom Mojo Maven Plugin" );
    }
}