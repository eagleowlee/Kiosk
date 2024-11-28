package com.example.kiosk.Lv5;

import java.util.ArrayList;

public class Main_Lv5 {

    public static void main(String[] args) { //Main 문 키오스크가 실행되는 곳이라 psvm 사용
        ArrayList<MenuItem_Lv5> burgers = new ArrayList<>(); //버거종류가 담길 버거들의 배열을 생성

        MenuItem_Lv5 ShackBurger = new MenuItem_Lv5("ShackBurger", 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        //쉑버거 생성
        MenuItem_Lv5 SmokeShack = new MenuItem_Lv5("SmokeShack", 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        //스모크버거 생성
        MenuItem_Lv5 CheeseBurger = new MenuItem_Lv5("CheeseBurger", 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        //치즈버거 생성
        MenuItem_Lv5 Hamburger = new MenuItem_Lv5("Hamburger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거");
        //버거목록생성

        burgers.add(ShackBurger);
        //쉑버거 추가
        burgers.add(SmokeShack);
        //스모크쉑 추가
        burgers.add(CheeseBurger);
        //치즈버거 추가
        burgers.add(Hamburger);
        //햄버거 추가

        ArrayList<MenuItem_Lv5> drinks = new ArrayList<>(); //음료들이 담길 음료배열 생성
        MenuItem_Lv5 Pepsi = new MenuItem_Lv5("Pepsi", 1.5, "달달한 콜라");
        MenuItem_Lv5 Cocacola = new MenuItem_Lv5("Cocacola", 1.5, "톡 쏘는 콜라");
        MenuItem_Lv5 ZeroPepsi = new MenuItem_Lv5("ZeroPepsi", 1.5, "다이어트 콜라");
        //음료 생성

        drinks.add(Pepsi);
        drinks.add(Cocacola);
        drinks.add(ZeroPepsi);
        //drinks에 펩시 추가
        //drinks에 코카콜라 추가
        //drinks에 제로펩시 추가

        ArrayList<MenuItem_Lv5> desserts = new ArrayList<>(); // 디져트들이  담길 디져트 리스트 생성
        MenuItem_Lv5 Icecream = new MenuItem_Lv5("Icecream", 1.0, "소프트한 아이스크림");
        MenuItem_Lv5 Coffee = new MenuItem_Lv5("Coffee", 2.0, "고급 원두로 만든 커피");
        MenuItem_Lv5 Smoothie = new MenuItem_Lv5("Smoothie", 3.5, "생과일로 만든 스무디");
        //디져트 생성
        desserts.add(Icecream);
        desserts.add(Coffee);
        desserts.add(Smoothie);
        //디져트 추가

        Menu_Lv5 burger = new Menu_Lv5("Burgers",burgers);
        //메뉴 리스트에 버거배열 추가
        Menu_Lv5 drink = new Menu_Lv5("Drinks",drinks);
        //메뉴 리스트에 음료배열 추가
        Menu_Lv5 dessert = new Menu_Lv5("Desserts",desserts);
        //메뉴 리스트에 디저트배열 추가

        ArrayList<Menu_Lv5> menus = new ArrayList<>();
        //Burgers < 버거 배열, 음료배열 , 디져트 배열이 담길 메뉴'즈' 생성

        menus.add(burger);
        menus.add(drink);
        menus.add(dessert);
        //메뉴'즈'에 버거,음료,디져트 추가







        //키오스크 생성
        Kiosk_Lv5 kiosk = new Kiosk_Lv5(menus);



       kiosk.getStart();
       //키오스크실행 Lv5 해설 실수에 대한 잔재물
    }
}
