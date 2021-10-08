package edu.ncsu.monopoly;

import java.awt.Dimension;
import java.util.List;

import junit.framework.TestCase;

import edu.ncsu.monopoly.gui.GameBoardUtil;

public class GameboardCreationTest extends TestCase{
	
	private List<Cell> northCells;
	private List<Cell> westCells;
	private List<Cell> southCells;
	private List<Cell> eastCells;

	public void testCellAddOrder() {
		GameBoard board = new SimpleGameBoard();
		northCells = GameBoardUtil.getNorthCells(board);
		assertEquals(3, northCells.size());
		assertSame(board.queryCell("Blue 3"), northCells.get(0));
		assertSame(board.queryCell("Green 1"), northCells.get(1));
		assertSame(board.queryCell("Green 2"), northCells.get(2));
		westCells = GameBoardUtil.getWestCells(board);
		assertEquals(0, westCells.size());
		southCells = GameBoardUtil.getSouthCells(board);
		assertEquals(3, southCells.size());
		assertSame(board.queryCell("Blue 2"), southCells.get(0));
		assertSame(board.queryCell("Blue 1"), southCells.get(1));
		assertSame(board.queryCell("Go"), southCells.get(2));
		eastCells = GameBoardUtil.getEastCells(board);
		assertEquals(0, eastCells.size());
	}
	
	public void testCellAddOrder14() {
		GameBoard board = new GameBoard14();
		northCells = GameBoardUtil.getNorthCells(board);
		assertEquals(5, northCells.size());
		assertSame(board.queryCell("Red 1"), northCells.get(0));
		assertSame(board.queryCell("Red 2"), northCells.get(1));
		assertSame(board.queryCell("Red 3"), northCells.get(2));
		assertSame(board.queryCell("Purple 1"), northCells.get(3));
		assertSame(board.queryCell("Purple 2"), northCells.get(4));
		westCells = GameBoardUtil.getWestCells(board);
		assertEquals(2, westCells.size());
		assertSame(board.queryCell("Green 3"), westCells.get(0));
		assertSame(board.queryCell("Green 2"), westCells.get(1));
		southCells = GameBoardUtil.getSouthCells(board);
		assertEquals(5, southCells.size());
		assertSame(board.queryCell("Green 1"), southCells.get(0));
		assertSame(board.queryCell("Blue 3"), southCells.get(1));
		assertSame(board.queryCell("Blue 2"), southCells.get(2));
		assertSame(board.queryCell("Blue 1"), southCells.get(3));
		assertSame(board.queryCell("Go"), southCells.get(4));
		eastCells = GameBoardUtil.getEastCells(board);
		assertEquals(2, eastCells.size());
		assertSame(board.queryCell("Yellow 1"), eastCells.get(0));
		assertSame(board.queryCell("Yellow 2"), eastCells.get(1));
	}
	
	public void testGameboardLayout() {
		assertEquals(
				new Dimension(1, 0), GameBoardUtil.calculateDimension(6));
		assertEquals(
				new Dimension(3, 2), GameBoardUtil.calculateDimension(14));
	}
}
