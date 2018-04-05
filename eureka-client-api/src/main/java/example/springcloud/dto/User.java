package example.springcloud.dto;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -7233238826463139634L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //省略getter和setter
    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
