package com.thoughtworks.marsrover;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_final_position_correctly_after_execult_instruction_list() {
        MarsRover marsRover = new MarsRover(new Position(1, 1, Direction.E));

        LinkedList<InstructionMap> instructions = new LinkedList<>();
        instructions.add(InstructionMap.L);
        instructions.add(InstructionMap.M);
        instructions.add(InstructionMap.M);
        instructions.add(InstructionMap.L);
        instructions.add(InstructionMap.M);
        instructions.add(InstructionMap.R);
        instructions.add(InstructionMap.M);
        instructions.add(InstructionMap.M);

        Position position = marsRover.execultInstructions(instructions);
        assertEquals(position.getDirection(), Direction.N);
        assertEquals(position.getX(), 0);
        assertEquals(position.getY(), 5);
    }
}
