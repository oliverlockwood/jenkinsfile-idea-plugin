package com.oliverlockwood.plugins.jenkinsfile;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class JenkinsFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(JenkinsFileType.INSTANCE, new ExactFileNameMatcher("Jenkinsfile"));
    }
}
