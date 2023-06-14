package ro.Twitter_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.Twitter_app.model.DTO.ReplyDTO;
import ro.Twitter_app.model.Reply;

@Mapper(componentModel = "spring")
public interface ReplyMapper {
    @Mapping(target = "replyid", source = "replyid")
    @Mapping(target = "message", source = "replymessage")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "postid", source = "post.postid")
    ReplyDTO replyToReplyDTO(Reply reply);
}
