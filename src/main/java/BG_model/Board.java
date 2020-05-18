package BG_model;

import java.util.ArrayList;
import java.util.List;

import static BG_model.ChipColor.*;

public class Board{
    private List<Column> board;

    public Board(){

        this.board = new ArrayList<Column>();


        board.add(new Column(BLACK,2));
        for (int i = 0; i < 4; i++){
            board.add(new Column());
        }
        board.add(new Column(WHITE,5));
        board.add(new Column());
        board.add(new Column(WHITE,3));
        for (int i = 0; i < 3; i++){
            board.add(new Column());
        }
        board.add(new Column(BLACK,5));
        board.add(new Column(WHITE,5));
        for (int i = 0; i < 3; i++){
            board.add(new Column());
        }
        board.add(new Column(BLACK,3));
        board.add(new Column());
        board.add(new Column(BLACK,5));
        for (int i = 0; i < 4; i++){
            board.add(new Column());
        }
        board.add(new Column(WHITE,2 ));
        board.add(new Column());
        board.add(new Column());
    }

    public void move (int from, int to){
        board.get(from).move(board.get(to));
    }



    public List<Column> getBoard(){
        return this.board;
    }


}
