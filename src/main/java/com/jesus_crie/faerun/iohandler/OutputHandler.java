package com.jesus_crie.faerun.iohandler;

import com.jesus_crie.faerun.model.board.Board;
import com.jesus_crie.faerun.model.board.BoardSettings;

import javax.annotation.Nonnull;

public interface OutputHandler {

    FightOutputHandler getFightOutputHandler();

    void displayBoardSettings(@Nonnull final BoardSettings settings);

    void displayBoardProgression(@Nonnull final Board board);

    void displayBoard(@Nonnull final Board board);
}