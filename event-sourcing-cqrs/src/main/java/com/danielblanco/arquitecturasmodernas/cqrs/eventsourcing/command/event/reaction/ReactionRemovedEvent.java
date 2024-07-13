package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.reaction;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

public class ReactionRemovedEvent extends Event {

  private String reactionId;

  public ReactionRemovedEvent(String reactionId) {
    super(TypeTransaction.DELETE.getType());
    this.reactionId = reactionId;
  }

  public String getReactionId() {
    return reactionId;
  }
}
