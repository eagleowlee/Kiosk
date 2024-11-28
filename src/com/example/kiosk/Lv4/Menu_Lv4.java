package com.example.kiosk.Lv4;

import java.util.ArrayList;

public class Menu_Lv4 {

    ArrayList<MenuItem_Lv4> menuItems = new ArrayList<>();

    //1. 속성
    private String name;

    //2. 생성자
    public Menu_Lv4(String name, ArrayList<MenuItem_Lv4> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    //3. 기능

    //키오스크에 숫자 입력 햄버거와 가격 표시
    public String getName() {
        return name;
    }

    //전체메뉴 보여주기
    public void totalMenu(int i) {
        System.out.println(i + ". " + name);
    }

    //카테고리들의 리스트 나열하기
    public void printCategory() {
        //입력값은 받고 받은 값에 대한 카테고리들을 나열
        System.out.println("[ " + name.toUpperCase() + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem_Lv4 menuItem = menuItems.get(i);
            menuItem.totalMenu(i + 1);

        }
    }

    public void displayMenu(int j) {
        //입력값은 받고 받은 값에 대한 메뉴를 보여줌

            MenuItem_Lv4 menuItem = menuItems.get(j);
            menuItem.displayMenu();

        }
    }

