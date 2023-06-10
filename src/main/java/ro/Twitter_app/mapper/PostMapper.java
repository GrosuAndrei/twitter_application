package ro.Twitter_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.Twitter_app.model.DTO.PostDTO;
import ro.Twitter_app.model.Post;

import java.time.LocalDate;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "postId", source = "postId")
    @Mapping(target = "message", source = "postMessage")
    @Mapping(target = "date", source = "date")
    @Mapping(target = "userName", source = "user.userName")
    PostDTO postToPostDTO(Post post);

}
