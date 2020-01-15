package com.thoughtworks.marsrover;

import java.util.LinkedList;

public class MarsRover {
    public Position position;
    public Instruction instruction;

    public MarsRover(Position position) {
        this.position = position;
        this.instruction = new Instruction(position);
    }

    public Position execultInstructions(LinkedList<InstructionMap> instructions) {
        instructions.forEach(x -> instruction.execute(x));

        return this.position;
    }
}
