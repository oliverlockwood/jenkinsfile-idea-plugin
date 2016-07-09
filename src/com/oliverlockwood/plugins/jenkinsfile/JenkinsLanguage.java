package com.oliverlockwood.plugins.jenkinsfile;

import com.intellij.lang.Language;

public class JenkinsLanguage extends Language {
    public static final JenkinsLanguage INSTANCE = new JenkinsLanguage();

    private JenkinsLanguage() {
        super("Jenkins");
    }
}
