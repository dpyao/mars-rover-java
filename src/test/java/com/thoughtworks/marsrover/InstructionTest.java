package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructionTest {
    @Test
    public void should_return_correct_direction_if_current_direction_is_E_and_instruction_is_R() {
        Position position = new Position(1, 1, Direction.E);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.R);
        assertEquals(actualPosition.getDirection(), Direction.S);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_E_and_instruction_is_L() {
        Position position = new Position(1, 1, Direction.E);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.L);
        assertEquals(actualPosition.getDirection(), Direction.N);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_N_and_instruction_is_R() {
        Position position = new Position(1, 1, Direction.N);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.R);
        assertEquals(actualPosition.getDirection(), Direction.E);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_N_and_instruction_is_L() {
        Position position = new Position(1, 1, Direction.N);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.L);
        assertEquals(actualPosition.getDirection(), Direction.W);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_W_and_instruction_is_R() {
        Position position = new Position(1, 1, Direction.W);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.R);
        assertEquals(actualPosition.getDirection(), Direction.N);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_W_and_instruction_is_L() {
        Position position = new Position(1, 1, Direction.W);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.L);
        assertEquals(actualPosition.getDirection(), Direction.S);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_S_and_instruction_is_R() {
        Position position = new Position(1, 1, Direction.S);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.R);
        assertEquals(actualPosition.getDirection(), Direction.W);
    }

    @Test
    public void should_return_correct_direction_if_current_direction_is_S_and_instruction_is_L() {
        Position position = new Position(1, 1, Direction.S);
        Instruction instruction = new Instruction(position);

        Position actualPosition = instruction.execute(InstructionMap.L);
        assertEquals(actualPosition.getDirection(), Direction.E);
    }

    @Test
    public void should_return_correct_position_if_current_direction_is_E_and_instruction_is_M() {
        Position position = new Position(1, 1, Direction.E);
        Instruction instruction = new Instruction(position);

        instruction.execute(InstructionMap.M);
        assertEquals(position.getDirection(), Direction.E);
        assertEquals(position.getX(), 2);
        assertEquals(position.getY(), 1);
    }

    @Test
    public void should_return_correct_position_if_current_direction_is_N_and_instruction_is_M() {
        Position position = new Position(1, 1, Direction.N);
        Instruction instruction = new Instruction(position);

        instruction.execute(InstructionMap.M);
        assertEquals(position.getDirection(), Direction.N);
        assertEquals(position.getX(), 1);
        assertEquals(position.getY(), 2);
    }

    @Test
    public void should_return_correct_position_if_current_direction_is_W_and_instruction_is_M() {
        Position position = new Position(1, 1, Direction.W);
        Instruction instruction = new Instruction(position);

        instruction.execute(InstructionMap.M);
        assertEquals(position.getDirection(), Direction.W);
        assertEquals(position.getX(), 0);
        assertEquals(position.getY(), 1);
    }

    @Test
    public void should_return_correct_position_if_current_direction_is_S_and_instruction_is_M() {
        Position position = new Position(1, 1, Direction.S);
        Instruction instruction = new Instruction(position);

        instruction.execute(InstructionMap.M);
        assertEquals(position.getDirection(), Direction.S);
        assertEquals(position.getX(), 1);
        assertEquals(position.getY(), 0);
    }
}
