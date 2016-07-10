package com.oliverlockwood.plugins.jenkinsfile.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.oliverlockwood.plugins.jenkinsfile.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class JenkinsFile extends PsiFileBase {
    public JenkinsFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, JenkinsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return JenkinsFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Jenkins File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}