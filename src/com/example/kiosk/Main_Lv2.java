package com.example.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Lv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenuItem_Lv2 ShackBurger = new MenuItem_Lv2("ShackBurger", 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        //쉑버거 생성
        MenuItem_Lv2 SmokeShack = new MenuItem_Lv2("SmokeShack", 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        //스모크버거 생성
        MenuItem_Lv2 CheeseBurger = new MenuItem_Lv2("CheeseBurger", 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        //치즈버거 생성
        MenuItem_Lv2 Hamburger = new MenuItem_Lv2("Hamburger", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거");
        //햄버거 생성
        java.util.List<MenuItem_Lv2> menuItems = new ArrayList<>();
        //위 4개의 햄버거를 담을 리스트 생성
        menuItems.add(ShackBurger);
        menuItems.add(SmokeShack);
        menuItems.add(CheeseBurger);
        menuItems.add(Hamburger);
        //리스트에 햄버거 4개 다 담기
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            //메뉴판이름
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem_Lv2 item = menuItems.get(i);
                //MenuItem 이건 타입 리스트를 사용하기 위해 item은 menuitem을 가져온다 라고 초기화함
                item.totalMenu(i+1);
            }

            System.out.println("0. 종료     | 종료");

            int option = scanner.nextInt();
            //스캐너로 입력

            if (option == 0) {
                System.out.println("키오스크 종료");
                break;
            }

            switch (option) {
                case 1:
                    ShackBurger.displayMenu();
                    break;
                case 2:
                    SmokeShack.displayMenu();
                    break;
                case 3:
                    CheeseBurger.displayMenu();
                    break;
                case 4:
                    Hamburger.displayMenu();
                    break;
                default:
                    System.out.println("잘못 선택하셨습니다.");
        }



        }

    }
}
