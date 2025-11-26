package com.mavenai.plugin;
import org.apache.maven.plugin.AbstractMojo;import org.apache.maven.plugins.annotations.Mojo;
@Mojo(name="errdebug")
public class ErrDebugMojo extends AbstractMojo { public void execute(){ getLog().info("MavenAI stub errdebug"); } }
