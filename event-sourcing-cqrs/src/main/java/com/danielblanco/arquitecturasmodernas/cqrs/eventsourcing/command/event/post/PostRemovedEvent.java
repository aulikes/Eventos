package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.post;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

public class PostRemovedEvent extends Event {

  private final String postId;

  public PostRemovedEvent(String postId) {
    super(TypeTransaction.DELETE.getType());
    this.postId = postId;
  }

  public String getPostId() {
    return postId;
  }
}
