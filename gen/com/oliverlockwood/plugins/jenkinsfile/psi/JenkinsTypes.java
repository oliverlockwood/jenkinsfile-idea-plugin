// This is a generated file. Not intended for manual editing.
package com.oliverlockwood.plugins.jenkinsfile.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.oliverlockwood.plugins.jenkinsfile.psi.impl.*;

public interface JenkinsTypes {

  IElementType STEP = new JenkinsElementType("STEP");

  IElementType COMMENT = new JenkinsTokenType("COMMENT");
  IElementType CRLF = new JenkinsTokenType("CRLF");
  IElementType PARAMETER = new JenkinsTokenType("PARAMETER");
  IElementType STEP_KEY = new JenkinsTokenType("STEP_KEY");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == STEP) {
        return new JenkinsStepImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
