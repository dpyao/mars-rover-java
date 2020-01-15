package com.thoughtworks.marsrover;

public class Instruction {
    public Position position;

    public Instruction(Position position) {
        this.position = position;
    }

    public Position execute(InstructionMap instruction) {
        if(instruction == InstructionMap.L) this.turnLeft();
        if(instruction == InstructionMap.R) this.turnRight();
        if(instruction == InstructionMap.M) this.move();

        return this.position;
    }

    public Position turnLeft() {
        Direction direction = this.position.getDirection();

        if(direction == Direction.E) position.updateDirection(Direction.N);
        if(direction == Direction.N) position.updateDirection(Direction.W);
        if(direction == Direction.W) position.updateDirection(Direction.S);
        if(direction == Direction.S) position.updateDirection(Direction.E);

        return position;
    }

    public Position turnRight() {
        Direction direction = this.position.getDirection();

        if(direction == Direction.E) position.updateDirection(Direction.S);
        if(direction == Direction.S) position.updateDirection(Direction.W);
        if(direction == Direction.W) position.updateDirection(Direction.N);
        if(direction == Direction.N) position.updateDirection(Direction.E);

        return position;
    }

    public Position move() {
        int x = this.position.getX();
        int y = this.position.getY();
        Direction direction = this.position.getDirection();

        if(direction == Direction.E) position.updateCoordinate(x + 1, y);
        if(direction == Direction.S) position.updateCoordinate(x, y - 1);
        if(direction == Direction.W) position.updateCoordinate(x - 1, y);
        if(direction == Direction.N) position.updateCoordinate(x, y + 1);

        return position;
    }
}
