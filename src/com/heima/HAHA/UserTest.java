package com.heima.HAHA;

import java.util.ArrayList;

//①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，获得年
//龄大于等于 18 岁，并且性别为 “男”的 User，加入新的集合并返回。
// ②在 main 方法中完成以下功能：创建 5 个 User 对象并赋值，加入 ArrayList<User>
//集合中，调用 getUser 方法，并输出返回的新集合中所有元素信息，格式如下：
public class UserTest {
    public static void main(String[] args) {
        ArrayList<User>list=new ArrayList<User>();
        User us1=new User("张三",20,"男");
        User us2=new User("李四",25,"男");
        User us3=new User("小红",17,"女");
        User us4=new User("王五",16,"男");
        User us5=new User("小芬",20,"女");
        list.add(us1);
        list.add(us2);
        list.add(us3);
        list.add(us4);
        list.add(us5);
        ArrayList<User> user = getUser(list);
        for (int i = 0; i < user.size(); i++) {
            User user1 = user.get(i);
            System.out.println(user1.getName()+","+user1.getAge()+","+user1.getSex());
        }
    }
    public static ArrayList<User> getUser(ArrayList<User> list){
        ArrayList<User>array=new ArrayList<User>();
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getAge()>=18&&user.getSex().equals("男")){
                array.add(user);
            }
        }
        return array;
    }
}
