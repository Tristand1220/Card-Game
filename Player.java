package com.example.fx;

import com.example.fx.Card;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;


public class Player {

    private ObservableList<Node> cards;
    private SimpleIntegerProperty value = new SimpleIntegerProperty(0);

    public Player (ObservableList<Node> cards){

        this.cards=cards;
    }

    public void takeCard(Card card){
        cards.add(card);

        value.set(value.get()+ card.value);

    }
    public void reset(){
        cards.clear();
        value.set(0);
    }

    public SimpleIntegerProperty valueProperty() {

        return value;
    }
}














