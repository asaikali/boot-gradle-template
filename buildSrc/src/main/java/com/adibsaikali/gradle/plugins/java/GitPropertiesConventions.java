package com.adibsaikali.gradle.plugins.java;

import com.gorylenko.GitPropertiesPlugin;
import com.gorylenko.GitPropertiesPluginExtension;
import org.gradle.api.Project;

import java.util.List;

class GitPropertiesConventions {

    public void apply(Project project) {
        project.getPluginManager().apply(GitPropertiesPlugin.class);
        GitPropertiesPluginExtension git = project.getExtensions().getByType(GitPropertiesPluginExtension.class);
        git.setKeys(
                List.of(
                        "git.branch",
                        "git.build.version",
                        "git.closest.tag.commit.count",
                        "git.closest.tag.name",
                        "git.commit.id",
                        "git.commit.id.abbrev",
                        "git.commit.id.describe",
                        "git.commit.message.full",
                        "git.commit.message.short",
                        "git.commit.time",
                        "git.commit.user.email",
                        "git.commit.user.name",
                        "git.dirty",
                        "git.remote.origin.url",
                        "git.tags"
                )
        );

        git.setFailOnNoGitDirectory(true);
        git.getDotGitDirectory().set(project.getRootProject().getLayout().getProjectDirectory().dir(".git"));
        project.getLogger().info("GitProperties Plugin configured");
    }
}
