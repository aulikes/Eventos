package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.reaction;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model.TypeTransaction;

import java.util.UUID;

public class ReactionAddedEvent extends Event {

  private final String reactionId;
  private final String commentId;
  private final String postId;
  private final String emoji;

  public ReactionAddedEvent(String commentId, String postId, String emoji) {
    super(TypeTransaction.INSERT.getType());
    this.reactionId = UUID.randomUUID().toString();;
    this.commentId = commentId;
    this.postId = postId;
    this.emoji = emoji;
  }
  public String getReactionId() {
    return reactionId;
  }

  public String getCommentId() {
    return commentId;
  }

  public String getPostId() {
    return postId;
  }

  public String getEmoji() {
    return emoji;
  }

}
