package com.example.kiosk.Lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk_Lv3 {
    Scanner scanner = new Scanner(System.in);

    java.util.List<MenuItem_Lv3> menuItems = new ArrayList<>();
    //위 4개의 햄버거를 담을 리스트 생성

    //생성자가 메뉴리스트를 받음
    public Kiosk_Lv3(ArrayList<MenuItem_Lv3> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            //메뉴판이름
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem_Lv3 item = menuItems.get(i);
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
            //오류메세지 출력
            else if (option > menuItems.size() || option < 0) {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
            //menuItems.get(option-1)만 잇으면 주소값이 나오기 때문에 초기화를 하고 burger.displayMenu를 사용하면 주소값이 아니라 그 값이 나옴
            MenuItem_Lv3 burger = menuItems.get(option-1);
            //MenuItem에 잇는 선택한 메뉴 보여주기 메서드 실행
            burger.displayMenu();
            System.out.println();



        }

    }


}
