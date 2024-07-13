package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.comment;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

public class CommentUpdatedEvent extends Event {

  private final String commentId;
  private final String postId;
  private final String content;

  public CommentUpdatedEvent(String commentId, String postId, String content) {
    super(TypeTransaction.UPDATE.getType());
    this.commentId = commentId;
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
