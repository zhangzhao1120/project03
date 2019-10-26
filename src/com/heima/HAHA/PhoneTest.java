package com.heima.HAHA;

import java.util.ArrayList;

//定义public static ArrayList<Phone> filter(ArrayList<Phone> list,double price) {...}方法:
//    要求：遍历list集合，将list中价格大于参数price的元素存入到另一个ArrayList<Phone> 中并返回
//    ② 在main方法内完成以下要求:
//     a.根据以下内容创建并初始化3个Phone对象
//         {"小米MIX2",2999,"新机皇"}
//         {"Iphone8", 5888,"火爆新机"}
//         {"VIVO X9s",1998,"火爆新机"}
//     b.创建一个ArrayList<Phone> list_phone，将上面的3个Phone对象添加到list_phone中，
// 调用filter方法传入list_phone和2000，根据返回的list集合输出所有元素信息
public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone>list=new ArrayList<Phone>();
        Phone p1=new Phone("小米MIX2",2999,"新机皇");
        Phone p2=new Phone("Iphone8", 5888,"火爆新机");
        Phone p3=new Phone("VIVO X9s",1998,"火爆新机");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phones = filter(list, 2000);
        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            System.out.println(phone.getName()+","+phone.getPrice()+","+phone.getType());
        }
    }
    public static ArrayList<Phone> filter(ArrayList<Phone> list,double price){
        ArrayList<Phone>array=new ArrayList<Phone>();
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            if(phone.getPrice()>price){
                array.add(phone);
            }
        }
        return array;
    }
}
