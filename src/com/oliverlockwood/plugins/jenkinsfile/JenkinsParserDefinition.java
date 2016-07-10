package com.oliverlockwood.plugins.jenkinsfile;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import com.oliverlockwood.plugins.jenkinsfile.parser.JenkinsParser;
import com.oliverlockwood.plugins.jenkinsfile.psi.*;
import org.jetbrains.annotations.NotNull;

public class JenkinsParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(JenkinsTypes.COMMENT);

    public static final IFileElementType FILE =
            new IFileElementType(Language.<JenkinsLanguage>findInstance(JenkinsLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new JenkinsLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new JenkinsParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new JenkinsFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return JenkinsTypes.Factory.createElement(node);
    }
}