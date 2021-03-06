/*
 * Sonar PL/SQL Plugin (Community)
 * Copyright (C) 2015-2016 Felipe Zorzo
 * mailto:felipebzorzo AT gmail DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.plsqlopen.api;

import java.util.ArrayList;
import java.util.List;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;

public enum PlSqlKeyword implements TokenType {
    ALL("all", true),
    ALTER("alter", true),
    AND("and", true),
    ANY("any", true),
    ARRAY("array", true),
    ARROW("arrow", true),
    AS("as", true),
    ASC("asc", true),
    AT("at", true),
    BEGIN("begin", true),
    BETWEEN("between", true),
    BY("by", true),
    CASE("case", true),
    CHECK("check", true),
    CLUSTERS("clusters", true),
    CLUSTER("cluster", true),
    COLAUTH("colauth", true),
    COLUMNS("columns", true),
    COMPRESS("compress", true),
    CONNECT("connect", true),
    CRASH("crash", true),
    CREATE("create", true),
    CURRENT("current", true),
    DECLARE("declare", true),
    DEFAULT("default", true),
    DELETE("delete", true),
    DESC("desc", true),
    DISTINCT("distinct", true),
    DROP("drop", true),
    ELSE("else", true),
    END("end", true),
    EXCEPTION("exception", true),
    EXCLUSIVE("exclusive", true),
    EXISTS("exists", true),
    FETCH("fetch", true),
    FORM("form", true),
    FOR("for", true),
    FROM("from", true),
    GOTO("goto", true),
    GRANT("grant", true),
    GROUP("group", true),
    HAVING("having", true),
    IDENTIFIED("identified", true),
    IF("if", true),
    IN("in", true),
    INDEXES("indexes", true),
    INDEX("index", true),
    INSERT("insert", true),
    INTERSECT("intersect", true),
    INTO("into", true),
    IS("is", true),
    LIKE("like", true),
    LOCK("lock", true),
    MINUS_KEYWORD("minus", true),
    MODE("mode", true),
    NOCOMPRESS("nocompress", true),
    NOT("not", true),
    NOWAIT("nowait", true),
    NULL("null", true),
    OF("of", true),
    ON("on", true),
    OPTION("option", true),
    OR("or", true),
    ORDER("order", true),
    OVERLAPS("overlaps", true),
    PRIOR("prior", true),
    PROCEDURE("procedure", true),
    PUBLIC("public", true),
    RANGE_KEYWORD("range", true),
    RECORD("record", true),
    RESOURCE("resource", true),
    REVOKE("revoke", true),
    SELECT("select", true),
    SHARE("share", true),
    SIZE("size", true),
    SQL("sql", true),
    START("start", true),
    SUBTYPE("subtype", true),
    TABAUTH("tabauth", true),
    THEN("then", true),
    TO("to", true),
    UNION("union", true),
    UNIQUE("unique", true),
    UPDATE("update", true),
    VALUES("values", true),
    VIEW("view", true),
    VIEWS("views", true),
    WHEN("when", true),
    WHERE("where", true),
    WITH("with", true),
    REF("ref", true),
    OUT("out", true),
    SET("set", true),
    BULK("bulk", true),
    
    // actually these keywords are reserved according the documentation, but Oracle accepts as identifiers in some situations
    TABLE("table"),
    DECIMAL("decimal"),
    TYPE("type"),
    USE("use"),

    // non reserved keywords
    NUMBER("number"),
    OTHERS("others"),
    CONSTANT("constant"),
    FALSE("false"),
    TRUE("true"),
    BFILE("bfile"),
    BLOB("blob"),
    CLOB("clob"),
    NCLOB("nclob"),
    BINARY_DOUBLE("binary_double"),
    BINARY_FLOAT("binary_float"),
    BINARY_INTEGER("binary_integer"),
    DEC("dec"),
    DOUBLE("double"),
    PRECISION("precision"),
    FLOAT("float"),
    INT("int"),
    INTEGER("integer"),
    NATURAL("natural"),
    NATURALN("naturaln"),
    NUMERIC("numeric"),
    PLS_INTEGER("pls_integer"),
    POSITIVE("positive"),
    POSITIVEN("positiven"),
    REAL("real"),
    SIGNTYPE("signtype"),
    SMALLINT("smallint"),
    CHAR("char"),
    CHARACTER("character"),
    LONG("long"),
    RAW("raw"),
    NCHAR("nchar"),
    NVARCHAR2("nvarchar2"),
    ROWID("rowid"),
    STRING("string"),
    UROWID("urowid"),
    VARCHAR("varchar"),
    VARCHAR2("varchar2"),
    BOOLEAN("boolean"),
    DATE("date"),
    ROWCOUNT("rowcount"),
    BULK_ROWCOUNT("bulk_rowcount"),
    COUNT("count"),
    FIRST("first"),
    LAST("last"),
    LIMIT("limit"),
    NEXT("next"),
    ELSIF("elsif"),
    LOOP("loop"),
    EXIT("exit"),
    CONTINUE("continue"),
    REVERSE("reverse"),
    WHILE("while"),
    RETURN("return"),
    NOCOPY("nocopy"),
    REPLACE("replace"),
    EXTERNAL("external"),
    AUTHID("authid"),
    CURRENT_USER("current_user"),
    DEFINER("definer"),
    LANGUAGE("language"),
    JAVA("java"),
    FUNCTION("function"),
    FOUND("found"),
    NOTFOUND("notfound"),
    ISOPEN("isopen"),
    COMMIT("commit"),
    WORK("work"),
    FORCE("force"),
    COMMENT("comment"),
    WRITE("write"),
    IMMEDIATE("immediate"),
    BATCH("batch"),
    WAIT("wait"),
    ROLLBACK("rollback"),
    SAVEPOINT("savepoint"),
    RAISE("raise"),
    PACKAGE("package"),
    BODY("body"),
    COLLECT("collect"),
    CURSOR("cursor"),
    ROWTYPE("rowtype"),
    THE("the"),
    DETERMINISTIC("deterministic"),
    EXECUTE("execute"),
    USING("using"),
    OPEN("open"),
    CLOSE("close"),
    PRAGMA("pragma"),
    AUTONOMOUS_TRANSACTION("autonomous_transaction"),
    EXCEPTION_INIT("exception_init"),
    SERIALLY_REUSABLE("serially_reusable"),
    TIMESTAMP("timestamp"),
    SKIP("skip"),
    LOCKED("locked"),
    NOCYCLE("nocycle"),
    SIBLINGS("siblings"),
    NULLS("nulls"),
    PIPELINED("pipelined"),
    PARTITION("partition"),
    UNBOUNDED("unbounded"),
    PRECEDING("preceding"),
    FOLLOWING("following"),
    ROW("row"),
    ROWS("rows"),
    OVER("over"),
    PIPE("pipe"),
    ANY_CS("any_cs"),
    CHARSET("charset"),
    EXTRACT("extract"),
    XMLSERIALIZE("xmlserialize"),
    DOCUMENT("document"),
    CONTENT("content"),
    ENCODING("encoding"),
    VERSION("version"),
    NO("no"),
    IDENT("ident"),
    HIDE("hide"),
    SHOW("show"),
    DEFAULTS("defaults"),
    CAST("cast"),
    MULTISET("multiset"),
    LOCAL("local"),
    TIME("time"),
    ZONE("zone"),
    XMLATTRIBUTES("xmlattributes"),
    SCHEMACHECK("schemacheck"),
    NOSCHEMACHECK("noschemacheck"),
    XMLELEMENT("xmlelement"),
    ENTITYESCAPING("entityescaping"),
    NOENTITYESCAPING("noentityescaping"),
    NAME("name"),
    EVALNAME("evalname"),
    XMLFOREST("xmlforest"),
    JOIN("join"),
    ROWNUM("rownum"),
    LEVEL("level"),
    SYSDATE("sysdate"),
    READ("read"),
    ONLY("only"),
    CONSTRAINT("constraint"),
    COLUMN("column"),
    OPERATOR("operator"),
    INDEXTYPE("indextype"),
    MATERIALIZED("materialized"),
    MINING("mining"),
    MODEL("model"),
    INNER("inner"),
    FULL("full"),
    LEFT("left"),
    RIGHT("right"),
    OUTER("outer"),
    CROSS("cross"),
    GLOBAL("global"),
    TEMPORARY("temporary"),
    PRESERVE("preserve"),
    SORT("sort"),
    ENCRYPT("encrypt"),
    MOD_KEYWORD("mod"),
    KEEP("keep"),
    DENSE_RANK("dense_rank"),
    INTERFACE("interface"),
    SQLERRM("sqlerrm");

    private final String value;
    private final boolean reserved;

    private PlSqlKeyword(String value) {
        this(value, false);
    }
    
    private PlSqlKeyword(String value, boolean reserved) {
        this.value = value;
        this.reserved = reserved;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public String getValue() {
        return value;
    }
    
    public boolean isReserved() {
        return reserved;
    }

    @Override
    public boolean hasToBeSkippedFromAst(AstNode node) {
        return false;
    }

    public static String[] keywordValues() {
        PlSqlKeyword[] keywordsEnum = PlSqlKeyword.values();
        String[] keywords = new String[keywordsEnum.length];
        for (int i = 0; i < keywords.length; i++) {
            keywords[i] = keywordsEnum[i].getValue();
        }
        return keywords;
    }
    
    public static List<PlSqlKeyword> getNonReservedKeywords() {
        PlSqlKeyword[] keywordsEnum = PlSqlKeyword.values();
        List<PlSqlKeyword> keywords = new ArrayList<>();
        for (PlSqlKeyword keyword : keywordsEnum) {
            if (!keyword.isReserved()) {
                keywords.add(keyword);
            }
        }
        return keywords;
    }
}
