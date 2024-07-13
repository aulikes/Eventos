package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.comment;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

public class CommentRemovedEvent extends Event {
  private final String commentId;

  public CommentRemovedEvent(String commentId) {
    super(TypeTransaction.DELETE.getType());
    this.commentId = commentId;
  }

  public String getCommentId() {
    return commentId;
  }
}
