package com.example.board;

import java.util.Date;

public class BoardVO {
    private int seq;
    private String title;
    private String writer;
    private String category;
    private String content;
    private Date regdate;

    public int getSeq() {return seq;}
    public void setSeq(int seq) {this.seq = seq;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}
    public String getWriter() {return writer;}
    public void setWriter(String writer) {this.writer = writer;}
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public Date getRegdate() {return regdate;}
    public void setRegdate(Date regdate) {this.regdate = regdate;}
}
