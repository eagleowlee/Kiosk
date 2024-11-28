package com.example.kiosk.Lv5;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk_Lv5 {
    Scanner scanner = new Scanner(System.in);
    //메인 클래스에 스캐너를 사용하여 입력값을 사용



    //키오스크 안에 메뉴들의 리스트 리스트 앞에 private을 사용하여 간접접근으로 만듬 >> 맥도날드 키오스크에 누군가 피자를 추가 할 수 있기에
    private ArrayList<Menu_Lv5> menus = new ArrayList<>();




    //생성자가 메뉴리스트를 받음
    public Kiosk_Lv5(ArrayList<Menu_Lv5> menus) {
        this.menus = menus;
    }

    private void start() { //메인 클래스에서 start 메서드 사용해야함

        while (true) { //0을 눌러 종료할 때 까지 실행이 계속 되어야함
            printMenuBorad(); //메뉴판 출력 메서드


            //카테고리 선정(입력) 시작 -----------------------------
            int option = scanner.nextInt(); //스캐너로 입력
            //카테고리 선정(입력)끝

            if (option > menus.size() || option < 0) {
                happenError();  //잘못 입력하여 오류 발생
                continue;
            } else if (option == 0) {
                exitMenu();      //0을 입력하여 키오스크 종료
                break;
            }

            Menu_Lv5 menu = menus.get(option-1); //메뉴즈에서 선택한 메뉴들을 가져오는 역할 / 이것도 메서드로 바꿔야하는가?

          //  explainChoseMenu(option - 1); //여러가지 중 한 카테고리 선택
            //입력에 따른 결과 출력 끝-----------------------------

//---------------------------------------------------------------------------

            //목록 출력 시작-----------------------------
            menu.getCategory(); // 선택된 카테고리중에서 메뉴들을 나열

        }





    }

    public void printMenuBorad() {
        //메인 메뉴판 출력 시작 -----------------------------
        System.out.println("[ MAIN MENU ]"); // [ MAIN MENU ] 출력

        for (int i = 0; i < menus.size(); i++) {    // 메뉴판을 출력해야하는데 메뉴종류가 여러개니 일일히 하면 귀찮고  늘어날 수 있으니까 for문으로 출력
            Menu_Lv5 item = menus.get(i);
            //MenuItem 이건 타입 리스트를 사용하기 위해 item은 menuitem을 가져온다 라고 초기화함
            item.getTotalMenu(i+1);
            // getTotalMenu = totalMenu = System.out.println(i + ". " + name);
        }

        System.out.println("0. 종료     | 종료");
        //메인 메뉴판 출력 끝 -----------------------------
    }

    public void happenError() {
        System.out.println("잘못입력하셨습니다.");
    }

    public void exitMenu() {
        System.out.println("키오스크 종료");
    }


    public void getStart() {
        start();
    } // Lv5에 대해 잘못 해석한 잔유물


}
