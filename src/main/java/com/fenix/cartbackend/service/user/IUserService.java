package com.fenix.cartbackend.service.user;

import com.fenix.cartbackend.dto.UserDto;
import com.fenix.cartbackend.model.User;
import com.fenix.cartbackend.request.CreateUserRequest;
import com.fenix.cartbackend.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
