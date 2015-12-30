package com.khoaha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HoangAnhKhoa on 12/29/15.
 */
public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childTags;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childTags = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childTags.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        childTags.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childTags;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag tag : childTags) {
            tag.generateHtml();
        }
        System.out.println(endTag);
    }
}
