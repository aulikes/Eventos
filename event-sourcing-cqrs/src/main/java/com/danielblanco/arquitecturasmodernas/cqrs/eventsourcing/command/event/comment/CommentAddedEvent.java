package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.comment;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

import java.util.UUID;

public class CommentAddedEvent extends Event {
  private final String commentId;
  private final String postId;
  private final String content;

  public CommentAddedEvent(String postId, String content) {
    super(TypeTransaction.INSERT.getType());
    this.commentId = UUID.randomUUID().toString();
    this.postId = postId;
    this.content = content;
  }

  public String getCommentId() {
    return commentId;
  }

  public String getPostId() {
    return postId;
  }

  public String getContent() {
    return content;
  }
}
