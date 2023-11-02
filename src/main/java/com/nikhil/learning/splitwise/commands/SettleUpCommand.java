package com.nikhil.learning.splitwise.commands;

import java.util.Arrays;
import java.util.List;

public class SettleUpCommand implements Command{
    @Override
    public boolean matches(String input) {
        return getCommand(input).equals(CommandsList.SETTLE_UP_COMMAND);
    }

    @Override
    public void execute(String input) {
        //call settle controller
    }
}
