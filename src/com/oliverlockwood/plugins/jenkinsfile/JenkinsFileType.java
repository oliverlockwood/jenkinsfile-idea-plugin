package com.oliverlockwood.plugins.jenkinsfile;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class JenkinsFileType extends LanguageFileType {
    public static final JenkinsFileType INSTANCE = new JenkinsFileType();

    private JenkinsFileType() {
    super(JenkinsLanguage.INSTANCE);
  }

    @NotNull
    @Override
    public String getName() {
       return "Jenkins file";
    }

    @NotNull
    @Override
    public String getDescription() {
       return "Jenkins language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return JenkinsIcons.FILE;
    }
}
