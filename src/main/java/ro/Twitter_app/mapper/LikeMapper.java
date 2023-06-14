package ro.Twitter_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.Twitter_app.model.DTO.LikeDTO;
import ro.Twitter_app.model.Like;

@Mapper(componentModel = "spring")
public interface LikeMapper {
    @Mapping(target = "likeid", source = "likeid")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "postid", source = "post.postid")
    LikeDTO likeToLikeDTO(Like like);
}
