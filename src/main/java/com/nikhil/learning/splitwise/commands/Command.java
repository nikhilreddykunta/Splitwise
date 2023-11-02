package com.nikhil.learning.splitwise.commands;

import java.util.Arrays;
import java.util.List;

public interface Command {
    boolean matches(String input); //input is splitwise register, splitwise settle, ....

    void execute(String input);

    default String getCommand(String input) {
        List<String> tokens = Arrays.stream(input.split(" ")).toList();
        return tokens.get(0);
    }

    default List<String> getTokens(String input) {
        return Arrays.stream(input.split(" ")).toList();
    }
}
