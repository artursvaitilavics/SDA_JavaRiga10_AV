package sda.hmwork.inheritance.taks02.letters;

import sda.hmwork.inheritance.taks02.Letter;

public class LetterA extends Letter {
    @Override
    public String[] getCode() {
        return new String[]{".", "_"};
    }
}
