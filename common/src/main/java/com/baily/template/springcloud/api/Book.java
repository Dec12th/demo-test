package com.baily.template.springcloud.api;

import java.io.Serializable;

/**
 * @ClassName: Book
 * @Description:
 * @author:YB
 * @date:2018年01月18日 11:15
 */
public class Book implements Serializable {

    private static final long serialVersionUID = -3094481040667748304L;

    private String name;
    private Integer price;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
