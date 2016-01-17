package world;

import java.util.HashMap;

public enum Block {
	WATER(-2), LAVA(-1), VOID(0), TREE(1), STONE(2), FOOD(3);
	private HashMap<Block,Integer> blockIDs = new HashMap<>();
	Block(int i) {
		blockIDs.put(this, i);
	}
	public int getBlockID(Block b){
		return blockIDs.get(b);
	}
}
