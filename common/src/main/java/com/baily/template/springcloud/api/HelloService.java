package com.baily.template.springcloud.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.UnsupportedEncodingException;

/**
 * @ClassName: HelloService
 * @Description:
 * @author:YB
 * @date:2018年01月18日 12:02
 */
@RequestMapping("/hs2")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index();

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public Book index2(@RequestHeader("name") String name, @RequestHeader("author") String author, @RequestHeader("price")  Integer price) throws UnsupportedEncodingException ;

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String index3(@RequestBody Book book) throws UnsupportedEncodingException;
}
