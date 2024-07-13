package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.post;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

public class PostUpdatedEvent extends Event {

  private final String postId;
  private final String content;

  public PostUpdatedEvent(String postId, String content) {
    super(TypeTransaction.UPDATE.getType());
    this.postId = postId;
    this.content = content;
  }

  public String getPostId() {
    return postId;
  }

  public String getContent() {
    return content;
  }
}
