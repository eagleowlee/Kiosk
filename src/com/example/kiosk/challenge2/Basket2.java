package com.example.kiosk.challenge2;

import java.util.ArrayList;

public class Basket2 {
    private double totalPrice = 0;
    private ArrayList<MenuItem2> chosenMenuItems = new ArrayList<>();
    //바스켓 클래스에는 내가 선택한 상품의 이름, 가격이 들어가야함 내가 선택한 상품의 이름 가격을 알고 있는 것은 메뉴아이템이 알고 있음
    //그럼 내가 선택한 상품을 기억하기 위해서는 바스켓 클래스 안에 리스트를 하나 만들고 그 리스트에 집어 넣는 식으로 먼말알
    //버거중에 쉑버거를 고르고 음료 중에 pepsi를 고르면 메뉴아이템은 내가 고른 쉑버거의 이름+가격+코멘트 , 펩시의 이름+가격+코멘트가 있을 것이고
    //그중에 이름과 가격을 가져와야댐
    public void addBasket(int addBasket, MenuItem2 menuItem2) {

        if (addBasket == 1) {
            chosenMenuItems.add(menuItem2);

            System.out.println(menuItem2.getName() + "이(가) 장바구니에 추가되었습니다.");

        } else if (addBasket == 2) {
            System.out.println("장바구니에 추가 되지 않았습니다.");
        }
    }


    public void printTotalPrice() {
        double sum = 0;
        for (int k = 0; k < chosenMenuItems.size(); k++) {
            sum += chosenMenuItems.get(k).getPrice();
        }
        totalPrice = sum;
        System.out.println("W " + sum); //  printf 구글링
    }



    public void printCompletedOrderMessage() {
        System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + " 입니다.");
    }

    public void printChosenMenu() {
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println();
            System.out.println("[ Orders ]");
            for (int j = 0; j < chosenMenuItems.size(); j++) {
                System.out.println(chosenMenuItems.get(j).getName() + " | " + "W " + chosenMenuItems.get(j).getPrice() + " | " + chosenMenuItems.get(j).getComment());
            }
            System.out.println();
    }

    public void resetChosenMenuItems() {
         chosenMenuItems.clear(); //배열을 비워주는 메서드
    }

    public int getChosenMenuItemsSize() {
        return chosenMenuItems.size();
    }

    public boolean isPresentChosenMenuItems() {
        return chosenMenuItems.size()>0 ;
    }





}
