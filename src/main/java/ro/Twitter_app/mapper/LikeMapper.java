package ro.Twitter_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.Twitter_app.model.DTO.LikeDTO;
import ro.Twitter_app.model.Like;

@Mapper(componentModel = "spring")
public interface LikeMapper {
    @Mapping(target = "likeId", source = "likeId")
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "postId", source = "post.postId")
    LikeDTO likeToLikeDTO(Like like);
}
