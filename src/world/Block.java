package world;

import java.util.HashMap;

public enum Block {
	WATER(-2), LAVA(-1), TREE(1), STONE(2), FOOD(3);
	private HashMap<Block, Integer> blockIDs = new HashMap<>();

	Block(int i) {
		blockIDs.put(this, i);
	}

	public int getBlockID() {
		return blockIDs.get(this);
	}

	public Block next() {
		Block b = null;
		switch (this) {
		case FOOD:
			b = Block.WATER;
			break;
		case LAVA:
			b = Block.TREE;
			break;
		case STONE:
			b = Block.FOOD;
			break;
		case TREE:
			b = Block.STONE;
			break;
		case WATER:
			b = Block.LAVA;
			break;
		default:
			break;

		}
		return b;
	}

}
