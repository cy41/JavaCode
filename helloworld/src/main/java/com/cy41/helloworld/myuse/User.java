package com.cy41.helloworld.myuse;

public class User {
    private String id;
    private String age;
    private String name;

    public User(){}
    public User(String id, String age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean compare(User user){
        return id.equals(user.getId())&&name.equals(user.getName())&&age.equals(user.getAge());
    }
}
