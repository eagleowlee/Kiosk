package com.example.kiosk.Lv4;

public class MenuItem_Lv4 {
    //1. 속성
    private String name;
    private double price;
    private String comment;

    //2. 생성자
    public MenuItem_Lv4(String name, double price, String comment) {
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
    }
//전체메뉴 보여주기
    public void totalMenu(int i) {
        System.out.println(i + ". " + name + "    | W " + price+ " | " + comment);
    }

}
