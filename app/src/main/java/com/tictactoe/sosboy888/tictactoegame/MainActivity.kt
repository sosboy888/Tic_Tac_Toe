//Author:Swastik Sharma
package com.tictactoe.sosboy888.tictactoegame

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    protected fun buClick(view: View){
        //function to find button ID that got pressed
        val buSelected=view as Button
        var cellID=0
        when(buSelected.id){
            R.id.bu1->cellID=1
            R.id.bu2->cellID=2
            R.id.bu3->cellID=3
            R.id.bu4->cellID=4
            R.id.bu5->cellID=5
            R.id.bu6->cellID=6
            R.id.bu7->cellID=7
            R.id.bu8->cellID=8
            R.id.bu9->cellID=9
        }
        //Toast text(the text that appears like a notification on the bottom of the screen
        //Toast.makeText(this,"ID "+cellID,Toast.LENGTH_SHORT).show()
        playGame(cellID,buSelected)
    }
    var Player1=ArrayList<Int>()
    var Player2=ArrayList<Int>()
    var activePlayer=1

    public fun playGame(cellID:Int,buSelected:Button){
        if(activePlayer==1){
            buSelected.text="X"
            buSelected.setBackgroundColor(Color.GREEN)
            Player1.add(cellID)
            activePlayer=2
        }
        else{
            buSelected.text="O"
            buSelected.setBackgroundColor(Color.BLUE)
            Player2.add(cellID)
            activePlayer=1
        }
        buSelected.isEnabled=false
                checkWinner()



    }
    public fun checkWinner(){
        var winner=-1
        //Player1 rows and columns
        if(Player1.contains(1)&&Player1.contains(2)&&Player1.contains(3)){
            winner=1
        }
        if(Player1.contains(4)&&Player1.contains(5)&&Player1.contains(6)){
            winner=1
        }
        if(Player1.contains(7)&&Player1.contains(8)&&Player1.contains(9)){
            winner=1
        }
        if(Player1.contains(1)&&Player1.contains(5)&&Player1.contains(9)){
            winner=1
        }
        if(Player1.contains(1)&&Player1.contains(4)&&Player1.contains(7)){
            winner=1
        }
        if(Player1.contains(2)&&Player1.contains(5)&&Player1.contains(8)){
            winner=1
        }
        if(Player1.contains(3)&&Player1.contains(5)&&Player1.contains(7)){
            winner=1
        }
        //Player2 rows and columns
        if(Player2.contains(1)&&Player2.contains(2)&&Player2.contains(3)){
            winner=2
        }
        if(Player2.contains(4)&&Player2.contains(5)&&Player2.contains(6)){
            winner=2
        }
        if(Player2.contains(7)&&Player2.contains(8)&&Player2.contains(9)){
            winner=2
        }
        if(Player2.contains(1)&&Player2.contains(5)&&Player2.contains(9)){
            winner=2
        }
        if(Player2.contains(1)&&Player2.contains(4)&&Player2.contains(7)){
            winner=2
        }
        if(Player2.contains(2)&&Player2.contains(5)&&Player2.contains(8)){
            winner=2
        }
        if(Player2.contains(3)&&Player2.contains(5)&&Player2.contains(7)){
            winner=2
        }
        if(winner!=-1){
            if(winner==1){
                Toast.makeText(this,"Player 1 Won!",Toast.LENGTH_SHORT).show()
            }
            if(winner==2){
                Toast.makeText(this,"Player 2 Won!",Toast.LENGTH_SHORT).show()

            }
        }
    }
}
