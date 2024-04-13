package com.kimcrent.javachessapp;

public abstract class Piece {
    protected Position position;
    protected PieceColor color;

    public Piece(PieceColor color, Position position) {
        this.color = color;
        this.position = position;
    }

    public PieceColor getColor() {
        return color;
    }
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean isValidMove(Position newPosition, Piece[][] board);

    public void movePiece(Position start, Position end) {
        // Check if there is a piece at the start position and if the move is valid
        if (board[strt.getRow()][start.getColumn()] != null &&
            board[start.getRow()][start.getColumn().isValidMove(end, board)]) {

                //Perform the move: place the poece at the end position
                board[end.getRow()][end.getColumn()] = board[start.getRow()][start.getColumn()];

                // Update the piece's position
                board[end.getRow()][end.getColumn()].setPosition(end);

                // Clear the start position
                board[start.getRow()][start.getColumn()] = null;
            }
    }

}
