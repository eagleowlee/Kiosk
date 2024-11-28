package com.example.kiosk.Lv4;

import java.util.ArrayList;

public class Main_Lv4 {

    public static void main(String[] args) {
        ArrayList<MenuItem_Lv4> burgers = new ArrayList<>();

        MenuItem_Lv4 ShackBurger = new MenuItem_Lv4("ShackBurger", 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        //쉑버거 생성
        MenuItem_Lv4 SmokeShack = new MenuItem_Lv4("SmokeShack", 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        //스모크버거 생성
        MenuItem_Lv4 CheeseBurger = new MenuItem_Lv4("CheeseBurger", 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        //치즈버거 생성
        MenuItem_Lv4 Hamburger = new MenuItem_Lv4("Hamburger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거");
        //버거목록생성

        burgers.add(ShackBurger);
        //쉑버거 추가
        burgers.add(SmokeShack);
        //스모크쉑 추가
        burgers.add(CheeseBurger);
        //치즈버거 추가
        burgers.add(Hamburger);
        //햄버거 추가

        ArrayList<MenuItem_Lv4> drinks = new ArrayList<>();
        MenuItem_Lv4 Pepsi = new MenuItem_Lv4("Pepsi", 1.5, "달달한 콜라");
        MenuItem_Lv4 Cocacola = new MenuItem_Lv4("Cocacola", 1.5, "톡 쏘는 콜라");
        MenuItem_Lv4 ZeroPepsi = new MenuItem_Lv4("ZeroPepsi", 1.5, "다이어트 콜라");

        drinks.add(Pepsi);
        drinks.add(Cocacola);
        drinks.add(ZeroPepsi);
        //drinks에 펩시 추가
        //drinks에 코카콜라 추가
        //drinks에 제로펩시 추가

        ArrayList<MenuItem_Lv4> desserts = new ArrayList<>();
        MenuItem_Lv4 Icecream = new MenuItem_Lv4("Icecream", 1.0, "소프트한 아이스크림");
        MenuItem_Lv4 Coffee = new MenuItem_Lv4("Coffee", 2.0, "고급 원두로 만든 커피");
        MenuItem_Lv4 Smoothie = new MenuItem_Lv4("Smoothie", 3.5, "생과일로 만든 스무디");

        desserts.add(Icecream);
        desserts.add(Coffee);
        desserts.add(Smoothie);

        Menu_Lv4 burger = new Menu_Lv4("Burger",burgers);
        //메뉴 리스트에 버거 추가
        Menu_Lv4 drink = new Menu_Lv4("Drinks",drinks);
        //메뉴 리스트에 음료 추가
        Menu_Lv4 dessert = new Menu_Lv4("Desserts",desserts);
        //메뉴 리스트에 디저트 추가

        ArrayList<Menu_Lv4> menus = new ArrayList<>();
        //메뉴들이 담길 리스트 생성

        menus.add(burger);
        menus.add(drink);
        menus.add(dessert);





    //    Menu menu = new Menu();


        //키오스크 생성
        Kiosk_Lv4 kiosk = new Kiosk_Lv4(menus);


        //


       kiosk.start();
    }
}
