package com.noon.a7pets.models;

import java.io.Serializable;

/**
 * Created by kshitij on 19/1/18.
 */

public class SingleProductModel implements Serializable {

    private String prid;
    private String no_of_items;
    private String useremail, usermobile, prname, prprice, primage, prdesc, message_header, message_body;

    public SingleProductModel() {
    }

    public SingleProductModel(String prid,
                              String no_of_items,
                              String prname,
                              String prprice,
                              String primage,
                              String prdesc) {
        this.prid = prid;
        this.no_of_items = no_of_items;
        this.prname = prname;
        this.prprice = prprice;
        this.primage = primage;
        this.prdesc = prdesc;
    }

    public SingleProductModel(String prid,
                              String no_of_items,
                              String prname,
                              String prprice,
                              String primage,
                              String prdesc,
                              String message_header,
                              String message_body) {
        this.prid = prid;
        this.no_of_items = no_of_items;
        this.prname = prname;
        this.prprice = prprice;
        this.primage = primage;
        this.prdesc = prdesc;
        this.message_header = message_header;
        this.message_body = message_body;
    }

    public SingleProductModel(String prid,
                              String useremail,
                              String usermobile,
                              String prname,
                              String prprice,
                              String primage,
                              String prdesc,
                              String message_header,
                              String message_body) {
        this.prid = prid;
        this.useremail = useremail;
        this.usermobile = usermobile;
        this.prname = prname;
        this.prprice = prprice;
        this.primage = primage;
        this.prdesc = prdesc;
        this.message_header = message_header;
        this.message_body = message_body;
    }

    public SingleProductModel(String prid,
                              String no_of_items,
                              String useremail,
                              String usermobile,
                              String prname,
                              String prprice,
                              String primage,
                              String prdesc,
                              String message_header,
                              String message_body) {
        this.prid = prid;
        this.no_of_items = no_of_items;
        this.useremail = useremail;
        this.usermobile = usermobile;
        this.prname = prname;
        this.prprice = prprice;
        this.primage = primage;
        this.prdesc = prdesc;
        this.message_header = message_header;
        this.message_body = message_body;
    }

    public String getMessage_header() {
        return message_header;
    }

    public void setMessage_header(String message_header) {
        this.message_header = message_header;
    }

    public String getMessage_body() {
        return message_body;
    }

    public void setMessage_body(String message_body) {
        this.message_body = message_body;
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile;
    }

    public String getNo_of_items() {
        return no_of_items;
    }

    public void setNo_of_items(String no_of_items) {
        this.no_of_items = no_of_items;
    }

    public String getPrdesc() {
        return prdesc;
    }

    public void setPrdesc(String prdesc) {
        this.prdesc = prdesc;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public String getPrprice() {
        return prprice;
    }

    public void setPrprice(String prprice) {
        this.prprice = prprice;
    }

    public String getPrimage() {
        return primage;
    }

    public void setPrimage(String primage) {
        this.primage = primage;
    }
}
