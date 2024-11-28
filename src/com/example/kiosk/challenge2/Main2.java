package com.example.kiosk.challenge2;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) { //Main 문 키오스크가 실행되는 곳이라 psvm 사용
        ArrayList<MenuItem2> burgers = new ArrayList<>(); //버거종류가 담길 버거들의 배열을 생성

        MenuItem2 ShackBurger = new MenuItem2("ShackBurger", 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        //쉑버거 생성
        MenuItem2 SmokeShack = new MenuItem2("SmokeShack", 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        //스모크버거 생성
        MenuItem2 CheeseBurger = new MenuItem2("CheeseBurger", 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        //치즈버거 생성
        MenuItem2 Hamburger = new MenuItem2("Hamburger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거");
        //버거목록생성

        burgers.add(ShackBurger);
        //쉑버거 추가
        burgers.add(SmokeShack);
        //스모크쉑 추가
        burgers.add(CheeseBurger);
        //치즈버거 추가
        burgers.add(Hamburger);
        //햄버거 추가

        ArrayList<MenuItem2> drinks = new ArrayList<>(); //음료들이 담길 음료배열 생성
        MenuItem2 Pepsi = new MenuItem2("Pepsi", 1.5, "달달한 콜라");
        MenuItem2 Cocacola = new MenuItem2("Cocacola", 1.5, "톡 쏘는 콜라");
        MenuItem2 ZeroPepsi = new MenuItem2("ZeroPepsi", 1.5, "다이어트 콜라");
        //음료 생성

        drinks.add(Pepsi);
        drinks.add(Cocacola);
        drinks.add(ZeroPepsi);
        //drinks에 펩시 추가
        //drinks에 코카콜라 추가
        //drinks에 제로펩시 추가

        ArrayList<MenuItem2> desserts = new ArrayList<>(); // 디져트들이  담길 디져트 리스트 생성
        MenuItem2 Icecream = new MenuItem2("Icecream", 1.0, "소프트한 아이스크림");
        MenuItem2 Coffee = new MenuItem2("Coffee", 2.0, "고급 원두로 만든 커피");
        MenuItem2 Smoothie = new MenuItem2("Smoothie", 3.5, "생과일로 만든 스무디");
        //디져트 생성
        desserts.add(Icecream);
        desserts.add(Coffee);
        desserts.add(Smoothie);
        //디져트 추가

        Menu2 burger = new Menu2("Burgers",burgers);
        //메뉴 리스트에 버거배열 추가
        Menu2 drink = new Menu2("Drinks",drinks);
        //메뉴 리스트에 음료배열 추가
        Menu2 dessert = new Menu2("Desserts",desserts);
        //메뉴 리스트에 디저트배열 추가

        ArrayList<Menu2> menus = new ArrayList<>();
        //Burgers < 버거 배열, 음료배열 , 디져트 배열이 담길 메뉴'즈' 생성

        menus.add(burger);
        menus.add(drink);
        menus.add(dessert);
        //메뉴'즈'에 버거,음료,디져트 추가







        //키오스크 생성
        Kiosk2 kiosk = new Kiosk2(menus);



       kiosk.getStart();
       //키오스크실행 Lv5 해설 실수에 대한 잔재물
    }
}
