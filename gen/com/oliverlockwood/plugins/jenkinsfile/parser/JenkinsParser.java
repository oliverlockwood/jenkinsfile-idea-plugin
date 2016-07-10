// This is a generated file. Not intended for manual editing.
package com.oliverlockwood.plugins.jenkinsfile.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.oliverlockwood.plugins.jenkinsfile.psi.JenkinsTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JenkinsParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == STEP) {
      r = step(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return jenkinsFile(b, l + 1);
  }

  /* ********************************************************** */
  // step|CRLF|COMMENT
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = step(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean jenkinsFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jenkinsFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "jenkinsFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (STEP_KEY PARAMETER) | STEP_KEY
  public static boolean step(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step")) return false;
    if (!nextTokenIs(b, STEP_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = step_0(b, l + 1);
    if (!r) r = consumeToken(b, STEP_KEY);
    exit_section_(b, m, STEP, r);
    return r;
  }

  // STEP_KEY PARAMETER
  private static boolean step_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "step_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STEP_KEY, PARAMETER);
    exit_section_(b, m, null, r);
    return r;
  }

}
