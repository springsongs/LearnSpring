package io.github.springsongs;

public class BeanScope {
    public BeanScope(String beanScope){
        System.out.println(String.format("create BeanScope,{scope=%s},{this=%s}",beanScope,this));
    }
}
