// This is a generated file. Not intended for manual editing.
package com.oliverlockwood.plugins.jenkinsfile.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.oliverlockwood.plugins.jenkinsfile.psi.JenkinsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.oliverlockwood.plugins.jenkinsfile.psi.*;

public class JenkinsStepImpl extends ASTWrapperPsiElement implements JenkinsStep {

  public JenkinsStepImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsVisitor visitor) {
    visitor.visitStep(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsVisitor) accept((JenkinsVisitor)visitor);
    else super.accept(visitor);
  }

}
