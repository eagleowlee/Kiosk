package com.example.kiosk.challenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu2 {

    Scanner scanner = new Scanner(System.in);
    //1. 속성
    private ArrayList<MenuItem2> menuItems = new ArrayList<>();    //  ArrayList<MenuItem> << 이게 타입 menuItems 이게 메뉴 라는 배열 생성 Lv5에 따라 private로 생성
    private String name; // 메뉴 클래스에서 사용 될 name 생성


    //2. 생성자가 name과 menuItems을 받음
    public Menu2(String name, ArrayList<MenuItem2> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    //3. 기능

    //키오스크에 숫자 입력 햄버거와 가격 표시
    public String getName() { //네임을 반환하는 메서드
        return name;
    }

    //전체메뉴 보여주기
    private void totalMenu(int i) { //키오스크 30번째라인에서 getTotalMenu의 하는 짓 앞에 숫자가 붙어야해서 int i 라는 매개변수를 받고 반환값은 sout이기에 없음
        System.out.println(i + ". " + name);
    }

    public void getTotalMenu(int j) { //바로 위 메서드의 실행 Lv5의 잔재물
        totalMenu(j);
    }

    //카테고리들의 리스트 나열하기
    private void printCategory() {
        //입력값은 받고 받은 값에 대한 카테고리들을 나열
        System.out.println("[ " + name.toUpperCase() + " MENU ]");  //Burger or Drinks or Desserts 를 대문자로 만들고 제목 으로 사용
        for (int i = 0; i < menuItems.size(); i++) { //각 종류의 메뉴이름,가격,코멘트 나열
            MenuItem2 menuItem = menuItems.get(i); // 밑에 코드를 사용하기 위해 초기화 함 해주고 (간접접근?) menuItems에 i번째 인덱스를 가져옴 하지만 for문이라 다 가져오는 것
            menuItem.getGettotalMenu(i + 1); // name + price + comment 가 있는 메뉴들을 나열

        }
    }

    public MenuItem2 getCategory() { //Lv5의 잔재물

        printCategory();

        System.out.println("0. 뒤로가기");
        //목록 출력 끝-----------------------------

        //메뉴 선정에 대한 입력 시작----------------------------
        int pickMenu = scanner.nextInt(); // option에서 번호를 입력하고 다음 메뉴선정에 대한 입력값을 받기
        //메뉴 선정에 대한 입력 끝----------------------------

        //메뉴 선정에 대한 입력에 대한 출력 시작----------------------------
        pickMenu(pickMenu);
        //option에서 1or2or3을 입력한 다음 pickmenu에 숫자를 입력하면 선택된 메뉴 | 하면서 나와야댐

        //메뉴 선정에 대한 입력에 대한 출력 끝----------------------------


        MenuItem2 menuItem2 = menuItems.get(pickMenu - 1);


        menuItem2.showPuttingMenuInBasket(); //"SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" 이거 보여주기

        return menuItem2;


    }


    private void displayMenu(int j) {
        //입력값은 받고 받은 값에 대한 메뉴를 보여줌 / 선택한 메뉴 보여주기 메서드 실행

        MenuItem2 menuItem = menuItems.get(j); //타입이 MenuItem이고 이름이 menuItem인 애는 menuItems 배열의 j번째 값을 가져온다.
        menuItem.displayMenu(); //가져온 값을 MenuItem클래스 31번째 메서드로 실행

    }

    public void pickMenu(int pickMenu) {
        if (pickMenu == 0) {
            System.out.println("처음으로 돌아갑니다.");
        } else if (pickMenu > menuItems.size() || pickMenu < 0) { // getMenuIten() << 이게 한 단어 menu에 잇는 getMenuItems() 메서드 의 size 보다 크면 잘못 입력 0보다 작아도 잘못 입력
            System.out.println("잘못입력하셨습니다.");
        } else {
            displayMenu(pickMenu - 1);
        }
    }






    }










