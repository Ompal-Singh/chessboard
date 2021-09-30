/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 9/29/2021
 *   Time: 9:41 PM
 *   File: solution.java
 */

package Chessboard;

import javax.swing.*;
import java.awt.*;

public class solution {
    JFrame frame;
    JPanel squares[][] = new JPanel[7][7];
    public solution() {
        frame = new JFrame("Simplified chess");
        frame.setSize(300,200);
        frame.setLayout(new GridLayout(7,7));
        for (int i = 0;  i < 7 ; i++) {
            for (int j = 0; j < 7; j++) {
                squares[i][j] = new JPanel();
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.black);
                }
                else {
                    squares[i][j].setBackground(Color.white);
                }
                frame.add(squares[i][j]);
            }
        }
        squares[0][0].add(new JLabel(new ImageIcon("rookgreen.png")));
        squares[0][2].add(new JLabel(new ImageIcon("bishpogreen.png")));
        squares[0][4].add(new JLabel(new ImageIcon("kinggreen.png")));
        squares[0][5].add(new JLabel(new ImageIcon("bishpogreen.png")));
        squares[0][6].add(new JLabel(new ImageIcon("rookgreen.png")));

        squares[6][0].add(new JLabel(new ImageIcon("rookred.png")));
        squares[6][2].add(new JLabel(new ImageIcon("bishpored.png")));
        squares[6][4].add(new JLabel(new ImageIcon("kingred.png")));
        squares[6][5].add(new JLabel(new ImageIcon("bishpored.png")));
        squares[6][6].add(new JLabel(new ImageIcon("rooked.png")));

        for (int i = 0; i < 7; i++) {
            squares[1][i].add(new JLabel(new ImageIcon("pawgreen.png")));
            squares[6][i].add(new JLabel(new ImageIcon("pawnred.png")));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new solution();
    }

}
