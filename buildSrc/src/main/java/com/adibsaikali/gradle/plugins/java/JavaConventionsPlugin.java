package com.adibsaikali.gradle.plugins.java;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

abstract public class JavaConventionsPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        new GitPropertiesConventions().apply(project);
        new SpotlessConventions().apply(project);
        new JavaConventions().apply(project);
    }
}

