/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kraken
 */
public class Application {

    Tetris tetris;
    public Application()
    {
            tetris = new Tetris(this);
    tetris.setLocationRelativeTo(null);
    }

     public static void main(String[] args) {
             new Application();
     }
}
