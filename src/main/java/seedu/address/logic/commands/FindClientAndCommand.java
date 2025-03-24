package seedu.address.logic.commands;

import seedu.address.model.client.ContainsAllKeywordsPredicate;

public class FindClientAndCommand extends AbstractFindClientCommand {
    public static final String COMMAND_WORD = "findclientand";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds all clients whose names/tags contain all of "
            + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " alice bob Priority";

    public FindClientAndCommand(ContainsAllKeywordsPredicate predicate) {
        super(predicate);
    }
}
