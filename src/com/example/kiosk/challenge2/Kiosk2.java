package com.example.kiosk.challenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk2 {
    private Basket2 basket2 = new Basket2();
    private Scanner scanner = new Scanner(System.in);
    //메인 클래스에 스캐너를 사용하여 입력값을 사용


    //키오스크 안에 메뉴들의 리스트 리스트 앞에 private을 사용하여 간접접근으로 만듬 >> 맥도날드 키오스크에 누군가 피자를 추가 할 수 있기에
    private ArrayList<Menu2> menus = new ArrayList<>();


    //생성자가 메뉴리스트를 받음
    public Kiosk2(ArrayList<Menu2> menus) {
        this.menus = menus;
    }

    private void start() { //메인 클래스에서 start 메서드 사용해야함

        while (true) { //0을 눌러 종료할 때 까지 실행이 계속 되어야함
            printMenuBorad(); //메뉴판 출력 메서드


            //카테고리 선정(입력) 시작 -----------------------------
            int option = scanner.nextInt(); //스캐너로 입력
            //카테고리 선정(입력)끝

            if (basket2.isPresentChosenMenuItems() && option == 4) {
                basket2.printChosenMenu();
                orderMenu(option);
            } else if (basket2.isPresentChosenMenuItems() && option == 5) {

            } else if (option == 0) {
                break;
            } else if (option <= menus.size()) {
                Menu2 menu2 = menus.get(option - 1); //메뉴즈에서 선택한 메뉴들을 가져오는 역할


                //입력에 따른 결과 출력 끝-----------------------------

//---------------------------------------------------------------------------

                //목록 출력 시작-----------------------------
                MenuItem2 menuItem2 = menu2.getCategory();// 선택된 카테고리중에서 메뉴들을 나열

                //장바구니 추가 시작
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2. 취소");

                //배열에 추가할지 말지 결정 입력 시작
                int addBakset = scanner.nextInt();
                //배열에 추가할지 말지 결정 입력 끝

                basket2.addBasket(addBakset, menuItem2);



                //장바구니 확인 후 주문 시작을 위한 입력 후에 주문한 메뉴 확인하기 시작


            } else {
                System.out.println("잘못입력하셨습니다.");
            }



        }


    }

    public void printMenuBorad() {
        //메인 메뉴판 출력 시작 -----------------------------
        System.out.println("[ MAIN MENU ]"); // [ MAIN MENU ] 출력

        for (int i = 0; i < menus.size(); i++) {    // 메뉴판을 출력해야하는데 메뉴종류가 여러개니 일일히 하면 귀찮고  늘어날 수 있으니까 for문으로 출력
            Menu2 item = menus.get(i);
            //MenuItem 이건 타입 리스트를 사용하기 위해 item은 menuitem을 가져온다 라고 초기화함
            item.getTotalMenu(i + 1);
            // getTotalMenu = totalMenu = System.out.println(i + ". " + name);

        }

        System.out.println("0. 종료     | 종료");
        //메인 메뉴판 출력 끝 -----------------------------
        if (basket2.isPresentChosenMenuItems()) {
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Order         | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel        | 진행중인 주문을 취소합니다.");
        }
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

    public void orderMenu(int option) {

            System.out.println("[ Total ]");
            basket2.printTotalPrice();
            //장바구니 확인 후 주문 시작을 위한 입력 후에 주문한 메뉴 확인하기 끝
            System.out.println();

            //계산 시작
            System.out.println("1. 주문       2. 메뉴판");
            //계산하기 위한 입력 시작
            int last = scanner.nextInt();
            //계산하기 위한 입력 끝
            if (last == 1) {
                basket2.printCompletedOrderMessage();
                basket2.resetChosenMenuItems();
            } else if (last == 2) {

            }            //계산 끝




    }
}
