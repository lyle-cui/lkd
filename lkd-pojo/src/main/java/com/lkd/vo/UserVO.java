package com.lkd.vo;

import com.lkd.entity.Role;
import com.lkd.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO extends User {
    private Role role;
}
