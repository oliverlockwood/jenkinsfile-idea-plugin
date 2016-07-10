package com.oliverlockwood.plugins.jenkinsfile;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class JenkinsLexerAdapter extends FlexAdapter {
    public JenkinsLexerAdapter() {
        super(new JenkinsLexer((Reader) null));
    }
}
