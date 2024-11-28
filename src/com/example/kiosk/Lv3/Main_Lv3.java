package com.example.kiosk.Lv3;

import java.util.ArrayList;

public class Main_Lv3 {
    public static void main(String[] args) {
        //버거생성
        MenuItem_Lv3 ShackBurger = new MenuItem_Lv3("ShackBurger", 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        //쉑버거 생성
        MenuItem_Lv3 SmokeShack = new MenuItem_Lv3("SmokeShack", 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        //스모크버거 생성
        MenuItem_Lv3 CheeseBurger = new MenuItem_Lv3("CheeseBurger", 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        //치즈버거 생성
        MenuItem_Lv3 Hamburger = new MenuItem_Lv3("Hamburger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거");
        //버거목록생성
        ArrayList<MenuItem_Lv3> menuItems = new ArrayList<>();

        //버거목록에 버거추가
        menuItems.add(ShackBurger);
        menuItems.add(SmokeShack);
        menuItems.add(CheeseBurger);
        menuItems.add(Hamburger);

        //키오스크 생성
        Kiosk_Lv3 kiosk = new Kiosk_Lv3(menuItems);

       kiosk.start();
    }
}
