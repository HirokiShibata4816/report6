package jp.ac.uryukyu.ie.e195726;

import java.util.ArrayList;
import java.util.List;


class CardShuffle {
    //自分のカードのリスト
    static List<String> player1_cards = new ArrayList<String>();
    //相手のカードのリスト
    static List<String> player2_cards = new ArrayList<String>();

    public static void shuffle() {
        // 1～10までとJQKをそれぞれ２枚づつ＋Joker
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= 10; i++) {
            list.add(String.valueOf(i));
            list.add(String.valueOf(i));
        }

        list.add("J");
        list.add("J");
        list.add("Q");
        list.add("Q");
        list.add("K");
        list.add("K");
        list.add("Joker");

        // 自分と相手にランダムにカードを配る
        while (list.size() > 1) {
            int select_num = (int) (Math.random() * list.size());

            //自分のリストに追加
            player1_cards.add(list.get(select_num));
            list.remove(select_num);
            select_num = (int) (Math.random() * list.size());

            //相手のリストに追加
            player2_cards.add(list.get(select_num));
            list.remove(select_num);
        }
        System.out.println(player1_cards);
        System.out.println(player2_cards);
    }
}

class DiscardCard {

}

public class Main {
    public static void main(String[] args) {
        CardShuffle.shuffle();
    }
}
