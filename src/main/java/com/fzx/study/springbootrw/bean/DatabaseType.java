package com.fzx.study.springbootrw.bean;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/19  16:54
 **/
public enum DatabaseType {
    master("write"), slave1("read1");


    DatabaseType(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DatabaseType{" +
                "name='" + name + '\'' +
                '}';
    }
}
