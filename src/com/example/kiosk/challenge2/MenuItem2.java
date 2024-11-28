package com.example.kiosk.challenge2;

public class MenuItem2 { //메뉴들은 이름+가격+코멘트로 이루어져있음
    //1. 속성
    private String name;
    private double price;
    private String comment;

    //2. 생성자
    public MenuItem2(String name, double price, String comment) { //메뉴들이 생긴대로 설정해줌
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

    //3. 기능

    //키오스크에 숫자 입력 햄버거와 가격 표시
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }
//선택한 메뉴 보여주기
    public void displayMenu() {
        System.out.println("선택한 메뉴 : " + name + " | W " + price + " | " + comment);
        System.out.println();
    }


//전체메뉴 보여주기
    private void totalMenu(int i) {
        System.out.println(i + ". " + name + "    | W " + price+ " | " + comment);
    }

    public void getGettotalMenu(int j) {
        totalMenu(j);
    }

    public void showPuttingMenuInBasket() {
        System.out.println("\"" + name + " | W " + price + " | " + comment + "\"");
    }

}
