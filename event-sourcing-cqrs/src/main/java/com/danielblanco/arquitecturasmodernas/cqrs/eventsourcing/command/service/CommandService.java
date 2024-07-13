package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.service;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.comment.CommentAddedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.comment.CommentRemovedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.comment.CommentUpdatedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.post.PostAddedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.post.PostRemovedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.post.PostUpdatedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.reaction.ReactionAddedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.reaction.ReactionRemovedEvent;
import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.repository.EventStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

  @Autowired
  private EventStore eventStore;

  public PostAddedEvent addPost(PostAddedEvent eventRequest) {
    PostAddedEvent event = new PostAddedEvent(eventRequest.getContent());
    eventStore.addEvent(event);
    return event;
  }

  public PostUpdatedEvent updatePost(PostUpdatedEvent event) {
    eventStore.addEvent(event);
    return event;
  }

  public PostRemovedEvent removePost(String postId) {
    PostRemovedEvent event = new PostRemovedEvent(postId);
    eventStore.addEvent(event);
    return event;
  }

  public CommentAddedEvent addComment(String postId, CommentAddedEvent eventRequest) {
    CommentAddedEvent event = new CommentAddedEvent(postId, eventRequest.getContent());
    eventStore.addEvent(event);
    return event;
  }

  public CommentUpdatedEvent updateComment(CommentUpdatedEvent event) {
    eventStore.addEvent(event);
    return event;
  }

  public CommentRemovedEvent removeComment(String commentId) {
    CommentRemovedEvent event = new CommentRemovedEvent(commentId);
    eventStore.addEvent(event);
    return event;
  }

  public ReactionAddedEvent addReaction(String postId, String commentId, ReactionAddedEvent eventRequest) {
    ReactionAddedEvent event = new ReactionAddedEvent(eventRequest.getCommentId(),
            eventRequest.getPostId(), eventRequest.getReactionId());
    eventStore.addEvent(event);
    return event;
  }

  public ReactionRemovedEvent removeReaction(String reactionId) {
    ReactionRemovedEvent event = new ReactionRemovedEvent(reactionId);
    eventStore.addEvent(event);
    return event;
  }
}
