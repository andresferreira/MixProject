package com.java.mix.project;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s = "<p>My paragraph.</p>";
        System.out.println(StringEscapeUtils.escapeHtml4(s));
    }}
