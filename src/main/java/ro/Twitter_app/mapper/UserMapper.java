package ro.Twitter_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.Twitter_app.model.DTO.UserDTO;
import ro.Twitter_app.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "userid", source = "userid")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "firstname", source = "firstname")
    @Mapping(target = "lastname", source = "lastname")
    @Mapping(target = "email", source = "email")
    UserDTO userToUserDTO(User user);
}
