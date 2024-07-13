package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.post;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

import java.util.UUID;

public class PostAddedEvent extends Event {
  private final String postId;
  private final String content;

  public PostAddedEvent(String content) {
    super(TypeTransaction.INSERT.getType());
    this.postId = UUID.randomUUID().toString();
    this.content = content;
  }

  public String getPostId() {
    return postId;
  }

  public String getContent() {
    return content;
  }
}
