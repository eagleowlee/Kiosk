package com.example.kiosk.Lv4;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk_Lv4 {
    Scanner scanner = new Scanner(System.in);



    //키오스크 안에 메뉴들의 리스트
    ArrayList<Menu_Lv4> menus = new ArrayList<>();




    //생성자가 메뉴리스트를 받음
    public Kiosk_Lv4(ArrayList<Menu_Lv4> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            //메인 목록 출력
            System.out.println("[ MAIN MENU ]");
            //메뉴판이름
            for (int i = 0; i < menus.size(); i++) {
                Menu_Lv4 item = menus.get(i);
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
            else if (option > menus.size() || option < 0) {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
            Menu_Lv4 menu = menus.get(option-1); //여러가지 중 한 카테고리 선택
//---------------------------------------------------------------------------
            //목록 출력
            menu.printCategory(); // 선택된 카테고리중에서 메뉴들을 나열
            System.out.println("0. 뒤로가기");

            int pickMenu  = scanner.nextInt(); // 선택된 카테고리 중에서 어떤 번호를 입력할까

            if (pickMenu == 0) {
                continue;
            } else if (pickMenu > menu.menuItems.size()) {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
            //option에서 1or2or3을 입력한 다음 pickmenu에 숫자를 입력하면 선택된 메뉴 | 하면서 나와야댐
            menu.displayMenu(pickMenu-1);








//            //menuItems.get(option-1)만 잇으면 주소값이 나오기 때문에 초기화를 하고 burger.displayMenu를 사용하면 주소값이 아니라 그 값이 나옴
//            Menu burger = menus.get(option-1);
//            //MenuItem에 잇는 선택한 메뉴 보여주기 메서드 실행
//            burger.displayMenu();
//            System.out.println();



        }

    }


}
