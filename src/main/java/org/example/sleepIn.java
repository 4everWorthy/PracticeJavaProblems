package org.example;

public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
        return true;
    }
    return false;
}

//sleepIn checks the conditions for whether it is not a weekday and if we're on vacation.
//The "!" in "!weekday" is a NOT operator, it will invert the boolean value.
//True to false and false to true. Meaning 'if it is NOT a weekday' = true; it is not a weekday.
//"||" simply means 'OR'; it IS a vacation day = true. Both conditions are "true", so we sleep in.
