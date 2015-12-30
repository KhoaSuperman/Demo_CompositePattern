package com.khoaha;

public class Main {

    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag bodyTag = new HtmlParentElement("<body>");
        bodyTag.setStartTag("<body>");
        bodyTag.setEndTag("</body>");

        HtmlTag h1Tag = new HtmlElement("<h1>");
        h1Tag.setStartTag("<h1>");
        h1Tag.setEndTag("</h1>");
        h1Tag.setTagBody("This is H1 Body");

        HtmlTag h2Tag = new HtmlElement("<h2>");
        h2Tag.setStartTag("<h2>");
        h2Tag.setEndTag("</h2>");
        h2Tag.setTagBody("This is H2 Body");

        //add child tags
        parentTag.addChildTag(bodyTag);
        bodyTag.addChildTag(h1Tag);
        bodyTag.addChildTag(h2Tag);

        //generate html
        parentTag.generateHtml();
    }
}
