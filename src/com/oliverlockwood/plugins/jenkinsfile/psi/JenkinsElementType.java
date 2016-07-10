package com.oliverlockwood.plugins.jenkinsfile.psi;

import com.intellij.psi.tree.IElementType;
import com.oliverlockwood.plugins.jenkinsfile.JenkinsLanguage;
import org.jetbrains.annotations.*;

public class JenkinsElementType extends IElementType {
    public JenkinsElementType(@NotNull @NonNls String debugName) {
        super(debugName, JenkinsLanguage.INSTANCE);
    }
}