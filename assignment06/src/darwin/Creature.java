package darwin;

import java.util.*;

/**
 * This class represents one creature on the board. Each creature must remember
 * its species, position, direction, and the world in which it is living.
 * <p>
 * In addition, the Creature must remember the next instruction out of its
 * program to execute.
 * <p>
 * The creature is also repsonsible for making itself appear in the WorldMap. In
 * fact, you should only update the WorldMap from inside the Creature class.
 */

public class Creature {

	/**
	 * Create a creature of the given species, with the indicated position and
	 * direction. Note that we also pass in the world-- remember this world, so
	 * that you can check what is in front of the creature and update the board
	 * when the creature moves.
	 */
	public Creature(Species species, World world, Position pos, int dir) {
	}

	/**
	 * Return the species of the creature.
	 */
	public Species species() {
		return null; // fix
	}

	/**
	 * Return the current direction of the creature.
	 */
	public int direction() {
		return 0; // fix
	}

	/**
	 * Return the position of the creature.
	 */
	public Position position() {
		return null; // fix
	}

	/**
	 * Execute steps from the Creature's program until a hop, left, right, or
	 * infect instruction is executed.
	 */
	public void takeOneTurn() {
	}

	/**
	 * Return the compass direction the is 90 degrees left of the one passed in.
	 */
	public static int leftFrom(int direction) {
		return (4 + direction - 1) % 4;
	}

	/**
	 * Return the compass direction the is 90 degrees right of the one passed
	 * in.
	 */
	public static int rightFrom(int direction) {
		return (direction + 1) % 4;
	}

	/**
	 * You may test in the main method if you like, but you could also include a
	 * JUnit test class to check correctness.
	 */
	public static void main(String st[]) {

		// test creature code here.

		// uncomment below for compatilibity test with the autograder
		// AutograderCompTest a = new AutograderCompTest();
		// a.testWorld();
		// a.testSpecies();
		// a.testCreature();
		// a.testDarwin();
	}
}
