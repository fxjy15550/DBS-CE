package com.dbs.ce.entity;

import java.io.Serializable;

public class Course implements Serializable {
    private String cno;
    private String cname;
    private String cdept;
    private int ccredit;
    private String cinfo;
    private String cteacher;
    private String cdate;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdept() {
        return cdept;
    }

    public void setCdept(String cdept) {
        this.cdept = cdept;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    public String getCinfo() {
        return cinfo;
    }

    public void setCinfo(String cinfo) {
        this.cinfo = cinfo;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cdept='" + cdept + '\'' +
                ", ccredit=" + ccredit +
                ", cinfo='" + cinfo + '\'' +
                ", cteacher='" + cteacher + '\'' +
                ", cdate='" + cdate + '\'' +
                '}';
    }
}
