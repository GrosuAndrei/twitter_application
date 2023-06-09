package ro.Twitter_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.Twitter_app.model.DTO.ReplyDTO;
import ro.Twitter_app.model.Reply;

@Mapper(componentModel = "spring")
public interface ReplyMapper {
    @Mapping(target = "replyId", source = "replyId")
    @Mapping(target = "message", source = "replyMessage")
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "postId", source = "post.postId")
    ReplyDTO replyToReplyDTO(Reply reply);
}
