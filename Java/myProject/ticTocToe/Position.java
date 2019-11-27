package ticTocToe;

public class Position {

private int row;
private int column;
private char currentMark;
private boolean chance;
private boolean goodMove;

public Position() {}

public Position(int row, int column) 
{
	this.row = row;
	this.column = column;
}

public Position(int row, int column, char currentMark) 
{
	this.row = row;
	this.column = column;
	this.currentMark = currentMark;
}

public int getRow() 							{return row;}

public void setRow(int row) 					{this.row = row;}

public int getColumn() 							{return column;}

public void setColumn(int column) 				{this.column = column;}

public char getCurrentMark() 					{return currentMark;}

public void setCurrentMark(char currentMark) 	{this.currentMark = currentMark;}

public boolean isChance() 						{return chance;}

public void setChance(boolean chance) 			{this.chance = chance;}
	
public Position(boolean goodMove) 				{this.goodMove = goodMove;}

public boolean isGoodMove() 					{return goodMove;}

public void setGoodMove(boolean goodMove) 		{this.goodMove = goodMove;}



	
}
