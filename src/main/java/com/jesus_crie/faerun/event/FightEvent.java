package com.jesus_crie.faerun.event;

import com.jesus_crie.faerun.logic.FightRecord;

import javax.annotation.Nonnull;

/**
 * Triggered when a fight has been performed.
 */
public final class FightEvent implements Event {

    private static final long serialVersionUID = 7392911604467117618L;

    private final FightRecord record;

    public FightEvent(@Nonnull final FightRecord record) {
        this.record = record;
    }

    public FightRecord getRecord() {
        return record;
    }
}
