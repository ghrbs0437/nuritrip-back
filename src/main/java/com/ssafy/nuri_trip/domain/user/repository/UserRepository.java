package com.ssafy.nuri_trip.domain.user.repository;

import com.ssafy.nuri_trip.domain.user.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    User selectByUserId(String userId);
    User selectById(Long id);
    int insert(User user);
}
