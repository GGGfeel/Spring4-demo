package com.maven.Spring.Controller;

import lombok.Data;

/**
 * @author jingdu
 * @date 2019/1/23
 */
@Data
public class HelloWorld extends Object{

    private String name;

    private String id;

    private String age;

    public void hello(){
        String res = "name： "+ name + " id: " + id + " age: "+ age;
        System.out.println(res);
    }

}
